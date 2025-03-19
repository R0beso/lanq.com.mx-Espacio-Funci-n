
// Función para cargar la imagen si aún no se ha cargado
export function loadImage(img) {
    if (!img.src || img.src.indexOf('data:image') === 0) {
        img.src = img.dataset.src;
    }
}
  
export function configureIntersectionObserverAndLazyLoading() {
    // Configuramos IntersectionObserver si está disponible
    if ('IntersectionObserver' in window) {
        const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
            loadImage(entry.target);
            observer.unobserve(entry.target);
            }
        });
        });
        document.querySelectorAll('img.lazy').forEach(img => {
        observer.observe(img);
        });
    }
    // Fallback: Forzar la carga de imágenes después de 3 segundos
    setTimeout(() => {
        document.querySelectorAll('img.lazy').forEach(img => {
        loadImage(img);
        });
    }, 2200);
}
  
