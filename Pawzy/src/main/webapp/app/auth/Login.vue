<template>
  <div class="login-container">
    <div class="form-wrapper">
      <h1 class="title">Pawzy - Iniciar Sesión</h1>
      <form @submit.prevent="handleLogin">
        <input
          type="email"
          v-model="email"
          placeholder="Correo electrónico"
          class="input"
          required
        />
        <input
          type="password"
          v-model="password"
          placeholder="Contraseña"
          class="input"
          required
        />
        <button type="submit" class="button">Entrar</button>
      </form>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const email = ref('');
const password = ref('');

function handleLogin() {
  // Simulamos login sin backend
  if (email.value && password.value) {
    alert(`Bienvenido, ${email.value}`);
    // Redirigimos al feed
    window.location.href = '/feed';
  } else {
    alert('Credenciales inválidas');
  }
}
</script>

<style scoped>
.login-container {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-color: #f8f5f0; /* Beige suave */
}

.form-wrapper {
  background-color: #fffaf5; /* Tono crema */
  padding: 2rem;
  border-radius: 8px;
  box-shadow: 0 3px 8px rgba(0, 0, 0, 0.2);
}

.title {
  text-align: center;
  font-size: 1.5rem;
  margin-bottom: 1rem;
  color: #6b4f4f; /* Marrón suave */
}

.input {
  width: 100%;
  padding: 0.75rem;
  margin-bottom: 1rem;
  border: 1px solid #ccc;
  border-radius: 4px;
  outline: none;
}

.button {
  width: 100%;
  background-color: #a37c7c; /* Marrón más fuerte */
  color: #fff;
  padding: 0.75rem;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.button:hover {
  background-color: #8f6b6b;
}
</style>
