<template>
  <div class="myBooks">
      <h1>This view displays the new book form.</h1>
      <reading-list></reading-list>
       <footer> 
           <router-link v-bind:to="{ name: 'NewBook' }">New Book Form</router-link>&nbsp;|&nbsp;

       </footer>
  </div>
</template>


<script>
import ReadingList from '@/components/ReadingList.vue';

export default {
    components: {
        ReadingList,
        

    }

}
</script>

<style>

</style>