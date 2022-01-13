
let numeros = [1, 3, 13, 23, 532, 328, 123, 6865, 812];

/* Función anónima "function(), no se puede acceder fuera de ella, es de cierta forma desechable" */

/* numeros.forEach(function (n) {
    document.write(n + ", ");
});
    
 */
/* (method) Array<number>.forEach(callbackfn: (value: number, index: number, array: number[]) => void, thisArg?: any): void
Performs the specified action for each element in an array.

@param callbackfn — A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.

@param thisArg — An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value. */

/* https://medium.com/@khriztianmoreno/funciones-sobre-arreglos-que-debes-conocer-en-javascript-bae9d9ff8e52 */

/* numeros.forEach(function (elemento, indice, arreglo) {
    document.write("<br>" + elemento + "-" + indice);
    document.write(arreglo);
});

numeros.forEach(elemento => {
    document.write("<br" + elemento + ", ");
});
*/


/* let numeros2 = numeros.map(function(elemento) {
    return elemento;
});  */

/* document.write("<br>" + numeros2); */

/* let frutas = ["mango", "uva", "piña"];
let frutas2 = frutas; */
/* Para SÍ crear un nuevo array basado en "frutas" */

/* let frutas2 = frutas.map(function(elemento) {
    return elemento;
}); */


/* Esto no funcionará, pues anteriormente solo se copiaron los valores que había en "frutas", no se creó un nuevo array */

/* frutas2.push("pera");

document.write("<br>" + frutas + "<br>");
document.write("<br>" + frutas2 + "<br>");


let numeros2 = numeros.map(function(elemento) {
    return elemento * 1.15;
});

document.write("<br>" + numeros2 + "<br>");

 */


/* https://medium.com/@khriztianmoreno/funciones-sobre-arreglos-que-debes-conocer-en-javascript-bae9d9ff8e52 */

/* includes (está o no está) */

document.write("<br>" + numeros.includes("hola") + "<br>")



/* Si se cumple la condición, los elementos true terminarán copiándose también a "numerosPares". */
let numerosPares = numeros.filter((elemento) => {
/*     if (elemento % 2 == 0) {
        return true;
    } else {
        return false;
    } */

    /* return elemento % 2 == 0; */ //Esta también es una forma de retornar los valores que nos interesan

    if(elemento > 10) {
        return true;
    }
});

/* https://medium.com/@khriztianmoreno/funciones-sobre-arreglos-que-debes-conocer-en-javascript-bae9d9ff8e52 */

document.write("<br>" + numerosPares + "<br>");

let frutas = ["Mango", "Uva", "Piña", "Mandarina", "Manzana", "aguacate"];
let frutasFiltro = frutas.filter((fruta) => {
    if(fruta.includes("man") == true) { // También se puede dejar como if(fruta.contains("man")) {}
        return true;
    }
    /* return fruta.includes("Man"); */ // Forma alternativa

    return fruta.toLowerCase().includes("m");
});

document.write("<br>" + frutasFiltro + "<br>");

/* Sort */
let otrosNumeros = [9, 2, 3, 5, 1, 4, 8, 6, 7]

/* Es más recomendable para ordenar string, en números no. */
document.write("<br>" + numeros.sort() + "<br>");

document.write("<br>" + otrosNumeros.sort() + "<br>");
document.write("<br>" + otrosNumeros + "<br>");

/* Para ordenar palabras basándose en cada uno de los caracteres */

document.write("<br>" + frutasFiltro.sort() + "<br>");


/* Reverse invierte el orden de los elementos de un arreglo. Este cambia el orden real. */
document.write("<br>" + numeros.reverse() + "<br>");
document.write("<br>" + numeros + "<br>");


/* find obtiene el primer elemento que cumpla con una condición */
let frutaEncontrada = frutas.find((elemento) => {
    return elemento.toLowerCase().includes("ma");
});

document.write("<br>" + frutaEncontrada + "<br>");


