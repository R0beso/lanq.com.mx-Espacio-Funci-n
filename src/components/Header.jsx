import { Link } from "react-router-dom"
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faMagnifyingGlass } from '@fortawesome/free-solid-svg-icons';

export const Header = () => {
  return (
    <header className="header">
		<div className="contenedor">
			<Link to='/'><img className="header-img" loading="lazy" src="./assets/images/LogoSF1.png" alt="Logo LANQ" /></Link>
			<h1 className="h1-contacto">LANQ | Espacio & Función</h1>
			<input type="checkbox" id="menu-bar" />
			<label className="fas fa-bars" htmlFor="menu-bar"></label>
			<nav className="menu" htmlFor="m">
				<Link to='/'>Inicio</Link>
				<Link to='/contacto'>Contacto</Link>
				<a href="https://www.google.com/search?q=site%3Alanq.com.mx"><FontAwesomeIcon icon={faMagnifyingGlass} /></a>
			</nav>
		</div>
	</header>
  )
}
