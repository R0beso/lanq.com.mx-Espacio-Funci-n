import ReactDOM from 'react-dom/client'
import { Head, Header, Footer } from './components'
import { Pages } from './Pages.jsx'
import { BrowserRouter } from 'react-router-dom'
import './assets/styles/normalize.css'


ReactDOM.createRoot(document.getElementById('LANQ')).render(
  <BrowserRouter>
    <Head />
    <Header />
    <Pages  />
    <Footer />
  </BrowserRouter>,
)
