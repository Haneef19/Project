import React from "react";
import mystore from "./store";
class Contact extends React.Component{

    constructor(props)
    {
    
        super(props);
    }
    render(){
        const mystyle = {
            color: "Brown",
            fontFamily: "Arial"
          };

          const mystyle1={
              color:"white",
              
          };
    return(
    
    <div>
    <h3 style={mystyle}><b>About Us</b> </h3>
    <p style={mystyle1}><b>Office Address</b></p>
    <p style={mystyle1} >Address:Pune</p>
    <p style={mystyle1}><b>Email:</b>info@transportation.in</p>
    <p style={mystyle1}><b>Contact:8956496315</b></p>
    
    </div>
   
    
    
    );
    
    
    }
    
    
    
    }
    export default Contact;