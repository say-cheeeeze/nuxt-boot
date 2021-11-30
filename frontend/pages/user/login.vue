<template>
  <div>
	  <h1>login page</h1>
	  <div>
		  <span>ID</span><el-input placeholder="ID 를 입력하세요" v-model="inputId"></el-input>
	  </div>
	  <div>
		  <span>PW</span><el-input placeholder="비밀번호를 입력하세요" v-model="inputPwd"></el-input>
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
	}
}
</script>
