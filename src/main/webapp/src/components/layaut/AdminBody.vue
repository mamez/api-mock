<template>
    <div class="container-dinamic container-fluid px-4">
        <div class="card mb-4">
            <div class="card-header">
                <i class="fas fa-table me-1"></i>
                {{title}}
            </div>
            <div class="card-body">
                <slot></slot>
            </div>
        </div>
    </div>
</template>

<script setup>
   const props = defineProps({
       title: String
   })
</script>

<style>
.container-dinamic {
    margin-top: 20px;
}
.card-header{
    background-color: #EFEFEF !important;
}
</style>