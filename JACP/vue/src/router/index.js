import { createRouter, createWebHistory } from 'vue-router'
import PageHome from '@/views/PageHome.vue'
import BoardList from '@/views/list/BoardList.vue'
import NotFound from "@/views/error/NotFound.vue";

const routes = [
	{
		path: '/',
		name: 'PageHome',
		component: PageHome
	},
	{
		path: '/about',
		name: 'About',
		// route level code-splitting
		// this generates a separate chunk (about.[hash].js) for this route
		// which is lazy-loaded when the route is visited.
		component: () => import(/* webpackChunkName: "about" */ '../views/PageAbout.vue')
	},
	{
		//존재하지 않는 경로들 404 페이지로 리다이렉트하기
		path: "/:catchAll(.*)",
		redirect: "/404"
		// 아래처럼 바로 NotFound 경로를 매칭해도 됨
		// component: NotFound
	},
	{
        path: "/404",
        name: "notFound",
        component: NotFound
    },
	{
		path: '/board/list',
		name: 'BoardList',
		component: BoardList
	},
  
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router