/*
 * multiplicar cada numero por dos
 * guardar los resultados en un arreglo llamado 'resultado'
 * imprimir en consola o en el body cada elemento del arreglo 'resultado'
 */

const numeros = [1, 4, 7, 9, 19, 15, 46, 27, 40, 123];

for (let i = 0; i < numeros.length; i++) {
	let resultado = numeros[i] * 2;
	console.log(resultado);
	document.write(
		"<h2>" + "Indice [" + i + "] tiene el valor: " + resultado + "</h2>"
	);
}
