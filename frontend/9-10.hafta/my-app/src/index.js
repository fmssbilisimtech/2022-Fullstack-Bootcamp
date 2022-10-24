import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import 'bootstrap/dist/css/bootstrap.min.css';
import {BrowserRouter, Routes, Route }from 'react-router-dom';
import Table from './Table';
import Buton from './Buton';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
    <Routes>
      <Route exact path='/' element={<App/>}>
    
    </Route>

    <Route exact path='/product' element={<Table/>} >
    
    </Route>

    <Route exact path='/product-detail' element={<Buton/>}>
  
    </Route>

    </Routes>
    </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals

