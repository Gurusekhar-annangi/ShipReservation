import React,{useEffect, useState} from 'react'
import { useNavigate,Link, Route } from 'react-router-dom'
import {Service} from '../Service/Adminworker'
function DeleteRoute() {
    const nav = useNavigate();
const [route, setRoute]=useState([])

useEffect(() => {
  
    getRoutes();
    
}, [])

const getRoutes=async()=>{
    Service.getRoutes().then ((response)=>{
        setRoute(response.data)
        
    })
}

const deleteRoute =async(routeid)=>{
    Service.deleteRoute(routeid).then((response)=>{
     getRoutes();
    })
 }

console.log(route)

  return (
    <div>
    
        <h2 className='title'>Delete Routes</h2>
        <button className='btn' onClick={()=>nav('/')} >Logout</button>
       
        

      <table  className="table table-success table-striped, table table-bordered border-primary" >
        
            <thead>
                <tr >
                    <th>Route Id</th>
                    <th>Destination</th>
                    <th>Source</th>
                    <th>TravelDuration</th>
                    <th>Fare</th>
                    {/* <th>Ship_Name</th> */}
                </tr>
                
            </thead>
            <tbody>
                {
                    route.map(
                        route=>
                        <tr key={route.routeid}>
                            <td>{route.routeid}</td>
                            <td>{route.destination}</td>
                            <td>{route.source}</td>
                             <td>{route.travelDuration}</td>
                             <td>{route.fare}</td>
                             {/* <td>{route.ship.shipName}</td> */}
                            <td>
                             {/* <Link className="btn btn-outline-primary" to={`/edit-ship/${ship.shipID}`}>Edit</Link> */}
                            <button className="btn btn-outline-danger" onClick={() => deleteRoute(route.routeid)} style={{marginLeft:"10px"}}>Delete</button>
                            {/* <button className="btn btn-outline-sucess" onClick={() => getBankById(customer.bank.bankid)} style={{marginLeft:"10px"}}>Bank Details</button> */}
                             
                            
                            </td>
                        </tr>
                        
                    )
               }
            
            </tbody>
        </table>
        
    </div>
  )
}

export default DeleteRoute;
