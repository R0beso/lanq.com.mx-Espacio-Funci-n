
export const getServicioURL = (location) => {
	const params = new URLSearchParams(location.search);
	return params.get('servicio') || 'edificio';
}

export const datosServicios = (servicio) => {
  const porDefecto = {complRuta: "Edificio.png", txt: false};
  const imagenServicio = {
    canceleria: { complRuta: "grid1/CANCELERIA.jpg", txt: "Cancelería" },
    pintura: { complRuta: "grid1/PINTURA.jpg", txt: "Pintura" },
    cambiarpisos: { complRuta: "grid1/CAMBIARPISOS.jpg", txt: "Cambio de pisos" },
    baño: { complRuta: "grid1/REMODELARBAÑO.jpg", txt: "Remodelación de baños" },
    cocina: { complRuta: "grid1/REMODELARCOCINA.jpg", txt: "Remodelación de cocina" },
    patio: { complRuta: "grid1/REMODELARPATIO.jpg", txt: "Remodelación de patio" },
    mejorfachada: { complRuta: "grid2/MEJORARFACHADA.jpg", txt: "Mejor fachada" },
    recubrimientos: { complRuta: "grid2/RECUBRIMIENTOSINTERIORES.jpg", txt: "Recubrimiento de interiores" },
    porton: { complRuta: "grid2/PORTON.jpg", txt: "Portón" },
    iluminacion: { complRuta: "grid2/ILUMINACIÓN3.jpg", txt: "Iluminacion" },
    herreria: { complRuta: "grid2/HERRERIA.jpg", txt: "Protecciones herrería" },
    impermeabiliza: { complRuta: "grid3/IMPERMEABILIZARAOTEA.jpg", txt: "Impermeabiliza" },
    protecciones: { complRuta: "grid3/PROTECCIONES.jpg", txt: "Protecciones herrería" },
    aplanados: { complRuta: "grid3/APLANADOS.jpg", txt: "Aplanados y recubrimientos" },
    firmes: { complRuta: "grid3/FIRMES.jpg", txt: "Firmes y pisos" },
  };
  return imagenServicio[servicio] || porDefecto ;
}
