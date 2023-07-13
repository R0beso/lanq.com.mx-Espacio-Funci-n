import ReactDOM from 'react-dom/client'
import { Head, Header, Footer } from './components'
import { Pages } from './Pages.jsx'
import { HashRouter } from 'react-router-dom'
import './assets/styles/normalize.css'


ReactDOM.createRoot(document.getElementById('LANQ')).render(
  <HashRouter>
    {/* Head */}
    <Head />
    {/* Body */}
    <Header />
    <Pages  />
    <Footer />
  </HashRouter>,
)
