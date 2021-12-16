/* 
Variable var se utilizaba anteriormente, son variables globales. 
Variable let es una variable de contexto, solo vive en un bloque de código. 
*/


var numero = 40;
console.log(numero); // valor 40

if(true){
    var numero = 50;
    console.log(numero); // valor 50
}
console.log(numero); // 50



var texto = "bootcamp java"; // Existe con alcance global
console.log(texto);

if(true){
    // console.log(texto); Daría error pues no se ha inicializado todavía
    let texto = "Cohorte 8"; // Solo existe dentro de las llaves
    console.log(texto);
    let numeroFavorito = 11; // Solo existe dentro de las llaves
    /* Cuando se termina de ejecutar el bloque de código, las variables se "destruyen" */
}

// La var texto es distinta del let texto

// console.log(numeroFavorito); /* Si se intenta imprimir, saldrá: Uncaught ReferenceError: numeroFavorito is not defined */
console.log(texto); // Imprime el valor que está por fuera, de alcance global

