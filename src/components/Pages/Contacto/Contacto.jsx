
import { Redes } from './Redes.jsx'
import '../../../assets/styles/estilosContacto.css'

export const Contacto = () => {
	return (
		<main className="main-contacto-404">
			<section className="grid-contacto-404">
				<h2>CONTÁCTANOS</h2>
                <Redes />
			</section>
			<section>
				<img id="img" src="./assets/images/Edificio.png" alt="Edificio" />
			</section>
		</main>
	)
}