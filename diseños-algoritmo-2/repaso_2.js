/*
# Arreglos
 */

const comidas = ["pozoles", "quesadillas", "tacos"];

console.log(comidas.length);

/*
 * push    = agrega el ultimo elemento del arreglo.
 * pop     = elimina el ultimo elemento del arreglo.
 * unshift = agrega un elemento al inicio del arreglo.
 * shift   = elimina un elemento al inicio del arreglo.
 */
comidas.push("tortas");
console.log(comidas.length);
comidas.push();
console.log(comidas.length);
comidas.unshift("pancita");
console.log(comidas);

/*
 * for each con el arreglo utiliza un bloque de codigo por cada elemento en un arreglo
 */
/* comidas.forEach(function (elem) {
	console.log(elem);
});
 */
let num = [1, 4, 8, 12];
console.log(num);
num.forEach(function (elem) {
	let suma = elem + elem;
	console.log(suma);
});

/*
 * ejercicio
 */
const arr = [];
function suma(numero) {
	let sumNum = numero + 1;
	return arr.unshift(sumNum);
}
suma(2);
suma(5);
suma(6);
suma(79);
console.log(arr);
