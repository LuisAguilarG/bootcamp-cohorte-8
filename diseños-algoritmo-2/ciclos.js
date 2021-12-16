/*
 * Ciclos en Javascript
 * Ciclo While
 * Realiza un bolque de codigo mientras la condicion se cumpla.
 * while(condicion){
 * tu codigo
 * modificacion a nuestro valor inicial
 * }
 *
 */
/*
 * let condicion = 1;
 * while (condicion <= 10) {
 * 	console.log(condicion);
 * 	// condicion += 2;
 * 	condicion++;
 * }
 */

/*
 * Ciclo do while
 * Realiza el bloque de codigo por lo menos una vez
 */
let numero = 10;
do {
	console.log(numero);
	numero++;
} while (numero <= 20);

/*
 * Ciclo for
 */
let comidas = ["Pozole", "Tacos", "Tortas", "Sandwich"];

for (let i = 0; i < comidas.length; i++) {
	console.log(comidas[i]);
}
