import React from "react";
import mystore from "./store";
import ViewTruck from "./ViewTruck";

class Order extends React.Component {

    constructor(props)
    {
   super(props);
    this.state={

      order_id:"",
      truck_id:"",
    booking:{}
    }  
     
  }
  handleChange=(e)=>{
    const nm=e.target.name;
    const val=e.target.value;
    this.setState({[nm] :val});
    
      }
   
submitInfo=(event)=>{

  event.preventDefault();
  alert("called");
const requestOptions={
method:'POST',
headers : {

  'Content-Type' :'application/JSON'
},
body : JSON.stringify({

  order_id:this.state.order_id,
  truck_id:this.state.truck_id
    
})
};
/*fetch("http://localhost:8080/book/order_id="+o+"&truck_no="+truck_id,requestOptions)*/
fetch("http://localhost:8080/book" ,requestOptions)
.then(res=> res.json())
.then(data=>this.setState({booking:data}))
}

 
render()
{
return(
   <div>
     Welcome to booking
    <ViewTruck oid={this.props.location.state.oid}/>
    {this.props.location.state.oid}

   

   </div>





);

}

}
export default Order;