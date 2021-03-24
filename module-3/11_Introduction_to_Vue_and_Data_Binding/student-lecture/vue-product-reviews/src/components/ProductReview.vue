<template>
  <div class="main">
      <h2>Product Reviews for {{ pname }}</h2>
      <p class="Description"> {{ description }}</p>
      <div class='review' v-for='review in reviews' v-bind:key='review.id'>
          <h4> {{review.reviewer}} </h4>
          </div>

  </div>
</template>

<script>
export default {
    name: 'product-review',
    data(){
        return {
            pname: 'Cigar Parties for dummies',
            description: 'Host plan squirrel parties',
            reviews: [
                {   
                    id: 1, 
                    reviewer: "jane",
                    review: "Awesome read"
                },
                {   
                    id: 1, 
                    reviewer: "bob",
                    review: "Awesome read"
                }

            ]
        }
    }

}
</script>

<style>

</style>