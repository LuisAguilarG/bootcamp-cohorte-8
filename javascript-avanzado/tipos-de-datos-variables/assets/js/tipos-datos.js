let nombre = "Luis Aguilar";
let edad = 31;
let tienesTrabajo = true;
let variableNull = null;
let variableUndefined;


console.log(typeof(nombre)); /* String */
console.log(typeof(edad)); /* Number */
console.log(typeof(tienesTrabajo)); /* Boolean */
console.log(typeof(variableNull)); /* Null */
console.log(typeof(variableUndefined)); /* Undefined */


console.log(variableUndefined === variableNull)

console.log(variableUndefined == variableNull)

/* -------------- */

/* https://discuss.codecademy.com/t/what-is-the-difference-between-triple-equals-and-double-equals-in-javascript/365528 */

/* Operador igualdad estricta */
/* Comparará tanto el valor como el tipo de los operandos (los valores en los lados izquierdo/derecho del operador). Si el valor es el mismo pero el tipo no lo es, la igualdad se evaluará como falsa. */

console.log(4 === "4");

/* Operador igualdad */
/* Esto se debe a que los operandos del operador de igualdad se convertirán al mismo tipo (si aún no lo son) antes de que se comparen los valores de los operandos. */

console.log(4 == "4");


console.log(0 === false);

console.log(typeof(10 + 10));
console.log(typeof("10" + 10));
console.log("10" + 10);
console.log(typeof(parseInt("11")));
console.log(parseInt("123abc"));
console.log(parseInt("abc")); /* NaN / Not a number */


/* Número a string */
let numero = 10;
console.log(numero.toString());

/* https://codeburst.io/javascript-double-equals-vs-triple-equals-61d4ce5a121a */

/* triple igual
Cuando usamos triples iguales ===en JavaScript, estamos probando la igualdad estricta . Esto significa que tanto el tipo como el valor que estamos comparando deben ser iguales. */


/* Doble igual
Cuando usamos doble igual en JavaScript, estamos probando la igualdad flexible. Double equals también realiza coerción de tipos .
Coerción de tipo significa que solo se comparan dos valores después tratando de convertirlos en un tipo común. */

/* There are only six falsy values in JavaScript you should be aware of:

false — boolean false
0 — number zero
“” — empty string
null
undefined
NaN — Not A Number 
*/

