import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

/*
 * The authorization header is set for axios when you login but what happens when you come back or
 * the page is refreshed. When that happens you need to check for the token in local storage and if it
 * exists you should set the header so that it will be attached to each request
 */
const currentToken = localStorage.getItem('token')
const currentUser = JSON.parse(localStorage.getItem('user'));

if(currentToken != null) {
  axios.defaults.headers.common['Authorization'] = `Bearer ${currentToken}`;
}

export default new Vuex.Store({
  state: {
    homes: [ {
      mlsNumber: '1000',
      address: {
        addressLine:'123 Web Services Ave', 
        city: 'Lewis Center',
        state: 'Ohio',
        zipCode: '43035',
     },
      price: '1,222,345.00', 
      imageName: require('../assets/1000.jpg')
      }, {
      mlsNumber: '1001',
      address: {
         addressLine:'123 Vue Street', 
         city: 'Grandview',
         state: 'Ohio',
         zipCode: '43015',
      },
      price: '952,345.72', 
      imageName: require('../assets/1001.jpg')
      }, {
      mlsNumber: '1002',
      address: {
        addressLine:'127 Vuex Router Rd', 
        city: 'Grandview',
        state: 'Ohio',
        zipCode: '43015',
     },
      price: '750,000.00', 
      imageName: require('../assets/1002.jpg')
      }, 
      {
      mlsNumber: '1003',
      address: {
        addressLine:'1199 Java Blvd', 
        city: 'Dublin',
        state: 'Ohio',
        zipCode: '43017',
     },
      price: '99.97',
      imageName: require('../assets/1003.jpg')
      }, {
      mlsNumber: '1004',
      address: {
        addressLine:'555 Cohort Rd', 
        city: 'Grandview',
        state: 'Ohio',
        zipCode: '43015',
     },
      price: '1,000,000.01',
      imageName: require('../assets/1004.jpg')
      } ],        
    token: currentToken || '',
    user: currentUser || {}
  },
  mutations: {
    SET_AUTH_TOKEN(state, token) {
      state.token = token;
      localStorage.setItem('token', token);
      axios.defaults.headers.common['Authorization'] = `Bearer ${token}`
    },
    SET_USER(state, user) {
      state.user = user;
      localStorage.setItem('user',JSON.stringify(user));
    },
    LOGOUT(state) {
      localStorage.removeItem('token');
      localStorage.removeItem('user');
      state.token = '';
      state.user = {};
      axios.defaults.headers.common = {};
    }
  }
})
