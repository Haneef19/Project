import React from 'react'
import { BrowserRouter,Link, Route} from 'react-router-dom';
import Booking from './Booking'

export default class ViewBooking extends React.Component{

    constructor (props){
        super(props);
        this.state = {
            booking: []
        }
    }

    componentDidMount = () =>{
         fetch("http://localhost:8080/getbook")
        .then(resp => resp.json())
        .then(data => this.setState({booking: data}));

    }
    
   
    render() {
        return(
            <div>
                 <h2> Bookings </h2>
                 <p> {this.state.booking.length}</p>  
                 <table className="table table-bordered table-striped" border='1'>
                     <tr>
                        <th>BOOKING</th>
                        <th>ORDER NO.</th>
                        <th>TRUCK NO.</th>
                        <th>SOURCE</th>
                        <th>DESTINATION</th>
                        <th>EPD</th>
                        <th>EDD</th>
                        <th>WEIGHT</th>
                        <th>QUANTITY</th>
                        <th>M.PRICE</th>
                        
                        
                        
                        

                    </tr>
                    {this.state.booking.map(
                            (obj) => {
                                return(
                                   console.log(obj),
                                    <tr>

                                        <td>{obj.booking_id}</td>
                                        <td>{obj.order.order_id}</td>
                                        <td>{obj.truckowner.truck_no}</td>
                                       <td>{obj.order.source_add}</td>
                                         <td>{obj.order.dest_add}</td>
                                         <td>{obj.order.start_date}</td>
                                         <td>{obj.order.end_date}</td>
                                         <td>{obj.order.m_weight}</td>
                                         <td>{obj.order.m_qty}</td>
                                    <td>{obj.order.m_price}</td>                                    
                                                           
                                    </tr>
                                );
                            }
                        )    
                    }
                 </table>


            </div>
        );
    }

    
}