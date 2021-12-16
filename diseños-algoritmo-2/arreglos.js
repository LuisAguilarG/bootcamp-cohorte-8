/*
Colección de elementos
Tienen métodos o funciones que nos permiten ordenar o 
manipular los datos almacenados
*/


const arreglo1 = [];

// Manera 1
// Si lo imprimimos en consola y extendemos la vista en el navegador, aparecerán funciones que la utilizan
console.log(arreglo1);


// Manera 2
// Tenemos 3 elementos en el arreglo y se empieza a contar desde la posición/índice 0 (1) hasta el 2 (true). 
const arreglo2 = Array.of(1, "Hola", true);
console.log(arreglo2);

// Manera 3 (antigua, no recomendable). Declara e inicializa. 
const arreglo3 = new Array(3, true);

/*
let variable1 = 3;
console.log(variable1);
variable1 = "tres";
console.log(variable1);

Se recomienda utilizar const para arreglos

const variable1 = 3;
console.log(variable1);
*/

// Nota: En javascript puedes añadir en un solo arreglo varios tipos de datos distintos. 
// En java, los arreglos solo pueden contener elementos del mismo tipo de dato. 
// Para los arreglos se utilizan corchetes

const frutas = ["manzana", "naranjas", "uvas", "sandías", [1, 2, 3, 4, 5, ["A", "B", "C"]]];
// Notación de corchetes
console.log(frutas[1]); // Muestra "Naranjas"
console.log(frutas[3]); // Muestra "Sandías"
console.log(frutas[4]); // Muestra todos los elementos del arreglo que está por dentro
console.log(frutas[4][4]); // Muestra "5"
console.log(frutas[4][5][1]); // Muestra "B"
console.log(frutas); // Muestra "['manzana', 'naranjas', 'uvas', 'sandías', Array(6)]"

// Métodos
/* lenght = longitud */
const letras = ["A", "B", "C", "D"];
console.log(letras.length); // Muestra la longitud o cantidad de elementos en el arreglo

/* push = añade un elemento al final de nuestro arreglo sin necesidad de hacerlo cuando se declara*/
letras.push("E"); // Se añade E al final de la lista
console.log(letras); 

/* pop = elimina el último elemento */
letras.pop();
console.log(letras);

/* unshift = agrega un elemento al inicio */
letras.unshift(1);
console.log(letras);

/* shift = elimina el primer elemento */
letras.shift();
console.log(letras);


// Ejemplo para push en un array anidado
frutas[4][5].push("D");
console.log(frutas);








