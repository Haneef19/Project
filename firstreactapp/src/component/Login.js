import React from "react";
import mystore from "./store";
export default class Login extends React.Component {

  constructor(props)
  {
 super(props);
  this.state={
        uid:"",
        pwd:"",
        customer:{},
        truckowner:{},
       loginerr:"",
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
  uid:this.state.uid,
  pwd:this.state.pwd
  
})
};
fetch("http://localhost:8080/Login",requestOptions)
.then(res=> res.text())
.then(data=>{ 

if(data.length != 0)
  {
  const json=JSON.parse(data);
    if(json.login.role=="customer")
   { this.setState({customer:json});
  localStorage.setItem("loggedinuser",JSON.stringify(this.state.customer));
  mystore.dispatch({type:"LOGGEDIN"});
  this.props.history.push("/customerhome")
   }
  else 
    {this.setState({truckowner:json});
    localStorage.setItem("loggedinuser",JSON.stringify(this.state.truckowner));
      mystore.dispatch({type:"LOGGEDIN"});
      this.props.history.push("/truckownerhome");}
      
     
      
  }
  else
  
    {  this.setState({loginerr:"wrongID/PWD/Reg_date"});}


});
}






 
render()
{
return(
  <div className="container-fluid">
  <h1 className="header"><i>Sign In</i></h1>
  <form>
   <div className="col-md-4">
       
       <label className="lb"  for="username">Username</label>
       <input type="text" className="form-control" id="uid"name="uid"onChange={this.handleChange}required/>

   </div>
   <div className="col-md-4">
       <label className="lb"  for="password">Password</label>
       <input type="password" className="form-control" name="pwd" id="pwd"onChange={this.handleChange}required/>
   </div>
   <br/>
   <button type="submit" className="btn btn-primary col-md-4"onClick={this.submitInfo}>Sign In</button>
   </form>
   {this.state.loginerror}
   </div>
)
}
}