
import { useLocation } from 'react-router-dom';
import { Redes } from './Redes.jsx'
import { getServicioURL, datosServicios } from "../../../helpers/Contacto.js";
import '../../../assets/styles/estilosContacto.css'

export const Contacto = () => {
	
	const servicio = getServicioURL(useLocation());
	const { complRuta , txt } = datosServicios(servicio);

	return (
		<main className="main-contacto">
			<section className="grid-contacto">
				<h2>CONTÁCTANOS</h2>
                <Redes />
			</section>
			<section className="section-img">
				<img id="img" src={`./assets/images/${complRuta}`} alt={servicio} />
				{ ( txt && window.innerWidth >= 1024) && <h3 className="img-titulo">{txt}</h3>}
			</section>
		</main>
	)
}