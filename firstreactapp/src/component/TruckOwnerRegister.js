import React from "react";
import mystore from "./store";
export default class TruckOwnerRegister extends React.Component {

    constructor(props)
    {
   super(props);
    this.state={
          uid:"",
          pwd:"",
          reg_date:"",
          reg_amt:"",
          truck_no:"",
         name:"",
         address:"",
         source:"",
         destination:"",
         contact:"",
         availability_status:"",
         truckowner:{}
    }  
     
  }

  handleChange=(e)=>{
const nm=e.target.name;
const val=e.target.value;
this.setState({[nm] :val});

  }

  
submitInfo=(event)=>{
  event.preventDefault();
  alert("Regstration in Progress");
const requestOptions={
method:'POST',
headers : {

  'Content-Type' :'application/JSON'
},
body : JSON.stringify({
    uid:this.state.uid,
    pwd:this.state.pwd,
    reg_date:this.state.reg_date,
    reg_amt:this.state.reg_amt,
    truck_no:this.state.truck_no,
    name:this.state.name,
    address:this.state.address,
    source:this.state.source,
    destination:this.state.destination,
    contact:this.state.contact,
    availability_status:this.state.availability_status
    
})
};
fetch("http://localhost:8080/registert",requestOptions)
.then(res=> res.json())
.then(data=>this.setState({truckowner:data}))
alert("Registered Sucessfully");
}

 
render()
{
return(
   
  <div className="container-fluid">
  {/* <h1 className="header">Customer Registration</h1><br/>*/}
   <h2 style={{color: "brown"}}>Truck Owner Registration </h2><br/>
   <form>
       <div className="form-group" class="col-md-4">
       <label className="lb"  for="uid"><b>User Name :</b></label>
       <input type="text" id="uid" className="form-control" name="uid" onChange={this.handleChange}/>
       </div>
       <div className="form-group" class="col-md-4">
       <label  className="lb"  for="pwd"><b>Password:</b></label>
       <input type="password" id="pwd" className="form-control" name="pwd" onChange={this.handleChange} />
       </div>

       <div className="form-group" class="col-md-4">
           <label  className="lb" for="reg_date">Registration date :</label>
           <input type="date" id="reg_date" className="form-control" name="reg_date" onChange={this.handleChange} />
           </div>
           <div className="form-group" class="col-md-4">
           <label  className="lb"  for="reg_amt">Registration Amount(year) :</label> 
           <input type="text" id="reg_amt" className="form-control" name="reg_amt"onChange={this.handleChange}  />
           
           </div>

           <div className="form-group" class="col-md-4">
           <label  className="lb"  for="truck_no">Truck No:</label>
           <input type="text" id="truck_no" className="form-control" name="truck_no"onChange={this.handleChange}  />
           </div>
            
           <div className="form-group" class="col-md-4" >
           <label  className="lb"   for="name">Full Name :</label>
           <input type="text" id="name" className="form-control" name="name" onChange={this.handleChange} />
           </div>

           <div className="form-group" class="col-md-4">
           <label  className="lb"   for="address">Address :</label>
           <input type="text"  id="address" className="form-control" name="address" onChange={this.handleChange} />
           </div>
           <div className="form-group" class="col-md-4">
           <label  className="lb"   for="source">Source :</label>
           <input type="text" id="source" className="form-control" name="source"onChange={this.handleChange} />
           </div>

       <div className="form-group"class="col-md-4">
       <label  className="lb"   for="destination">Destination :</label>
       <input type="text" id="destination" className="form-control" name="destination"onChange={this.handleChange} />
       </div>

       <div className="form-group"class="col-md-4">
       <label  className="lb"   for="contact">Contact No:</label>
       <input type="text" id="contact" className="form-control" name="contact"onChange={this.handleChange} />
       </div>


       <div className="form-group" class="col-md-4">
           <label  className="lb"   for="availability_status">Type of Container :</label>
           {/* <input type="text" id="availability_status" className="form-control" name="Container_Type"onChange={this.handleChange} /> */}
           <select name="Container_Type" className="form-control" id="availability_status">
  <option value="Dry storage container">Dry storage container</option>

  <option value="Flat rack container">Flat rack container</option>
  <option value="Open top container">Open top container</option>
  <option value="Refrigerated ISO container">Refrigerated ISO container</option>
  <option value="ISO Tanks">ISO Tanks</option>
</select>
           </div><br/>

       <div className="form-group"class="rows">
       <button type="submit" class="btn btn-primary col-md-2"onClick={this. submitInfo}>SUBMIT</button>  
       <button type="reset" class="btn btn-primary col-md-2">RESET</button> 
      
       </div>
   </form>
  
</div>
   
)
}
}