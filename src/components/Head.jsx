import { Helmet } from 'react-helmet';

export const Head = () => {
  return (
    <Helmet>
      <meta charset="UTF-8" />
      <meta httpEquiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <title>LANQ</title>
      <link rel="icon" href="./assets/images/LogoCirSF1.ico" />
      <link rel="canonical" href="https://www.lanq.com.mx" />
      <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet" />
      <link rel="preconnect" href="https://fonts.googleapis.com" />
      <link rel="preconnect" href="https://fonts.gstatic.com" crossOrigin />
      <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:ital,wght@1,200&display=swap" rel="stylesheet" />
      <script src="https://kit.fontawesome.com/c5ce5d3d52.js" crossOrigin="anonymous"></script>
      <meta name="keywords" content="Norma Leticia Quintero Rojas, Sinaloa, Culiacán, LANQ, Arquitecta" />
      <meta name="description" content="Realiza mejoras a tu vivienda. SIN INVERTIR: recubrimientos interiores, portón, iluminación, protecciones herrería, para mas información clic aquí" />
      <meta name="author" content="R0beso" />
      <meta name="robots" content="index" />
      <meta name="google-site-verification" content="9d4wPcneO0kZUiO5A6SBOcxTE3OzhW4o262XD06KQoE" />
      {/*  <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-2128229300467881"
      crossorigin="anonymous"></script>  */}
    </Helmet>
  )
}
