/* Operadores aritméticos */
// + - / * % ()
/* Jerarquía de operaciones */
/* https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Operators/Operator_Precedence */
let operacion = 3 * 5 + (10 - 5);
console.log(operacion);

let operacion2 = 3 - 5 / 2 * 4;
/* Orden: 5/2 * 4 = 20/2 = 10
3-10 = -7
*/
console.log(operacion2);

/* Operadores relacionales */
/* < > >= <= == === != !== */

console.log(7 < 7); // R= false.
console.log(7 <= 7); // R= true.

console.log(7 == "7"); // R=true. Compara solo el contenido, no el tipo de dato.
console.log(7 === "7"); // R = false. Compara el contenido y el tipo de dato. 

console.log(7 != "7"); // R=false. Compara solo el contenido, no el tipo de dato.
console.log(7 !== "7"); // R= true.


/* Incremento y decremento */
/* +=  -=  *=  /= */

let incremento = 5;
incremento += 5; // Es equivalente a "incremento = incremento + 5".
console.log(incremento); // 10

incremento -= 5;
console.log(incremento); // 5

incremento *= 5;
console.log(incremento); // 25

incremento  /= 5;
console.log(incremento); // 5

/* Operador unario */
/*  ++ -- */
/* Incremento y decremento */
/* Sumar uno, restar uno */

let sumar = 0;
sumar++;
console.log(sumar + " linea 49"); // 1
sumar++;
console.log(sumar + " linea 51"); // 2
sumar--;
sumar--;
sumar--;
console.log(sumar); // -1

/*  */
for(let i = 0; i < 10; i++){
    console.log(i);
}

/* 
++variable = preincremento. Primero modifica el valor y después hace uso de la variable.
variable++ = postincremento. Hacer uso de la variable y luego modifica el valor.
*/
let num = 5;
console.log(num++); // 5
console.log(++num); // 7
console.log(num++); // 7
console.log(num); // 8

for(let i = 0; i < 3; i++){
    console.log("Ciclo padre i (indice): " + i);
    for(let j = 0; j < 5; j++){
        console.log("Ciclo hijo j (indice): " + j);
    }   
}






