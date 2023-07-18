
export const ocultarMenu = () => {
    const inputs = document.getElementsByTagName('input');
    const input = inputs[0]; 
    input.checked = false;
}
  
export const activarScrollYTitulo = (pathname) => {
    switch (pathname) {
        case '/':
            document.body.style.overflowY = 'scroll';
            document.title = "LANQ | Espacio & Función";
            break;
        case '/contacto':
            document.body.style.overflowY = 'hidden';
            document.title = "LANQ | Contacto";
            break;
        default:
            document.body.style.overflowY = 'hidden';
            document.title = "Página no encontrada";
            break;
    }
}
