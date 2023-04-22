import axios from 'axios'



const SHIP_BASE_URL='http://localhost:8081/admin'


// export const Service= {

//      getships:()=>{
//         return axios.get(SHIP_BASE_URL + '/' + Viewallships)
//       }
//     }
    export const Service = {
      getships: () => {
        return axios.get(SHIP_BASE_URL + '/viewship');
      },
      post:(message)=>{
        return axios.post(SHIP_BASE_URL + '/addship',message);
      },
      deleteShip:(shipid)=>{
        return axios.delete(SHIP_BASE_URL + '/delete' + '/' + shipid)
      },
      getShipById:(Shipid)=>{
        return axios.get(SHIP_BASE_URL + '/ship' + '/' + Shipid)
      },
      postRoute:(message)=>{
        return axios.post(SHIP_BASE_URL + '/addRoute',message);
      },
      getRoutes: () => {
        return axios.get(SHIP_BASE_URL + '/AllRoute');
      },
      deleteRoute:(routeid)=>{
        return axios.delete(SHIP_BASE_URL + '/deleter' + '/' + routeid)
      },
      getRouteById:(routeid)=>{
        return axios.get(SHIP_BASE_URL + '/Route' + '/'+ routeid)
      },
      postSchedule:(message)=>{
        return axios.post(SHIP_BASE_URL + '/addSchedule',message);
      },
      getSchedule: () => {
        return axios.get(SHIP_BASE_URL + '/AllSchedule');
      },
      deleteSchedule:(scheduleid)=>{
        return axios.delete(SHIP_BASE_URL + '/deletes' + '/' + scheduleid)
      }

    };
    