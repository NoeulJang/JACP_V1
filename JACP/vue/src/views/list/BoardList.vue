<template>
  <div class="list">
    <h1>This is an list page</h1>
    <button type="button" @click="getData()">axios Get</button>
  </div>
</template>
<script>
const HOST = "http://localhost:3000";

export default {
  methods: {
    getData() {
      this.$axios
        .get(HOST + "/api/getData")
        .then((res) => {
          console.log(res.staus);
          console.log(res.data);
        })
        .catch((error) => {
          console.log(error);
        })
        .finally(() => {
          console.log("항상 마지막에 실행");
        });
    },
  },
};
</script>