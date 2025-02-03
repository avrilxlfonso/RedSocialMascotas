// routes.ts
import { createRouter, createWebHistory } from 'vue-router';

// Importación normal
import LandingPage from '@/landing/LandingPage.vue';

// O, carga diferida (lazy load):
// const LandingPage = () => import('@/landing/LandingPage.vue');

// Mantienes tus rutas existentes
import Login from '@/auth/Login.vue';
const Feed = () => import('@/home/Feed.vue');
const Profile = () => import('@/profile/Profile.vue');

const routes = [
  // 1) Reemplazar la redirección por la página de Landing
  { path: '/', name: 'Landing', component: LandingPage },

  // 2) Rutas existentes
  { path: '/login', component: Login },
  {
    path: '/feed',
    component: Feed,
    meta: { requiresAuth: true },
  },
  {
    path: '/profile',
    component: Profile,
    meta: { requiresAuth: true },
  },
];

// Configuración del router
const router = createRouter({
  history: createWebHistory(),
  routes,
});

// Ejemplo de guarda global (beforeEach):
router.beforeEach((to, from, next) => {
  // Por ejemplo, verifica si el usuario está "logueado" (según tu lógica real)
  const isLoggedIn = localStorage.getItem('userToken') !== null;
  // o tal vez consultando un store Vuex/Pinia: store.user.isLoggedIn

  if (to.meta.requiresAuth && !isLoggedIn) {
    // Si la ruta requiere login y no lo está, ve a /login
    next('/login');
  } else {
    // Si no requiere login o sí está logueado, sigue
    next();
  }
});

export default router;
