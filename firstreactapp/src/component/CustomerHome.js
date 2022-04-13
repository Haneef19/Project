import React from "react";
import mystore from "./store";
import {BrowserRouter, Link,Route} from 'react-router-dom';
import Order from "./Order";
import UpdateCustomer from "./UpdateCustomer";
import ViewTruck from "./ViewTruck";
import ViewOrder from "./ViewOrder";
import Booking from './Booking'
import ViewBooking from "./ViewBooking";

class CustomerrHome extends React.Component{
constructor(props)
{
    super(props);
    this.state={

        flag:false
    }
}

logout=()=>{

    mystore.dispatch({type:'LOGGEDOUT'});
    localStorage.removeItem("loggedinuser");
    this.props.history.push("/")
}

    render(){
        
   return(
       
<div>
    <h1>Welcome,{JSON.parse(localStorage.getItem("loggedinuser")).name}</h1>

    
    <BrowserRouter>
      
      <Link to="/viewt">View Trucks</Link><br/>
      <Link to="/update">Update Profile</Link><br/>
      <Link to="/view">View order</Link><br/>
      <Link to="/order">Create Order</Link><br/>
  

   <a href="#" onClick={this.logout}>Logout</a>
 
   <Route path="/viewt" component={ViewTruck} />
   <Route path="/order" component={Order} />
   <Route path="/book" component={Booking} />
   <Route path="/viewbook" component={ViewBooking} />
   <Route path="/view" component={ViewOrder} />
   <Route path="/update" component={UpdateCustomer} />
     
    
</BrowserRouter>


</div>


   );


    }



}

export default CustomerrHome;