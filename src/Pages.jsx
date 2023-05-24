import { Routes, Route, useLocation } from "react-router-dom"
import { Inicio, Contacto, Pagina404 } from "./components"
import { useEffect } from "react"
import { ocultarMenu, activarScrollYTitulo } from "./helpers/Pages"

export const Pages = () => {
  const location = useLocation();
  
  useEffect(() => {
    ocultarMenu();
    activarScrollYTitulo(location.pathname);
  }, [location]);

  return (
    <Routes>
      <Route path="/" element={<Inicio />} />
      <Route path="/contacto" element={<Contacto />} />
      <Route path="*" element={<Pagina404 />} />
    </Routes>
  )
}
