import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import './Login.css'
import './Footer.css'

function Login() {
  const[name,setName]=useState("");
  const[pass,setPass]=useState("");
  const nav=useNavigate();

  const gotoCreateShip=()=>{
    nav("/ship")
  }

  const handleSubmit=(e)=>{
    e.preventDefault(e.target.value);

    if(name=="AD-001" && pass=="AD-001"){
      nav("/ship");
    }
    else if(name=="AD-002" && pass=="AD-002"){
      nav("/viewship")
    }
    else if(name=="AD-003" && pass=="AD-003"){
      nav("/deleteship")
    }
    else if(name=="AD-005" && pass=="AD-005"){
      nav("/viewRoute")
    }
    else if(name=="AD-004" && pass=="AD-004"){
      nav("/addRoute")
    }
    else if(name=="AD-006" && pass=="AD-006"){
      nav("/deleteRoute")
    }
    else if(name=="AD-007" && pass=="AD-007"){
      nav("/createSchedule")
    }
    else if(name=="AD-008" && pass=="AD-008"){
      nav("/viewSchedule")
    }
    else if(name=="AD-009" && pass=="AD-009"){
      nav("/deleteSchedule")
    }
    else{
      alert("FAIL")
    }
  }
  return (
    <>
   
   
    <div className='a'>
      <h3>ShipReservation</h3>
      </div>
      <div className='d'>
        
      <div className='t'>
      <form>
        <div className='e'>
      <input type='text' placeholder='User Name' value={name} onChange={(e)=>setName(e.target.value)}/><br/><br/></div>
      <input type='text' placeholder='Password' value={pass} onChange={(e)=>setPass(e.target.value)}/><br/><br/>
      <button onClick={handleSubmit} >Submit</button>
      </form></div>
      <div className='footer'>
        <h4>ShipReservation@copyrights....</h4></div>
        <div className='c'>
          
        </div>
        </div>
    </>
  )
}

export default Login
