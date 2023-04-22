import React, { useState ,useEffect} from 'react'
import { Service } from '../Service/Adminworker';
import {useNavigate,useParams} from 'react-router-dom'
import axios from 'axios';
import './Login.css'
function CreateShip() {

  const nav=useNavigate();

const[shipName,setShipName]=useState('')
const[reservationCapacity,setReservationCapacity]=useState('')
const[seatingCapacity,setSeatingCapacity]=useState('')  
const handleSubmit=(e)=>{
const obj={shipName:shipName,seatingCapacity:seatingCapacity,reservationCapacity:reservationCapacity}
Service.post(obj);
console.log(obj)
nav('/')
      alert("Ship Created Sucessfully");
} 
return (
    <div>
      <div className='q'>
        <h3>ADDSHIP</h3>
      </div>
      <form onSubmit={handleSubmit} className='Container'>
        <div className='w'>
      <div className='z'>
        <div className='x'>
        <div className='input-box'>
        <label className="details"for="name"><b>ShipName:</b></label><br/>
      <input type="text" placeholder="Enter Ship Name" value={shipName}  onChange={(e)=>setShipName(e.target.value)} required="true"/><br/>
      
      </div>
      </div>
      <div className='input-box'>
      <label className="details" for="Reservation_Capacity"><b>Reservation_Capacity:</b></label><br/>
      <input type="text" placeholder="Enter Reservation_Capacity" value={reservationCapacity} onChange={(e)=>setReservationCapacity(e.target.value)} required="true"/><br/>
     </div>
      
      <div className='input-box'>
      <label className="details" for="Seating_Capacity"><b>Seating_Capacity:</b></label><br/>
      <input type="text" placeholder="Enter Seating_Capacity" value={seatingCapacity} onChange={(e)=>setSeatingCapacity(e.target.value)} required="true" /><br/>
       </div ><br/>
      
      <button  type="submit" >Submit</button>
      {/* {
        title1()
      } */}
      <button className='btn btn-danger'style={{marginLeft:"13px",height:"32px"}} onClick={(e)=>{nav('/')}}type="submit" >Cancel</button>
      </div></div>
      </form>

      </div>
      
   
  )
}

export default CreateShip;
