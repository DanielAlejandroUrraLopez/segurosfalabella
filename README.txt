- para ingresar a la pantalla del consumo del api, es en la siguiente url: http://localhost:8080/swagger-ui.html
en donde se debe seleccionar la opción seguros-falabella-test-controller, donde se desplegaran los métodos de la api.
- para agregar un producto se debe seleccionar el método llamado /api/Segurosfalabella/agregarProducto
Agregar producto, en el cual luego se debe dar click en el botón try it out, donde se mostrara la estructura del objeto a enviar, dejo datos de ejemplo

--------------------------------------------------
{
    "id": 1,
    "nombre": "Full cobertura",
    "price": 100,
    "sellIn": 80
  }
----------------------------------------------------
  {
    "id": 2,
    "nombre": "Mega cobertura",
    "price": 100,
    "sellIn": 80
  }
----------------------------------------------------
  {
    "id": 3,
    "nombre": "Full cobertura Super duper",
    "price": 100,
    "sellIn": 80
  }
------------------------------------------------------
  {
    "id": 4,
    "nombre": "Super avance",
    "price": 100,
    "sellIn": 80
  }
--------------------------------------------------------
  {
    "id": 5,
    "nombre": "Mega cobertura",
    "price": 180,
    "sellIn": 10
  }
-----------------------------------------------------------
  {
    "id": 6,
    "nombre": "Otro",
    "price": 180,
    "sellIn": 10
  }
-------------------------------------------------------------------
se deben ingresar, registro por registro.
- para consultar la base de datos se debe ingresar a la siguiente url:http://localhost:8080/h2    los datos de la conexión se llenan de manera automática
por los datos que se encuentran en el properties de la aplicación el password es user
- luego de agregar los productos se debe ir al método /api/Segurosfalabella/ventaDeProducto/{id}  donde se debe ingresar solo el id del producto a vender
- luego se debe ir al método /api/Segurosfalabella/listaProductosVendidos donde al dar click para ejecutar el método este retornara un json con los 
Productos vendidos y en la consola de la aplicación imprimir los nombres.
-para calcular el nuevo precio de los productos se debe ir al método /api/Segurosfalabella/listaProductosVendidosXDias/{dias}  donde se ingresa la cantidad 
De días a calcular retorna un json con los nuevos valores y también los imprime en la consola con el formato solicitado por cantidad de días.
