<template>
  <div>
    <h1>Welcome to my Home Page</h1>
	  <el-button @click="toMain()">main 으로</el-button>
  </div>
</template>
<script>
export default {
  data() {
    return {

    }
  },
  created() {

  },
  fetch() {
  },
  methods : {
  	toMain() {
  		this.$router.push({
		   path : "/user/main"
	    });
    }
  },
}
</script>
