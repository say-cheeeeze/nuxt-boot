<template>
  <div class="main-container">
	  <h1>join page</h1>
	  <div>
		  <p class="essential-guide">
			  <span class="essential-label">*</span>
			  는 필수항목입니다.
		  </p>
		  <el-form label-width="100px" :model="loginForm">
			  <el-form-item label="이름" required>
				  <el-input v-model="loginForm.name"></el-input>
			  </el-form-item>
			  <el-form-item label="비밀번호" required>
				  <el-input v-model="loginForm.password" show-password></el-input>
			  </el-form-item>
			  <el-form-item label="비밀번호 확인" required>
				  <el-input v-model="loginForm.passwordCheck" show-password></el-input>
			  </el-form-item>
			  <el-form-item label="성별" required>
				  <el-radio-group v-model="loginForm.gender">
					  <el-radio label="남성"></el-radio>
					  <el-radio label="여성"></el-radio>
				  </el-radio-group>
			  </el-form-item>
			  <el-form-item label="연락처" required>
				  <el-input v-model="loginForm.phoneNumber"></el-input>
			  </el-form-item>
			  <el-form-item label="이메일 주소" required>
				  <el-input v-model="loginForm.email"></el-input>
			  </el-form-item>
			  <el-form-item label="좋아하는 분야">
				  <el-checkbox-group v-model="loginForm.favorite">
					  <el-checkbox v-for="item in favoriteList" :label="item"></el-checkbox>
				  </el-checkbox-group>
			  </el-form-item>
		  </el-form>
	  </div>
	  <div class="align-center">
		  <el-button type="primary" @click="login()">로그인</el-button>
		  <el-button @click="toHome()">홈으로</el-button>
	  </div>
  </div>
</template>

<script>
export default {
	data() {
		return {
			
			loginForm : {
				name : "",
				password : "",
				passwordCheck : "",
				gender : "",
				phoneNumber : "",
				email : "",
				favorite : [],
			},
			favoriteList : ['로맨스','코믹','액션', '스릴러'],
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
			console.log( this.$common.isEmpty( "asd" ) );
		}
	}
}
</script>
<style>
.main-container {
	width:800px;
	margin:auto;
}
.essential-label {
	color:#fd4c4c;
}
.essential-guide {
	text-align:right;
}
.align-center {
	text-align:center;
}
</style>