//require('dotenv').config();
const express = require('express');

const app = express();
const port = 3108;

// Servir contenido estatico
app.use( express.static('public') );

app.get('/contacto', (req, res) => {
  res.sendFile('/root/app2/public/contacto.html');
});

app.get('/download-java-house', (req, res) => {
  res.download('/root/app2/public/AnimacionCasa.java', 'AnimacionCasa.java', (err) => {
    if (err) {
      console.error('Error al descargar el archivo:', err);
      res.status(500).send('Error al descargar el archivo');
    }
  });
});

app.get('/help', (req, res) => {
  res.send('Mensajes enviados con res.send(): /help, /node - mensaje json: /json - req.ip: /ip');
});

app.get('/node', (req, res) => {
  res.send('Node app listening at https://lanq.com.mx:3108/')
})

app.get('/json', (req, res) => {
  res.json({
    mensaje: `Respuesta JSON con res.json()
    req.method: Método HTTP de la solicitud (GET, POST, etc.).
    req.url: URL de la solicitud.
    req.headers: Encabezados de la solicitud.
    res.statusCode: Código de estado de la respuesta.`,
    metodo: req.method,
    url: req.url,
    headers: req.headers,
    estado: res.statusCode
  });
});

app.get('/ip', (req, res) => {
  const ip = req.ip;
  res.send(`IP del cliente: ${ip}`);
});

app.get('/horario', (req, res) => {
    return res.redirect('/off-topic-app-java?type=html');
});

// Ruta donde se encuentran los archivos de "/horario"
const jarFilePath = '/root/app2/public/app-horario.jar';
//const jnlpFilePath = '/root/app2/public/HorarioExportar.jnlp';
const htmlFilePath = '/root/app2/public/horario-logica-difusa.html';

// Endpoint para manejar diferentes tipos de descargas
app.get('/off-topic-app-java', (req, res) => {

  if (!req.query.type) {
    return res.redirect('/off-topic-app-java?type=html');
  }

  const type = req.query.type;

  if (type === 'jar') {
    res.download(jarFilePath, 'app-horario.jar', (err) => {
      if (err) {
        console.error('Error al enviar el archivo:', err);
        res.status(500).send('Error al descargar el archivo .jar.');
      }
    });
  } /*
  else if (type === 'jnlp') {
    res.download(jnlpFilePath, 'HorarioExportar.jnlp', (err) => {
      if (err) {
        console.error('Error al enviar el archivo:', err);
        res.status(500).send('Error al descargar el archivo .jnlp.');
      }
    });
  } */
  else if (type === 'html') {
    res.sendFile(htmlFilePath, (err) => {
      if (err) {
        console.error('Error al enviar el archivo:', err);
        res.status(500).send('Error al enviar el archivo HTML.');
      }
    });
  } else {
    res.status(400).send('Tipo de archivo no válido.');
  }
});

app.get('*', (req, res) => {
  res.sendFile('/root/app2/public/404.html');
});

app.listen(port, () => {
  console.log(`App listening at https://lanq.com.mx:${port}/`)
})
