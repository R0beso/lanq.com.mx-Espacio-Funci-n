
// Eclipse Java Project, JRE System Library [JavaSE-15+]

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;


public class Main extends JFrame implements ActionListener  {

	private static final long serialVersionUID = 1L;
	private JButton boton1;
	private JButton boton2;
	private Horario horario;
	private JLabel etiqResultados1;
	private JLabel etiqResultados2;
	private JLabel etiqPromedio;
	private FunctionBlock fb;
	
    public static void main(String[] args) {
    	new Main();
    }
    
    public Main() {
    	super("Evaluar horarios de estudiantes");
    	fb = new FunctionBlock(null);
    	creaVentanaPrincipal();
    	nuevoHorario();
    }
    
    public void creaVentanaPrincipal() {
    	boton1 = new JButton("Generar otro horario");
    	boton2 = new JButton("Mostrar gráficas de entrada");
    	etiqResultados1 = new JLabel();
    	etiqResultados2 = new JLabel();
    	etiqPromedio = new JLabel();
    	
        this.add(boton1);
        this.add(boton2);
        this.add(etiqResultados1);
        this.add(etiqResultados2);
        this.add(etiqPromedio);
        
        this.setLayout(null);
        this.setSize(430, 560);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        boton1.setBounds(25, 15, 150, 25);
        boton2.setBounds(195, 15, 195, 25);
        etiqResultados1.setBounds(98, 427, 250, 15);
        etiqResultados2.setBounds(65, 445, 300, 15);
        etiqPromedio.setBounds(150, 462, 150, 25);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == boton1) {
    		nuevoHorario();
    		repaint();
        }
    	else if (e.getSource() == boton2) {
            JFuzzyChart.get().chart(fb);
        }
    }
    
    public void paint(Graphics g) {
		super.paint(g);
		etiqResultados1.setText(horario.getMateriasCargadasYHorasLibres());
		etiqResultados2.setText(horario.getHoraDeEntradaYPromedio());
		etiqPromedio.setText("Calificación: " + horario.getCalificacion()+"/100");
		horario.graficar(g);
    }
    
    public void nuevoHorario() {
		horario = new Horario();
		aplicaLogicaDifusa();
    }
    
    // Clase horario
	private class Horario {
	
		private Random r;
		private int materiasCargadas;
		private int horasLibres;
		private int horaDeEntrada;
		private int[] horario;
		private int calificacion;
		
		public Horario() {
			this.r = new Random();
			this.materiasCargadas = generaMateriasCargadas();
			this.horasLibres = generaHorasLibres();
			this.horaDeEntrada = generaHoraDeEntrada();
			this.horario = generaHorarioRandom();
		}
		
		private int generaMateriasCargadas() {
			
			int materiasCargadas = 0;
			double nAleatorio = r.nextDouble();
			
			if(nAleatorio < 0.1) {
				if(nAleatorio < 0.05) materiasCargadas = 3;
				else materiasCargadas = 4;
				
			} else if(nAleatorio < 0.3) {
				if(nAleatorio < 0.2) materiasCargadas = 5;
				else materiasCargadas = 8;
				
			} else {
				if(nAleatorio < 0.65) materiasCargadas = 6;
				else materiasCargadas = 7;
			}
			return materiasCargadas;
		}
		
		private int generaHorasLibres() {
	
			double nAleatorio = r.nextDouble();
			int horasLibres = 0;
			
			if(nAleatorio < 0.1) {
				if (nAleatorio < 0.33) horasLibres = 3;
				else if (nAleatorio < 0.66) horasLibres = 4;
				else horasLibres = 5;
				
			} else if(nAleatorio < 0.2) {
				horasLibres = 2;
				
			} else {
				if (nAleatorio < 0.6) horasLibres = 1;
				else horasLibres = 0;
			}
			return horasLibres;
		}
		
		private int generaHoraDeEntrada() {
	
			int horaEntrada = 0;
			double nAleatorio;
			do {
				nAleatorio = r.nextDouble();
				
				if(nAleatorio < 0.3) {
					
					if(nAleatorio < 0.15) horaEntrada = 7;
					else horaEntrada = 8;
					
				} else if(nAleatorio < 0.5) {
		
					if(nAleatorio < 0.35) horaEntrada = 9;
					if(nAleatorio < 0.4) horaEntrada = 10;
					if(nAleatorio < 0.45) horaEntrada = 11;
					else horaEntrada = 12;
					
				} else if(nAleatorio < 0.8) {
					
					if(nAleatorio < 0.65) horaEntrada = 13;
					else horaEntrada = 14;
					
				} else {
					
					if(nAleatorio < 0.866) horaEntrada = 15;
					if(nAleatorio < 0.933) horaEntrada = 16;
					else horaEntrada = 17;
				}
			}while((materiasCargadas+horasLibres+horaEntrada)>=21);
			return horaEntrada;
		}
		
		private int[] generaHorarioRandom() {
			
			horario = new int[13];
			int asignar = materiasCargadas+horasLibres;
			int materiasPorBorrar = horasLibres;
			int posicion = horaDeEntrada-6;
			
			for(int i =0; i<horario.length; i++) {
				horario[i] = -1;
				if(asignar > 0 && i >=  horaDeEntrada-7) {
					horario[i] = generaExigenciaProfesor();
					asignar--;
				}
			}
			
			while(materiasPorBorrar > 0) {
	
				if(posicion == horaDeEntrada+materiasCargadas+horasLibres-8) {
					posicion = horaDeEntrada-6;
				}
				if (r.nextInt(5) == 0 && horario[posicion] != -1) {
					horario[posicion] = -1;
					materiasPorBorrar--;
				}
				posicion++;
			}
			
			return horario;
		}
	
		private int generaExigenciaProfesor() {
			double nAleatorio = r.nextDouble();
			int exigencia = 0;
			
			if(nAleatorio < 0.8) {
				exigencia = r.nextInt(40)+31;
				
			} else if(nAleatorio < 0.95) {
				if(nAleatorio < 0.875) exigencia = r.nextInt(20)+11;
				else exigencia = r.nextInt(20)+71;
				
			} else {
				if(nAleatorio < 0.975) exigencia = r.nextInt(11);
				else exigencia = r.nextInt(10)+91;
			}
			return exigencia;
		}
		
		public void graficar(Graphics g) {
			
			Font font = new Font("Calibri", Font.PLAIN, 20);
		    g.setFont(font);
	
			g.setColor(new Color(188,188,188));
			g.drawRect(30, 447, 370, 75);
			
			g.setColor(new Color(248,248,248));
			g.fillRect(30, 85, 370, 350);
			
			g.setColor(new Color(34,42,53));
			g.fillRect(30, 85, 370, 25);
	
			g.setColor(new Color(238,238,238));
			g.drawRect(30, 85, 70, 350);
			for(int i=0; i<5; i++) {
				g.drawRect(100, 85, 60+(i*60), 350);
			}
			
			for(int i=0; i<horario.length; i++) {
				g.setColor(new Color(34,42,53));
				if (horario[i] != -1) {
					pintarMateria(i, g);
				}
			}
			
			pintarFondoHora(g);
			for(int i=0; i<horario.length; i++) {
				g.drawString((i+7)+":00", 43, 130+(i*25));
			}
			
			for(int i=0; i<14; i++) {
				g.setColor(new Color(238,238,238));
				g.drawRect(30, (85+(i*25)), 370, 25);
			}
	
			g.drawLine(100, 85, 100, 435);
			
		}
		
		private void pintarMateria(int i, Graphics g) {
			if (horario[i] < 16 || (horario[i]>82 && horario[i] <= 100)) {
				g.setColor(new Color(196, 89, 17));
				g.fillRect(30, (110+(i*25)), 370, 25);
				g.setColor(Color.WHITE);
			    g.drawString("Exigencia del profesor "+horario[i]+"%", 125, 130+(i*25));
			}
			else if (horario[i]>34 && horario[i] < 67) {
				g.setColor(new Color(56, 86, 36));
				g.fillRect(30, (110+(i*25)), 370, 25);
				g.setColor(Color.WHITE);
			    g.drawString("Exigencia del profesor "+horario[i]+"%", 125, 130+(i*25));
			}
			else {
				g.setColor(new Color(255, 192, 0));
				g.fillRect(30, (110+(i*25)), 370, 25);
				g.setColor(Color.BLACK);
			    g.drawString("Exigencia del profesor "+horario[i]+"%", 125, 130+(i*25));
			}
		}
		
		private void pintarFondoHora(Graphics g) {
			
			if ( calificacion < 65 ) {
				g.setColor(new Color(196, 89, 17));
				g.fillRect(30, 85, 70, 350);
				g.setColor(Color.WHITE);
				
			} else if ( calificacion < 85 ) {
				g.setColor(new Color(255, 192, 0));
				g.fillRect(30, 85, 70, 350);
				g.setColor(Color.BLACK);
				
			} else {
				g.setColor(new Color(56, 86, 36));
				g.fillRect(30, 85, 70, 350);
				g.setColor(Color.WHITE);
			}
		}
	
		public int getMateriasCargadas() {
			return materiasCargadas;
		}
	
		public int getHorasLibres() {
			return horasLibres;
		}
		
		public String getMateriasCargadasYHorasLibres() {
			return "Materias cargadas: "+materiasCargadas
					+"      \tHoras libres: "+horasLibres;
		}
	
		public int getHoraDeEntrada() {
			return horaDeEntrada;
		}
	
		public int getPromedioDeExigenciaProfesores() {
			
			int promedio = 0;
			for(int i =0; i<horario.length; i++) {
				if(horario[i] != -1) {
					promedio += horario[i];
				}
			}
			return promedio / materiasCargadas;
			
		}
		
		public String getHoraDeEntradaYPromedio() {
			return "Hora de entrada: "+horaDeEntrada
					+"      \tPromedio de exigencia: "
					+getPromedioDeExigenciaProfesores()+"%";
		}
	
		public int getCalificacion() {
			return calificacion;
		}
	
		public void setCalificacion(int calificacion) {
			this.calificacion = calificacion;
		}
		//Termina clase Horario
	}
	
    public void aplicaLogicaDifusa() {
        try {
            // Cadena FCL en lugar de leer un archivo .fcl
            String fuzzyLogicString = 
            """
                FUNCTION_BLOCK fcl
                
                VAR_INPUT
                    materiasCargadas : REAL; // (3 a 8)
                    horasLibres : REAL;     // (0 a 6)
                    horaDeEntrada : REAL;   // (7 a 17)
                    promedioDeExigenciaProfesores : REAL;  // (0 a 100)
                END_VAR
                
                VAR_OUTPUT
                    // (0 a 100)
                    calificacionHorarioRango33a67 : REAL;
                END_VAR
                
                FUZZIFY materiasCargadas
                    TERM pocas := (2.5, 0) (2.5, 1) (3.8, 1) (5.3, 0);
                    TERM buenas := (2.5, 0) (4.5, 0.1) (5.5, 1) (6.8, 1) (7.5, 0.1) (8.5, 0);
                    TERM elMaximo := (7.5, 0) (7.8, 1) (8.5, 1) (8.5, 0);
                END_FUZZIFY
                
                FUZZIFY horasLibres
                    TERM ningunaOUna := (-0.5, 0) (-0.5, 1) (0.9, 1) (2.4, 0.2) (5.5, 0);
                    TERM muchas := (-0.5, 0) (1.4, 0.1) (4.2, 1) (5.5, 1) (5.5, 0);
                END_FUZZIFY
                
                FUZZIFY horaDeEntrada
                    TERM matutino := (6.5, 0) (6.5, 1) (7.9, 1) (10.6, 0);
                    TERM mixto := (8.5, 0) (9.5, 1) (10.5, 1) (12.5, 0);
                    TERM vespertino := (10.4, 0) (12.5, 1) (17.5, 1) (17.5, 0);
                END_FUZZIFY
                
                FUZZIFY promedioDeExigenciaProfesores
                    TERM barcos := (-0.5, 0) (-0.5, 1) (50, 0);
                    TERM moderado := (-0.5, 0) (50, 1) (100.5, 0);
                    TERM estrictos := (50, 0) (100.5, 1) (100.5, 0);
                END_FUZZIFY
                
                DEFUZZIFY calificacionHorarioRango33a67
                    TERM malo := (0, 0) (0, 1) (100, 0);
                    TERM bueno := (0, 0) (100, 1) (100, 0);
                    METHOD : COG;
                END_DEFUZZIFY
                
                RULEBLOCK No1
                
                    RULE 1 : IF ((materiasCargadas IS pocas) OR (materiasCargadas IS elMaximo)) AND (horasLibres IS muchas) AND (horaDeEntrada IS mixto) AND ((promedioDeExigenciaProfesores IS barcos) OR (promedioDeExigenciaProfesores IS estrictos)) THEN calificacionHorarioRango33a67 IS malo;
                    RULE 2 : IF materiasCargadas IS buenas AND horasLibres IS ningunaOUna AND (horaDeEntrada IS matutino OR horaDeEntrada IS vespertino) AND promedioDeExigenciaProfesores IS moderado THEN calificacionHorarioRango33a67 IS bueno;
                
                END_RULEBLOCK
                
                END_FUNCTION_BLOCK
            """; 

            FIS fis = FIS.createFromString(fuzzyLogicString, true);
            fb = fis.getFunctionBlock(null);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        // Asignar valores a las variables de entrada
        fb.setVariable("materiasCargadas", horario.getMateriasCargadas());
        fb.setVariable("horasLibres", horario.getHorasLibres());
        fb.setVariable("horaDeEntrada", horario.getHoraDeEntrada());
        fb.setVariable("promedioDeExigenciaProfesores", horario.getPromedioDeExigenciaProfesores());

        // Evaluar el sistema difuso
        fb.evaluate();

        // Obtener la salida (calificacionHorario) para uso posterior
        Variable calificacionHorario = fb.getVariable("calificacionHorarioRango33a67");
        // Ajusta al rango /100, (33.3 - 66.6) -> (0 - 100)
        horario.setCalificacion((int)(calificacionHorario.getValue() - 33.3) * 3);
    }

}




