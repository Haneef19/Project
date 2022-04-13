import React from "react";
import mystore from "./store";
import Login from './Login'
import CustomerRegister from "./CustomerRegister";
import TruckOwnerRegister from "./TruckOwnerRegister";
import { BrowserRouter,Route,Link} from "react-router-dom";
import TruckOwnerHome from './TRuckOwnerHome'
import CustomerHome from './CustomerHome'
import Home from'./Home'
import { ListGroup } from "reactstrap";
import Contact from './Contact';
import ViewOrder from "./ViewOrder";
//import { Route } from 'react-router';

export default class Menu extends React.Component{
constructor(props)
{
  super(props);
      this.state={

        flag:false
    }
  
}

render()
    
  {  mystore.subscribe(()=>{this.setState({flag:mystore.getState().loggedin})})
  return(
    
  
<div className="container">
            <BrowserRouter>
                <div className="main"style={{display:this.state.flag?'none':'block'}}>
                    <ul className="nav">

                       <li className="nav-items"><Link  className="nav-link" to="/login"><h4><b>SignIn</b></h4></Link></li>
                        <li className="nav-items"> <Link  className="nav-link" to="/cregister"><h4><b>Customer Register</b></h4></Link></li>
                        <li className="nav-items"> <Link  className="nav-link" to="/tregister"><h4><b>Truck Owner Register</b></h4></Link></li>
                        <li className="nav-items"> <Link  className="nav-link" to="/about"><h4><b>Contact</b></h4></Link></li>

                    </ul>
                    <div>
                        <Route path="/login" component={Login}></Route>
                        <Route path="/cregister" component={CustomerRegister}></Route>
                        <Route path="/tregister" component={TruckOwnerRegister}></Route>
                        <Route path="/about" component={Contact}></Route>
                    </div>

                </div>
                <Route path="/truckownerhome" component={TruckOwnerHome}></Route>
                <Route path="/ViewOrder" component={ViewOrder}></Route>
                <Route path="/customerhome" component={CustomerHome}></Route>

           </BrowserRouter>
           </div>
        )
    }
}
