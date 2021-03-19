<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <title>Stock</title>
    </head>
    <body>
    

    <form controller="stock" action="save" method="post" name="myForm" id="myForm">


      <div class="mb-3">
        <label class="form-label">Nombre</label>
        <g:field type="text" name="nameCoat" required=""/>
      </div>
      <div class="mb-3">
        <label class="form-label">Precio</label>
        <input type='number' step='0.01' value='0.00' placeholder='0.00'
         name="price" class="form-control" id="price"/>
      </div>
      <div class="mb-3">
        <label class="form-label">Total</label>
        <g:field type="number" step='0.01' value='0.00' placeholder='0.00' name="total" required=""/>
      </div>
      <g:submitButton name="update" value="Create" />

    </form>


    </body>
</html>
