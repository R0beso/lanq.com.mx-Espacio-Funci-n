import '../../../assets/styles/estilosContacto.css'

export const Contacto = () => {
	return (
		<main className="main-contacto-404">
			<section className="grid-contacto-404">
				<h2>CONTÁCTANOS</h2>
				<article>
					<a href="https://api.whatsapp.com/send?phone=526672238170" target="_blank" rel="noreferrer">
						<div id="wp" className="redes">
						<i className="fab fa-whatsapp"></i>
						<h3>(667) 223 8170</h3>
						</div>
					</a>
				</article>
				<article>
					<a href="https://m.facebook.com/LANQ.espacio/" target="_blank" rel="noreferrer">
						<div id="fb" className="redes">
							<i className="fab fa-facebook-square"></i>
							<h3>LANQ.espacio</h3>
						</div>
					</a>
				</article>
				<article>
					<a href="https://www.instagram.com/lanq.espacio1/?utm_medium=copy_link" target="_blank" rel="noreferrer">
						<div id="ig" className="redes">
							<i className="fab fa-instagram"></i>
							<h3>@lanq.espacio1</h3>
						</div>
					</a>
				</article>
				<article>
					<a href="https://outlook.live.com/" target="_blank" rel="noreferrer">
						<div id="em" className="redes">
							<i className="fas fa-envelope"></i>
							<h3>norma.quintero@outlook.com</h3>
						</div>
					</a>
				</article>
			</section>
			<section>
				<img id="img" src="./assets/images/Edificio.png" alt="Edificio" />
			</section>
		</main>
	)
}
