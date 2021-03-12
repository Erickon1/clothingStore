<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <!-- 
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    -->
    <title>
        <g:layoutTitle default="Clothes"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">


</head>

<body>

<nav class="navbar  navbar-dark bg-dark">
  <div class="container-fluid">
    <g:link uri="/"  class="navbar-brand"  >Naty</g:link>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
      data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <g:link uri="/">Home</g:link>
        </li>
        <li class="nav-item">
          <g:link controller="hat" action="index">Hat</g:link>
        </li>
      </ul>
    </div>
  </div>
</nav>

<g:layoutBody/>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>


</body>
</html>
