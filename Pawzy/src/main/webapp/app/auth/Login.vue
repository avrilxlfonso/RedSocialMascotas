<template>
  <div class="login-page">
    <!-- Cabecera para la página de login -->
    <header class="login-header">
      <div class="logo-section" @click="goHome">
        <img src="../../content/images/animals.png" alt="Logo" class="logo-img" height="100" />
        <img src="../../content/images/letraLogo.png" alt="Logo" class="logo-img" />
      </div>
      <button @click="goRegister" class="nav-button nav-button--outline">Registrarse</button>
    </header>

    <!-- Contenido de login -->
    <section class="login-content">
      <div class="login-form">
        <h2>Iniciar Sesión</h2>
        <form @submit.prevent="submitLogin">
          <label>Correo electrónico</label>
          <input v-model="email" type="email" required />

          <label>Contraseña</label>
          <input v-model="password" type="password" required />

          <button type="submit" class="btn-submit">Entrar</button>
        </form>
      </div>
    </section>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();
const email = ref('');
const password = ref('');

function goHome() {
  router.push('/');
}
function goRegister() {
  router.push('/register');
}

function submitLogin() {
  alert(`Iniciando sesión: ${email.value}`);
  // Aquí iría tu lógica real
}
</script>

<style scoped>
.login-page {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  background-color: #f8f5f0;
}

.login-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem;
  background-color: #ffffff;
}

.logo-section {
  display: flex;
  align-items: center;
  cursor: pointer;
}

.logo-img {
  width: 100px;
  height: auto;
  margin-right: 0.5rem;
}


.nav-button--outline {
  background-color: transparent;
  border: 2px solid #a37c7c;
  color: #a37c7c;
  padding: 0.5rem 1rem;
  border-radius: 4px;
  cursor: pointer;
}

.login-content {
  display: flex;
  justify-content: center;
  align-items: center;
  flex: 1;
}

.login-form {
  background-color: #fff;
  padding: 2rem;
  border-radius: 8px;
  box-shadow: 0 2px 5px rgba(0,0,0,0.1);
}

.login-form label {
  font-weight: bold;
  color: #6b4f4f;
}

.login-form input {
  display: block;
  width: 100%;
  margin-bottom: 1rem;
  padding: 0.5rem;
}

.btn-submit {
  background-color: #a37c7c;
  color: #fff;
  border: none;
  padding: 0.75rem;
  cursor: pointer;
  border-radius: 4px;
}
</style>
