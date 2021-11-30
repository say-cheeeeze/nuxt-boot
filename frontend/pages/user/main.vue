<template>
  <div>
	  <h1>user main</h1>
	  <el-button @click="goLogin()">로그인</el-button>
	  <el-button @click="goJoin()">회원가입</el-button>
	  <el-button @click="goAbout()">소개화면으로</el-button>
  </div>
</template>

<script>
export default {
	data() {
		return {
		
		}
	},
	methods : {
		// 로그인화면으로
		goLogin() {
			this.$router.push({
				path : "/user/login"
			});
		},
		// 회원가입 화면으로
		goJoin() {
			this.$router.push({
				path : "/user/join"
			});
		},
		// 소개 화면으로
		goAbout() {
			this.$router.push({
				path : "/about"
			});
		},
		
	}
}
</script>
