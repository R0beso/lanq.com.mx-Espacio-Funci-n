import { useEffect, useState } from "react";
import { Link, useLocation } from "react-router-dom";
import { getAñoActual } from '../helpers/Footer';

export const Footer = () => {
  
  const location = useLocation();
  const [esInicio, setEsInicio] = useState(true);

  useEffect(() => {
    switch (location.pathname) {
      case '/':
        setEsInicio(true);
        break;
      default:
        setEsInicio(false);
        break;
    }
  }, [location]);

  return (
    <>
      { esInicio ? (
        <FooterInicio />
      ):(
        <FooterAux />
      )}
    </>
  )
}

const FooterInicio = () => {
  return (
    <footer className="footer-inicio">
      <div className="contenedor">
        <p>LANQ - { getAñoActual() }</p>
        <div className="sociales">
          <Link className="fab fa-facebook-square" to="https://m.facebook.com/LANQ.espacio/" target="_blank" rel="noreferrer"></Link>
          <Link className="fab fa-whatsapp" to="/contacto"></Link>
          <Link className="fab fa-instagram" to="https://www.instagram.com/lanq.espacio1/?utm_medium=copy_link" target="_blank" rel="noreferrer"></Link>
        </div>
      </div>
    </footer>
  )
}

const FooterAux = () => {
  return (
    <footer className="footer-aux">
      <div className="contenedor">
        <h2>LANQ - { getAñoActual() }</h2>
        <p>Culiacán, Sinaloa. México</p>
      </div>
    </footer>
  )
}
