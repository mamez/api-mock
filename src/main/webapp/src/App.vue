<script setup>
import NavBar from './components/layaut/NavBar.vue'
import SideBar from './components/layaut/SideBar.vue'
import FooterBar from './components/layaut/FooterBar.vue'
</script>

<template>
  <NavBar></NavBar>
  <div id="layoutSidenav">
    <SideBar></SideBar>
      <div id="layoutSidenav_content">
        <main>
          <div class="container-dinamic container-fluid px-4">
            <div class="card mb-4">
              <div class="card-header">
                <i class="fas fa-table me-1"></i>
                DataTable Example
              </div>
              <div class="card-body">
                <h2>contenido</h2>
              </div>
            </div>
          </div>
        </main>
    <FooterBar></FooterBar>
  </div>
</div>
    

   
       <!-- <RouterLink to="/">Home</RouterLink> -->
       <!-- <RouterLink to="/about">About</RouterLink>-->
  <!--<RouterView />-->
</template>

<style scoped>
.container-dinamic{
  margin-top: 20px;
}
</style>
