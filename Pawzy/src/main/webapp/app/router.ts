import { createRouter, createWebHistory } from 'vue-router';
import Login from '@/auth/Login.vue';
import Feed from '@/home/Feed.vue';
import Profile from '@/profile/Profile.vue';

const routes = [
  { path: '/', redirect: '/login' },
  { path: '/login', component: Login },
  { path: '/feed', component: Feed },
  { path: '/profile', component: Profile },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
