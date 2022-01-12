/* Función normal */
/* Se puede llamar antes de ser declarada o después, no importa el orden. */
/* function sumar(numero1, numero2) {
    Operaciones o código a ejecutar
    return numero1 + numero2;
} */

/* Arrow function / Función de flecha */
/* La diferencia es que no puede ser llamada antes de ser declarada, por lo que el orden del código importa */
const sumar = (numero1, numero2) => {
    return numero1 +numero2;
}

let numero1 = parseInt(prompt("Número 1: "));
let numero2 = parseInt(prompt("Número 2: "));
/* Invocamos la función con el uso de un argumento */
let suma = sumar(numero1, numero2);

document.write(`La suma de ${numero1} y ${numero2} es ${suma} <br>`);
