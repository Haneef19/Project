import React from "react";
import mystore from "./store";
import { BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import view from "./view";
import ViewOrder from "./ViewOrder";
import Booking from './Booking';
import ViewBooking from "./ViewBooking";
// class TruckOwnerHome extends React.Component{
// constructor(props)
// {
//     super(props);
// }

class TruckOwnerHome extends React.Component{
    constructor(props)
    {
        super(props);
        this.state={
           
            flag:false
            
        }
        this.ViewOrder=this.ViewOrder.bind(this)
    }
    ViewOrder=(e)=>{

        this.props.history.push("/ViewOrder")
    }
    

logout=(e)=>{

    mystore.dispatch({type:'LOGGEDOUT'});
    localStorage.removeItem("loggedinuser");
    this.props.history.push("/")
}
    render(){
   return(
<div>
<h1> Welcome, {JSON.parse(localStorage.getItem("loggedinuser")).name}</h1>

    {/* <a href="/ViewOrder">View Orders</a><br/> */}
    {/* <a href="#" onClick={this.ViewOrder}>ViewOrder</a> */}
    <a href="#" onClick={this.logout}>Logout</a>
    <button className="btn btn-primary align-right" onClick={this.ViewOrder}>ViewOrder</button>


    {/* <Route path="/ViewOrder" component={ViewOrder} /> */}
    
</div>



   );


    }



}

export default TruckOwnerHome;