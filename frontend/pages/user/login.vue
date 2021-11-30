<template>
  <div>
	  <h1>login page</h1>
	  <div class="input-area">
		  <span>ID</span>
		  <el-input placeholder="ID 를 입력하세요" v-model="inputId"></el-input>
	  </div>
	  <div class="input-area">
		  <span>PW</span>
		  <el-input placeholder="비밀번호를 입력하세요" v-model="inputPwd" show-password></el-input>
	  </div>
	  <div>
		  <el-button type="primary" @click="login()">로그인</el-button>
		  <el-button @click="toHome()">홈으로</el-button>
	  </div>
	  

  </div>
</template>

<script>
export default {
	data() {
		return {
			// 입력받은 id
			inputId : "",
			// 입력받은 pwd
			inputPwd : "",
		}
	},
	methods : {
		// 홈으로
		toHome() {
			this.$router.push({
				path : "/user/main"
			});
		},
		// 로그인 시도
		login() {
			console.log( "id : ", this.inputId );
			console.log( "pwd : ", this.inputPwd );
		}
	}
}
</script>
<style>
.input-area {
	width:400px;
}
</style>