import { useEffect,useState } from 'react'
import {Service} from '../Service/Adminworker'
import { useNavigate,Link } from 'react-router-dom'

function DeleteSchedule() {
    const nav = useNavigate();
    const [schedule, setSchedule]=useState([])
    
    useEffect(() => {
      
        getschedules();
        
    }, [])
    
    const getschedules=async()=>{
        Service.getschedules().then ((response)=>{
            setSchedule(response.data)

        })
    }
const deleteschedule =async(scheduleid)=>{
    Service.deleteSchedule(scheduleid).then((response)=>{
     getschedules();
    })
 }

  return (
    <div>
      <h1>HEllo Sundaram</h1>
      
      <h2 className='title'>Delete Schedules</h2>
         <button className='btn' onClick={()=>nav('/')} >Logout</button>
        
        

      <table  className="table table-success table-striped, table table-bordered border-primary" >
        
            <thead>
                <tr >
                    <th>Schedule Id</th>
                    <th>Start_Date</th>
                    <th>Ship_Name</th>
                    <th>Destination</th>
                    <th>Source</th>
                    <th>Travel_Duration</th>
                    <th>Fare</th>
                    <th>Action</th>
                  
                </tr>
                
            </thead>
            <tbody>
                {
                    schedule.map(
                        schedule=>
                        <tr key={schedule.scheduleid}>
                            <td>{schedule.scheduleid}</td>
                            <td>{schedule.startDate}</td>
                            <td>{schedule.shipBean.shipName}</td>
                            <td>{schedule.routeBean.destination}</td>
                            <td>{schedule.routeBean.source}</td>
                            <td>{schedule.routeBean.travelduration}</td>
                            <td>{schedule.routeBean.fare}</td>
                            <td>
                             {/* <Link className="btn btn-outline-primary" to={`/edit-ship/${ship.shipID}`}>Edit</Link> */}
                            <button className="btn btn-outline-danger" onClick={() => deleteschedule(schedule.scheduleID)} style={{marginLeft:"10px"}}>Delete</button> 
                             {/* <button className="btn btn-outline-sucess" onClick={() => getBankById(customer.bank.bankid)} style={{marginLeft:"10px"}}>Bank Details</button>  */}
                            
                            
                            </td>
                        </tr>
                        
                    )
               }
            
            </tbody>
        </table>
        
    </div>
  )
}

export default DeleteSchedule;