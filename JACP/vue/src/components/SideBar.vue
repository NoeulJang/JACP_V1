<template>
	<div class="icon-bar">
		<router-link to="/">
			<i class="fas fa-home"></i>
		</router-link>
		<router-link to="/about">
			<i class="fas fa-question"></i>
		</router-link>
		<router-link to="/board/list">
			<i class="fas fa-list"></i>
		</router-link>
		<button @click="openModal" type="button">
			<i class="fas fa-person"></i>
    	</button>
	</div>
	<ChatModal @close="closeModal" v-if="modal"></ChatModal>
</template>
<script>
import ChatModal  from '@/components/modal/ChatModal'

export default {
  components: {
    ChatModal
  },
  data: ()=> {
    return {
      modal: false,
    }
  },
  methods:{
    openModal() {
      this.modal = true
    },
    closeModal() {
      this.modal = false
    }
  }
}
</script>
<style scoped>
.icon-bar {
	height: 100%;
	width: 90px;
	background-color: #555;    
	position: fixed; /* Fixed Sidebar (stay in place on scroll) */    /*z-index: 1;*/ /* Stay on top */    
	top: 0; /* Stay at the top */    
	left: 0;    
	overflow-x: hidden; /* Disable horizontal scroll */    
	padding-top: 0;  
}  

.icon-bar a {    
	display: block;    
	text-align: center;    
	padding: 16px;    
	transition: all 0.3s ease;    
	color: white;    
	font-size: 36px;  
}  

.icon-bar a:hover {    
	background-color: #858585;  
}  

.active {    
	background-color: #5eaf13;  
}
</style>