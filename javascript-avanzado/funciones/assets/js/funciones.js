/* Funcion
    Es un bloque de código reutilizable.
    Puede tener o no parámetros de entrada.
    Puede devolver o no un valor.
    Se pueden mandar objetos dentro de los parámetros de una función.
*/

/* Función con dos parámetros (numero1 y numero2) */
function sumar(numero1, numero2) {
    /* Operaciones o código a ejecutar */
    // "numero1 + numero2;" sin el valor, se ejecutaría 
    return numero1 + numero2; // El valor por defecto en return de JS es "undefined".
    console.log("Hola desde la función");
}

function restar(n1, n2) {
    document.write(`La resta esta de ${numero1} y ${numero2} es ${n1 - n2} <br>`);
}

let numero1 = parseInt(prompt("Número 1: "));
let numero2 = parseInt(prompt("Número 2: "));
/* Invocamos la función con el uso de un argumento */
let suma = sumar(numero1, numero2);


/* Template string */
/* Símbolo de backstick */
/* Te permite combinar strings con código de javascript */
document.write(`La suma de ${numero1} y ${numero2} es ${suma} <br>`);
restar(numero1, numero2);
document.write(`La multiplicación de ${numero1} y ${numero2} es ${numero1*numero2} <br>`);
document.write('La suma de ' + numero1 + " y " + numero2 + " es " + suma);

