<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <title>Stock</title>
    </head>
    <body>
    
      <g:each in="${coats}">
        <div class="card bg-primary" style="width: 18rem;">
          <div class="card-body">
            <h5 class="card-title">${it.name}</h5>
            <p class="card-text">Precio: ${it.price}</p>
            <p class="card-text">Color: ${it.color?.name}</p>
            <p class="card-text">Tamaño: ${it.sizze?.name}</p>
            <a href="#" class="card-link text-white">Comprar</a>
          </div>
        </div>
      </g:each>
            <f:table collection="${hats}" />
            <f:table collection="${shoess}" />
            <f:table collection="${shorts}" />

    </body>
</html>
