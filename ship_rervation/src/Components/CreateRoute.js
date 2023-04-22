import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import { Service } from '../Service/Adminworker'
import './Login.css'
function CreateRoute() {
  const { routeid } = useParams();
  const{shipid} = useParams();

  const[shipName, setShipname]=useState("");

  const nav=useNavigate();

  
  const [data, setData] = useState({
    routeid: 0,
    source: "",
    destination: "",
    travelDuration: "",
    fare: 0,
    ship: {
      shipid: 0,
        shipName: "",
        seatingCapacity: 0,
        reservationCapacity: 0
    }

  });
  const [shi, setShi] = useState([
    {
      shipName: "",
      shipid: 0,
      seatingCapacity: 0,
      reservationCapacity: 0
    }
  ])

  const changedata = (e) => {
    const newdata = { ...data };
    newdata[e.target.id] = e.target.value;
    setData(newdata);
  }

  // const handleChangeCus=(e)=>{
  //   const selectShip=shi.find(item=>item.shipName===e.target.value);
  //   const newdata2={...data};
  //   newdata2[e.target.id] = e.target.value;
  //   newdata2.shipBean.shipID=selectShip.shipID;
  //   setShipname(newdata2);
  // }

  const handleChangeCus = (e) => {
    const selectShip = shi.find(item => item.shipName === e.target.value);
    const newdata2 = { ...data };
    newdata2[e.target.id] = e.target.value;
    newdata2.ship.shipid = selectShip.shipid;
    newdata2.ship.shipName = selectShip.shipName; // Set shipName in shipBean
    // setShipname(newdata2);
    setData(newdata2);
  }
  const handleSubmit =async(e)=>{
    e.preventDefault();
    Service.postRoute(data);
     
    alert(" Created Route Sucessfully");
    nav('/')

  }
console.log(data)
  useEffect(() => {

      const fetchdata = async () => {
        const resp = await Service.getships();
        setShi(resp.data);
    }
    

      fetchdata();
  
}, []);
  
  
  return (
<>
    <div>
    <div className='rt'>
      <form onSubmit={handleSubmit} className='Container'>
        <div className='input-box'>
          <b><label>Ship_Name:</label></b><br/>
          <select Value={shipName} onChange={handleChangeCus} >
            <option>--Select Ship--</option>
            {
              shi.map((item) => {
                return <option value={item.shipName} key={item.shipid}>{item.shipName}</option>
              })
            }
          </select>
        </div>

        <div className='input-box'>
        <label className="details"for="source"><b>Source:</b></label><br/>
      <input type="text" placeholder="Enter your Source" id="source"value={data.source}  onChange={(e)=>changedata(e)} required="true"/><br/>
      
      </div>
      <div className='input-box'>
      <label className="details" for="destination"><b>Destination:</b></label><br/>
      <input type="text" placeholder="Enter your Destination" id="destination"value={data.destination} onChange={(e)=>changedata(e)} required="true"/><br/>
     </div>
      
      <div className='input-box'>
      <label className="details" for="travelDuration"><b>travelDuration:</b></label><br/>
      <input type="text" placeholder="Enter your travelDuration" id="travelDuration" value={data.travelDuration} onChange={(e)=>changedata(e)} required="true" /><br/>
       </div >

       <div className='input-box'>
      <label className="details" for="Travel_Duration"><b>Fare:</b></label><br/>
      <input type="text" placeholder="Enter your Fare"id="fare" value={data.fare} onChange={(e)=>changedata(e)} required="true" /><br/>
       </div >
      
      <button  type="submit" >Submit</button>
      {/* {
        title1()
      } */}
      <button className='btn btn-danger'style={{marginLeft:"10px"}} onClick={(e)=>{nav('/')}}type="submit" >Cancel</button>
      </form>
      </div>
    </div>
    </>
  )
}

export default CreateRoute;