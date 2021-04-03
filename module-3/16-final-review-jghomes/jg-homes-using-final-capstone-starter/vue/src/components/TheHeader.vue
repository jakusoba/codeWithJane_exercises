<template>
   <div>
       <img src="../assets/java-green.png" alt="Our logo">
       <div id="nav">
          <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
          <router-link v-bind:to="{ name: 'search' }">Home Search</router-link>&nbsp;|&nbsp;
           <router-link v-bind:to="{ name: 'addHome' }">Add Home</router-link>&nbsp;|&nbsp;
           <router-link v-bind:to="{ name: 'weather' }">Weather Report</router-link>&nbsp;|&nbsp;
           <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token == ''">Login</router-link>
          <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
       </div>

       <p v-if="$store.state.token != '' ">Welcome {{$store.state.user.username}}</p>
   </div>


</template>

<script>
export default {
    name: 'the-header',
    data() {
      return {};
    }
}
</script>

<style scoped>

   img {
       width: 15%;
       height: auto;
   }

   nav {
       display: flex;
       justify-content: center;
   }

   nav a {
       padding: 15px 25px;
       background-color: rgb(37, 241, 37);
   }

   nav a:hover {
       background-color: green;
       color: white;
   }

</style>
