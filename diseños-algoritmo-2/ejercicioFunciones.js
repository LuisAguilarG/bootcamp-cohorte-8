/* -------------------------------------------------------
Instrucciones del ejercicio múltiple (10 minutos) 10:23 - 10:33 Equipo 8:

Crea una función que calcule el descuento que se le va a hacer a un cliente 
según el valor de su compra.

Si es una compra de menos de 100, se le hará un descuento del 10%. (0-99)
Si es una compra de 100 hasta menos de 200 se le hará un descuento del 20%.(100 - 199)
y si es una compra de más de 200 se le hará un descuento del 30%. (200 =>)

Utiliza prompt, funciones, condicionales y operadores de comparación.

La función debe pedir el precio al cliente, e imprimir el resultado del precio menos el descuento
 ya sea en pantalla o en consola.

(Se guardará en un archivo nuevo llamado ejercicioFunciones.js)

*/

let precio = parseInt(prompt("Introduce el precio de la compra: "));
descuentoCliente (precio);

function descuentoCliente (precio){
    if (precio > 0 && precio < 100){
        console.log(precio - (precio *.10))
    } else if  (precio >= 100 && precio < 200){
        console.log(precio - (precio * .20))
    } else if (precio >= 200){
        console.log(precio - (precio * .30))
    } else {
        console.log("El valor introducido no es válido.")
    }
}

