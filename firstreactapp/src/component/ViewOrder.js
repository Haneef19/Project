import React from 'react'
import { BrowserRouter,Link, Route} from 'react-router-dom';
import Booking from './Booking'

export default class ViewOrder extends React.Component{

    constructor (props){
        super(props);
        this.state = {
            order: []
        }
    }

    componentDidMount = () =>{
         fetch("http://localhost:8080/getall")
        .then(resp => resp.json())
        .then(data => this.setState({order: data}));

    }
    
   
    render() {
        return(
            <div>
                 <h2> Orders </h2>
                 <p> {this.state.order.length}</p>
                 <table className="table table-bordered table-striped" border='1'>
                     <tr>
                        <th>Soure Address</th>
                        <th>Destination Address</th>
                        <th>Start Date</th>
                        <th>End Date</th>
                        <th>Material Weight</th>
                        <th>Material Quantity</th>
                        <th>Material Price</th>
                        <th>Container Type</th>
                        <th>Book Now</th>

                    </tr>
                    {this.state.order.map(
                            (obj) => {
                                return(
                                   
                                    <tr>
                                        <td>{obj.source_add}</td>
                                        <td>{obj.dest_add}</td>
                                        <td>{obj.start_date}</td>
                                        <td>{obj.end_date}</td>
                                        <td>{obj.m_weight}</td>
                                         <td>{obj.m_qty}</td>
                                         <td>{obj.m_price}</td>
                                         <td>{obj.status}</td>
                              <td>

                              <Link to={{pathname:"/book",state: {oid: obj.order_id} }}  > View Trucks</Link>
                              </td>
                                                   
                                    </tr>
                                )
                            }
                        )
                        }
                    
                 </table>


            </div>
        );
    }

    
}