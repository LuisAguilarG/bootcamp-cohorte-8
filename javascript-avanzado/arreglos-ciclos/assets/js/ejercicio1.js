/* 
Crear un arreglo con 20 números. Mostrar en HTML la suma de dichos números y el promedio.
*/

const numeros = [5, 20, 10, 45, 95, 99, 32, 42, 23, 12, 46, 81, 6, 1, 9, 78, 54, 11, 27, 60];
let suma = 0;
let promedio;

numeros.forEach(function(elemento) {
    suma = suma + elemento;
});

promedio = suma / numeros.length;


document.write(`Números: ${numeros} <br>`);
document.write(`Suma: ${suma} <br>`);

document.write(`Promedio: ${promedio}`);