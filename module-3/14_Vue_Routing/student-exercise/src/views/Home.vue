<template>
  <div class="home">
      <h1>This is the home app.</h1>
      <best-seller-list></best-seller-list>
      <new-releases-list></new-releases-list>  
  </div>
</template>


<script>
import BestSellerList from '@/components/BestSellerList.vue';
import NewReleasesList from '@/components/NewReleasesList.vue';
export default {
    components: {
        BestSellerList,
        NewReleasesList

    }

}
</script>

<style>

</style>