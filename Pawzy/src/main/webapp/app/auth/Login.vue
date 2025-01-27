<template>
  <div class="login-container">
    <div class="form-wrapper">
      <h1 class="title">Inicia Sesión en Pawzy</h1>
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
        <button type="submit" class="button">Iniciar sesión</button>
      </form>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const email = ref('');
const password = ref('');

const handleLogin = () => {
  console.log('Email:', email.value);
  console.log('Password:', password.value);
  // Aquí puedes añadir la lógica para autenticar al usuario
};
</script>

<style scoped>
.login-container {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-color: #f5f5f5;
}

.form-wrapper {
  background-color: #fff;
  padding: 24px;
  border-radius: 8px;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  max-width: 400px;
  width: 100%;
}

.title {
  text-align: center;
  font-size: 1.5rem;
  margin-bottom: 24px;
  color: #ff6f61;
}

.input {
  width: 100%;
  padding: 12px;
  margin-bottom: 16px;
  border: 1px solid #ddd;
  border-radius: 4px;
  font-size: 1rem;
}

.button {
  width: 100%;
  background-color: #ff6f61;
  color: white;
  padding: 12px;
  font-size: 1rem;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.button:hover {
  background-color: #e65b55;
}
</style>
