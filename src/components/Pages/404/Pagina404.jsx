import { Link } from "react-router-dom";
import '../../../assets/styles/estilosContacto.css'
import '../../../assets/styles/estilos404.css'

const MENSAJE_404_1 = '¡Oops! Esta página no ha sido encontrada :(';
const MENSAJE_404_2 = 'Parece que la página que estás buscando no existe o no es accesible.';

export const Pagina404 = () => {
  return (
    <main className="main-contacto-404 main-404">
      <section className="grid-contacto-404">
          <h2>{MENSAJE_404_1}</h2>
          <p>{MENSAJE_404_2}</p>
          <article>
              <Link to="/">
                  <div id="wp" className="redes">
                      <h3>Ir al inicio</h3>
                  </div>
              </Link>
          </article>
      </section>
      <section>
          <img id="img" src="./assets/images/404.png" alt="404" />
      </section>
    </main>
  )
}
