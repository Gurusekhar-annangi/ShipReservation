import { Routes, Route } from "react-router-dom";
import "./App.css";
import Viewallships from "./Components/ViewAllships";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import CreateShip from "./Components/CreateShip";
import Navbar from "./Components/Navbar";
import Viewallschedules from "./Components/ViewAllSchedule";
import Login from "./Components/Login";
import DeleteShip from "./Components/DeleteShip";
import ViewallRoutes from "./Components/ViewAllRoutes";
import CreateRoute from "./Components/CreateRoute";
import DeleteRoute from "./Components/DeleteRoute";
import CreateSchedule from "./Components/CreateSchedule";
import DeleteSchedule from "./Components/DeleteSchedule";







function App() {
  return (
    <div className="App">
      {/* <Navbar/> */}
      <Routes>
     <Route path='/viewship' element = {<Viewallships/>}/> 
     <Route path = "/ship" element={<CreateShip/>}/>
     <Route path = "/viewschedule" element={<Viewallschedules/>}/>
     <Route path='/' element= {<Login/>}/>
     <Route path='/deleteship' element = {<DeleteShip/>}/>
     <Route path='/viewRoute' element = {<ViewallRoutes/>}/> 
     <Route path='/addRoute' element = {<CreateRoute/>}/> 
     <Route path='/deleteRoute' element = {<DeleteRoute/>}/> 
     <Route path='/viewSchedule' element = {<Viewallschedules/>}/> 
     <Route path='/createSchedule' element = {<CreateSchedule/>}/>
     <Route path='/deleteSchedule' element = {<DeleteSchedule/>}/>
     
     </Routes>
       {/* <Viewallships/> */}
    </div>
  );
}

export default App;
