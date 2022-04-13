import React from 'react'
import { BrowserRouter,Link, Route} from 'react-router-dom';
import Booking from './Booking'
import Order from './Order';
export default class ViewTruck extends React.Component{

    constructor (props){
        super(props);
        this.state = {
            truck: []
        }
    }

    componentDidMount = () =>{
         fetch("http://localhost:8080/viewt")
        .then(resp => resp.json())
        .then(data => this.setState({truck: data}));

    }

    booknow = (tno) =>{
        alert(this.props.oid+": "+tno)
         const url = "http://localhost:8080/book?oid="+this.props.oid+"&tno="+tno;
         fetch(url)
         .then(resp => resp.json())
         .then(data => this.setState({booking: data}))
         alert("Booking Submitted");
    }
    
   
    render() {
        return(
            <div>
                 <h2> Orders </h2>
                 
                 <table className="table table-bordered table-striped" border='1'>
                     <tr>
                        <th>Truck Number</th>
                        <th>Owner Name Address</th>
                        <th>Address</th>
                        <th>Desired Source </th>
                        <th>Desired Destination</th>
                        <th>Owner Contact</th>
                        <th>Availability Status</th>
                        <th>Book</th>

                    </tr>
                    {
                        this.state.truck.map(
                            (obj) => {
                                return(
                                   
                                    <tr>
                                        <td>{obj.truck_no}</td>
                                        <td>{obj.name}</td>
                                        <td>{obj.address}</td>
                                        <td>{obj.source}</td>
                                        <td>{obj.destination}</td>
                                         <td>{obj.contact}</td>
                                         <td>{obj.availability_status}</td>
                                          <td> <a onClick={()=>{this.booknow(obj.truck_no)}}> Book Now</a> </td>                     
                                      </tr>                          

                                         
                                );
                            }
                        )   
                    }
                 </table>

                 <div > <Link to="/viewbook">Please click here to check details</Link></div>
            </div>
        );
    }

    
}