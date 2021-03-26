<template>
   <div>
       <img src="../assets/java-green.png" alt="Our logo">
       <h1>{{ pageTitle }}</h1>
       <nav>
           <a href="#">Home</a>
           <a href="#">About</a>
           <a href="#">Home Search</a>
       </nav>
   </div>

</template>

<script>
export default {
    name: 'the-header',
    data() {
      return {
          pageTitle: 'Java Green Home Search'
      };

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
