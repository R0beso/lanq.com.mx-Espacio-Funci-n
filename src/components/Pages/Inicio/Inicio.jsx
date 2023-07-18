import { grid1Items, grid2Items, grid3Items } from "../../../helpers/Inicio";
import { GridItem } from "./GridItem";
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
					<GridItem id={1} gridItems={grid1Items}/>
					<p><strong>CASA GUADALUPE, CULIACÁN.</strong></p>
				</div>
			</section>
			<section id="subcuentainf">
				<div className="contenedor">
					<h2>USA TU SALDO DE SUBCUENTA INFONAVIT</h2>
					<GridItem id={2} gridItems={grid2Items}/>
				</div>
			</section>
			<section id="contactanos">
				<div className="contenedor">
					<h2>CONTÁCTANOS</h2>
					<GridItem id={3} gridItems={grid3Items}/>
				</div>
			</section>
		</main>
	)
}