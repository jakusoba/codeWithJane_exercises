import axios from 'axios';
 
// const http = axios.create( {
//    baseURL: process.env.VUE_APP_WEATHER_API
// })


export default {
   getWeather() {
       return axios.get('http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=2f7bdcc26bc9669ab55f8341c4521509')
       //return http.get('/data/2.5/weather?q=London,uk&APPID=2f7bdcc26bc9669ab55f8341c4521509');
   }
}       