import { Link } from "react-router-dom"
import { Banner } from './Banner'
import '../../../assets/styles/estilosInicio.css'


export const Inicio = () => {
  return (
    <main className="main-inicio">
		<Banner/>
		<section id="ofrecemos">
			<h2></h2>
			<div className="contenedor">
				<h3>¿QUÉ OFRECEMOS?</h3>
				<div className="grid1">
					<article className="item">
						<Link to="contacto?servicio=canceleria">
							<img loading="lazy" src="./assets/images/grid1/CANCELERIA.jpg" alt="CANCELERIA" className="gird1-img" />
							<div className="divgird1" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h4 className="gird1-title">Cancelería</h4>
								<i className="fas fa-hammer"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=pintura">
							<img loading="lazy" src="./assets/images/grid1/PINTURA.jpg" alt="PISOS" className="gird1-img" />
							<div className="divgird1" data-aos-useclassnames={false}data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h4 className="gird1-title">Pintura</h4>
								<i className="fas fa-hammer"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=cambiarpisos">
							<img loading="lazy" src="./assets/images/grid1/CAMBIARPISOS2.jpg" alt="PINTURA" className="gird1-img" />
							<div className="divgird1" data-aos-useclassnames={false}data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h4 className="gird1-title">Cambio de pisos</h4>
								<i className="fas fa-hammer"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=baño">
							<img loading="lazy" src="./assets/images/grid1/REMODELARBAÑO.jpg" alt="BAÑOS" className="gird1-img" />
							<div className="divgird1" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h4 className="gird1-title">Remodelación de baños</h4>
								<i className="fas fa-hammer"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=cocina">
							<img loading="lazy" src="./assets/images/grid1/REMODELARCOCINA.jpg" alt="COCINA" className="gird1-img" />
							<div className="divgird1" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h4 className="gird1-title">Remodelación de cocina</h4>
								<i className="fas fa-hammer"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=patio">
							<img loading="lazy" src="./assets/images/grid1/REMODELARPATIO.jpg" alt="PATIO" className="gird1-img" />
							<div className="divgird1" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h4 className="gird1-title">Remodelación de patio</h4>
								<i className="fas fa-hammer"></i>
							</div>
						</Link>
					</article>
				</div>
				<p><strong>CASA GUADALUPE, CULIACÁN.</strong></p>
			</div>
		</section>
		<section id="subcuentainf">
			<div className="contenedor">
				<h2>USA TU SALDO DE SUBCUENTA INFONAVIT</h2>
				<div className="grid2">
					<article className="item">
						<Link to="contacto?servicio=mejorfachada">
							<img loading="lazy" src="./assets/images/grid2/MEJORARFACHADA.jpg" alt="MEJORAR FACHADA" className="gird2-img" />
							<div className="divgird2" data-aos-useclassnames={false}data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird2-title">Mejor fachada</h3>
								<i className="far fa-smile-wink"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=recubrimientos">
							<img loading="lazy" src="./assets/images/grid2/RECUBRIMIENTOSINTERIORES.jpg" alt="RECUBRIMIENTOS INTERIORES" className="gird2-img" />
							<div className="divgird2" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird2-title">Recubrimientos interiores</h3>
								<i className="far fa-smile-wink"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=porton">
							<img loading="lazy" src="./assets/images/grid2/PORTON.jpg" alt="PORTON" className="gird2-img" />
							<div className="divgird2" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird2-title">Portón</h3>
								<i className="far fa-smile-wink"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=iluminacion">
							<img loading="lazy" src="./assets/images/grid2/ILUMINACIÓN2.jpg" alt="ILUMINACION" className="gird2-img" />
							<div className="divgird2" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird2-title">Iluminación</h3>
								<i className="far fa-smile-wink"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=herreria">
							<img loading="lazy" src="./assets/images/grid2/HERRERIA.jpg" alt="HERRERÍA" className="gird2-img" />
							<div className="divgird2" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird2-title">Protecciones herrería</h3>
								<i className="far fa-smile-wink"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=iluminacion">
							<img loading="lazy" src="./assets/images/grid2/ILUMINACIÓN3.jpg" alt="ILUMINACION" className="gird2-img" />
							<div className="divgird2" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird2-title">Iluminación</h3>
								<i className="far fa-smile-wink"></i>
							</div>
						</Link>
					</article>
				</div>
			</div>
		</section>
		<section id="contactanos">
			<div className="contenedor">
				<h2>CONTÁCTANOS</h2>
				<div className="grid3">
					<article className="item">
						<Link to="contacto?servicio=impermeabiliza">
							<img loading="lazy" src="./assets/images/grid3/IMPERMEABILIZAR.jpg" alt="IMPERMEABILIZAR" className="gird3-img" />
							<div className="divgird3" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird3-title">Impermeabiliza</h3>
								<i className="fas fa-hard-hat"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=impermeabiliza">
							<img loading="lazy" src="./assets/images/grid3/IMPERMEABILIZARAOTEA.jpg" alt="IMPERMEABILIZAR AOTEA" className="gird3-img" />
							<div className="divgird3" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird3-title">Impermeabiliza</h3>
								<i className="fas fa-hard-hat"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=protecciones">
							<img loading="lazy" src="./assets/images/grid3/PROTECCIONES.jpg" alt="PROTECCIONES" className="gird3-img" />
							<div className="divgird3" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird3-title">Protecciones herrería</h3>
								<i className="fas fa-hard-hat"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=aplanados">
							<img loading="lazy" src="./assets/images/grid3/APLANADOS.jpg" alt="APLANADOS" className="gird3-img"/>
							<div className="divgird3" data-aos-useclassnames={false }data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird3-title">Aplanados y recubrimientos</h3>
								<i className="fas fa-hard-hat"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=firmes">
							<img loading="lazy" src="./assets/images/grid3/FIRMES2.jpg" alt="FIRMES" className="gird3-img"/>
							<div className="divgird3" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird3-title">Firmes y pisos</h3>
								<i className="fas fa-hard-hat"></i>
							</div>
						</Link>
					</article>
					<article className="item">
						<Link to="contacto?servicio=firmes">
							<img loading="lazy" src="./assets/images/grid3/FIRMES.jpg" alt="FIRMES 2" className="gird3-img"/>
							<div className="divgird3" data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
								<h3 className="gird3-title">Firmes y pisos</h3>
								<i className="fas fa-hard-hat"></i>
							</div>
						</Link>
					</article>
				</div>
			</div>
		</section>
	</main>
  )
}