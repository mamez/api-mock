<template>
  <NavBar/>
  <div id="layoutSidenav">
    <SideBar/>
      <div id="layoutSidenav_content">
        <main>
          <router-view/>
        </main>
    <FooterBar/>
  </div>
</div>
</template>

<script setup>
import NavBar from './NavBar.vue';
import SideBar from './SideBar.vue';
import FooterBar from './FooterBar.vue';
</script>