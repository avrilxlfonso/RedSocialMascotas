<template>
  <div class="profile-container">
    <h1 class="title">Perfil de Usuario</h1>
    <form class="profile-form" @submit.prevent="saveProfile">
      <label>Nombre</label>
      <input v-model="name" type="text" class="input" />

      <label>Descripción</label>
      <textarea v-model="description" class="textarea"></textarea>

      <button type="submit" class="button">Guardar</button>
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue';

// Datos simulados
const name = ref('Juan Pérez');
const description = ref('Amante de los animales, especialmente perros y gatos.');

function saveProfile() {
  alert(`Perfil guardado: ${name.value}`);
}
</script>

<style scoped>
.profile-container {
  background-color: #f8f5f0;
  min-height: 100vh;
  padding: 1rem;
}

.title {
  text-align: center;
  color: #6b4f4f;
  margin-bottom: 1rem;
}

.profile-form {
  max-width: 400px;
  margin: 0 auto;
  background-color: #fffaf5;
  padding: 1rem;
  border-radius: 8px;
  box-shadow: 0 2px 5px rgba(0,0,0,0.1);
}

.input, .textarea {
  display: block;
  width: 100%;
  margin-bottom: 1rem;
  padding: 0.75rem;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.button {
  background-color: #a37c7c;
  color: #fff;
  padding: 0.75rem;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
</style>
