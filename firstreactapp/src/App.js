import logo from './logo.svg';
import './App.css';
import React from 'react'
import ReactDOM from 'react-dom'
import Menu from './component/Menu';
import { BrowserRouter, Route} from 'react-router-dom';
//import { Container } from 'reactstrap';
import Header from './component/Header';
import {Jumbotron} from 'reactstrap';




function App() {
  return (
   <BrowserRouter>
   <Header/>

   <Jumbotron>

  <div className="App">
    <h1></h1>
  <Route path="/" component={Menu} />
   
   </div>
   </Jumbotron>

   </BrowserRouter>
        
  );
}

export default App;
