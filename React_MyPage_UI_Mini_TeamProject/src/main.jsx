import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import MyPage from './MyPage.jsx'

createRoot(document.getElementById('root')).render(
  <MyPage />
)
