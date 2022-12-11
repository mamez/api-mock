<template>
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <!-- Navbar Brand-->
    <a class="navbar-brand ps-3" href="index.html">
    <img class="logo-header"  src="../../assets/logo.png" />    
        Api Mock</a>
    <!-- Sidebar Toggle-->
    <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i
            class="fas fa-bars"></i></button>
    <!-- Navbar Search-->
    <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
        
    </form>
    <!-- Navbar-->
    <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown"
                aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" href="#!">Salir</a></li>
            </ul>
        </li>
    </ul>
</nav>
</template>

<script>
export default {

}
</script>

<style scoped>
.logo-header{
    width: 2.5em;
}

.sb-topnav.navbar{
    background-color: #362360 !important;
    border-block-color: #FFFFFF;
    border-bottom-width: 1px;
    border-bottom-style: solid;
    border-bottom-width: 1px;
}
</style>