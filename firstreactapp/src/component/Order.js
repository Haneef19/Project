import React from "react";
import mystore from "./store";
class Order extends React.Component {

    constructor(props)
    {
   super(props);
    this.state={
        
         source_add:"",
          dest_add:"",
          m_weight:"",
          start_date:"",
          end_date:"",
          m_qty:"",
          m_price:"",
          status:"",  
          order:{}
    }  
     
  }

  handleChange=(e)=>{
const nm=e.target.name;
const val=e.target.value;
this.setState({[nm] :val});

  }

  
submitInfo=(event)=>{
  event.preventDefault();
  alert("Order Processing");
const requestOptions={
method:'POST',
headers : {

  'Content-Type' :'application/JSON'
},
body : JSON.stringify({

    source_add:this.state.source_add,
    dest_add:this.state.dest_add,
    start_date:this.state.start_date,
    end_date:this.state.end_date,
    m_weight:this.state.m_weight,
    m_qty:this.state.m_qty,
    m_price:this.state.m_price,
    status:this.state.status,
    
    customer:JSON.parse(localStorage.getItem('loggedinuser')),
   
})
};
fetch("http://localhost:8080/order",requestOptions)

.then(res=> res.json())

.then(data=>this.setState({order:data}))
alert("Order Submited");
}

 
render()
{
return(
   <div>
<h1> Enter Order details</h1>
  <form>
   Enter Source Address: <input type="text" name="source_add" onChange={this.handleChange}/><br/>
    Enter Destination Address : <input type="pwd" name="dest_add" onChange={this.handleChange}/><br/>
    Enter Start Date : <input type="date" name="start_date" onChange={this.handleChange}/><br/>
    Enter End Date : <input type="date" name="end_date" onChange={this.handleChange}/><br/>
    Enter Material Weight : <input type="text" name="m_weight" onChange={this.handleChange}/> in kg<br/>
    Enter Material Quantity: <input type="text" name="m_qty" onChange={this.handleChange}/><br/>
    Enter Material Price : <input type="text" name="m_price" onChange={this.handleChange}/><br/>
    {/* Enter status : <input type="text" name="status" onChange={this.handleChange}/><br/> */}
    
    <input type="submit" onClick={this.submitInfo} value="Create an Order"/>
   </form>
   <br/>
   <p>{this.state.order.order_id } is inserted</p>



   </div>





);

}

}
export default Order;