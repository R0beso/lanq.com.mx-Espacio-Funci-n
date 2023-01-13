const express = require('express');

const app = express()
const port = 8081;


app.use( express.static('public') );

app.get('/contacto', (req, res) => {
    res.sendFile(__dirname+'/public/contacto.html')
})


app.get('*', (req, res) => {
    res.sendFile(__dirname+'/public/404.html')
})


app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`)
})