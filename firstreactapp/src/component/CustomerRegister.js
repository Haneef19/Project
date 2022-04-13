
import React from 'react';
import "./mainmenu.css"
import mystore from "./store";
import 'bootstrap/dist/css/bootstrap.min.css'

export default class CustomerRegister extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
           uid:"",
          pwd:"",
          reg_date:"",
          reg_amt:"",
         name:"",
         address:"",
         contact:"",
         gstin:"",
         customer:{}
        }
      }

      handleChange = (e) =>{
        const nm = e.target.name;
        const val = e.target.value;
        this.setState({[nm]:val});

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
          name:this.state.name,
          address:this.state.address,
          contact:this.state.contact,
          gstin:this.state.gstin
          
      })
      };
      fetch("http://localhost:8080/registerc",requestOptions)
      .then(res=> res.json())
      .then(data=>this.setState({customer:data}))
      alert("Registered Sucessfully")
      }

    render(){
        return(
            <div className="container-fluid">
           {/* <h1 className="header">Customer Registration</h1><br/>*/}
            <h2 style={{color: "brown"}}>Customer Registration </h2><br/>
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
                    <label  className="lb"  for="reg_amt">Registration Amount:</label>
                    <input type="text" id="reg_amt" className="form-control" name="reg_amt"onChange={this.handleChange}  />
                    </div>

                    <div className="form-group" class="col-md-4" >
                    <label  className="lb"   for="name">Full Name. :</label>
                    <input type="text" id="name" className="form-control" name="name" onChange={this.handleChange} />
                    </div>

                    <div className="form-group" class="col-md-4">
                    <label  className="lb"   for="address">Address :</label>
                    <input type="text"  id="address" className="form-control" name="address" onChange={this.handleChange} />
                    </div>
                    <div className="form-group" class="col-md-4">
                    <label  className="lb"   for="contact">Contact No:</label>
                    <input type="text" id="contact" className="form-control" name="contact"onChange={this.handleChange} />
                    </div>

                <div className="form-group"class="col-md-4">
                <label  className="lb"   for="gstin"> GSTIN No :</label>
                <input type="text" id="gstin" className="form-control" name="gstin"onChange={this.handleChange} /><br/>
                </div>
                <div className="form-group"class="rows">
                <button type="submit" class="btn btn-primary col-md-2"onClick={this. submitInfo}>SUBMIT</button>  
                <button type="reset" class="btn btn-primary col-md-2">RESET</button> 
               
                </div>
            </form>
           
        </div>
            
        )
    }
}