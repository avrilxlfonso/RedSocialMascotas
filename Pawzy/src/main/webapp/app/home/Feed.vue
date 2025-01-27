<template>
  <div class="feed-container">
    <h1 class="title">Explora las publicaciones de Pawzy</h1>
    <div class="grid-container">
      <div v-for="post in posts" :key="post.id" class="card">
        <img :src="post.image" :alt="post.title" class="card-image" />
        <div class="card-content">
          <h2 class="card-title">{{ post.title }}</h2>
          <p class="card-description">{{ post.description }}</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';

// Datos simulados
const posts = ref([
  { id: 1, image: '/images/dog1.jpg', title: 'Mascota feliz', description: 'Un día soleado en el parque' },
  { id: 2, image: '/images/dog2.jpg', title: 'Siesta perfecta', description: 'Nada como una siesta al sol' },
  { id: 3, image: '/images/cat1.jpg', title: 'Gatito curioso', description: 'Descubriendo el mundo' },
]);
</script>

<style scoped>
.feed-container {
  padding: 16px;
  background-color: #f5f5f5;
  min-height: 100vh;
}

.title {
  text-align: center;
  font-size: 2rem;
  margin-bottom: 24px;
  color: #ff6f61; /* Color principal */
}

.grid-container {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
  gap: 16px;
}

.card {
  background-color: #fff;
  border-radius: 8px;
  overflow: hidden;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  transition: transform 0.3s;
}

.card:hover {
  transform: translateY(-5px);
}

.card-image {
  width: 100%;
  height: 150px;
  object-fit: cover;
}

.card-content {
  padding: 16px;
}

.card-title {
  font-size: 1.25rem;
  margin-bottom: 8px;
  color: #333;
}

.card-description {
  font-size: 0.875rem;
  color: #666;
}
</style>
