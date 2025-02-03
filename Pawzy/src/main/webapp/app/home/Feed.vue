<template>
  <div class="feed-container">
    <h1 class="title">Pawzy - Feed</h1>
    <div class="grid-container">
      <div v-for="(post, index) in posts" :key="index" class="card">
        <img :src="post.image" class="card-image" />
        <h2 class="card-title">{{ post.title }}</h2>
        <p class="card-description">{{ post.description }}</p>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';

// Datos simulados
const posts = ref([
  {
    image: 'https://placekitten.com/300/200',
    title: 'Gatito feliz',
    description: 'Un lindo gatito paseando...',
  },
  {
    image: 'https://place-puppy.com/300x200',
    title: 'Perrito contento',
    description: 'Disfrutando la tarde soleada...',
  },
  // Agrega más elementos para ver el efecto Pinterest
]);
</script>

<style scoped>
.feed-container {
  padding: 1rem;
  background-color: #f8f5f0;
  min-height: 100vh;
}

.title {
  text-align: center;
  color: #6b4f4f;
  margin-bottom: 1rem;
}

.grid-container {
  display: grid;
  gap: 1rem;
  /* Ajustar columnas automáticas */
  grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
}

.card {
  background-color: #fffaf5;
  border-radius: 8px;
  box-shadow: 0 2px 5px rgba(0,0,0,0.1);
  overflow: hidden;
  transition: transform 0.2s;
}

.card:hover {
  transform: scale(1.02);
}

.card-image {
  width: 100%;
  height: 200px;
  object-fit: cover;
}

.card-title {
  font-size: 1.2rem;
  margin: 0.5rem;
  color: #6b4f4f;
}

.card-description {
  font-size: 0.9rem;
  margin: 0 0.5rem 0.5rem;
}
</style>
