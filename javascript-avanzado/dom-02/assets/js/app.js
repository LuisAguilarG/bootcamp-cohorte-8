
/* https://lenguajejs.com/javascript/dom/que-es/#:~:text=Las%20siglas%20DOM%20significan%20Document,DOM%20(o%20simplemente%20DOM). */
/* https://lenguajejs.com/javascript/dom/seleccionar-elementos-dom/ */

/* https://lenguajejs.com/javascript/dom/crear-elementos-dom/ */



/* Por conveción, se utiliza el símbolo de $ cuando una variable hara referencia al dom */
/* let $titulo = document.getElementById('titulo');
console.log(titulo.textContent); //Muestra en consola el contenido
titulo.textContent = 'Titulo escrito desde JS'; */

/* Acceder a un elemento que tenga una "p", también se puede accerder a una clase con ".clase", a un id con "#id" y a una etiqueta con "etiqueta" */
/* Se accede de una forma similar a css cuando damos estilos */

/* En este caso, utilizará el primer elemento que encuentre y cumpla con la condición dentro de los paréntesis */
let $titulo = document.querySelector('#titulo');
$titulo.textContent = 'Titulo escrito desde JS';

/* Hasta aquí, solo imprime el primer elemento p */
let $parrafo = document.querySelector('p');
console.log($parrafo.textContent);

/* Aquí sí se imprimen todos los elementos de tipo p */
let $parrafos = document.querySelectorAll('p');
console.log($parrafos);

/* Aquí se puede acceder solo al tercer elemento p del arreglo con índice 2 */
console.log($parrafos[2].textContent);


/* https://lenguajejs.com/javascript/dom/insertar-elementos-dom/ */

/* Nota: un elemento creado de esta forma no aparecerá en el archivo HTML original, no será modificado. Sin embargo, al momento de cargar en navegador, sí aparecerá momentáneamente en la estructura HTML. */
/* Es muy útil para páginas dinámicas, no tanto para estáticas */
let $subtitulo = document.createElement('h3');
$subtitulo.textContent = 'Elemento de HTML creado desde JS';
console.log($subtitulo);
/* document.body.append($subtitulo); */ //Hasta este punto se ha agregado al html
/* document.body.insertAdjacentElement("beforebegin", $subtitulo); */
$titulo.insertAdjacentElement("afterbegin", $subtitulo);
$titulo.insertAdjacentElement("afterend", $subtitulo);
$titulo.insertAdjacentElement("beforebegin", $subtitulo);

$titulo.remove();




let $contenido = document.querySelector('#contenido');
console.log($contenido);

/* Nos devuelve todo el contenido */
console.log($contenido.innerHTML);
/* Nos devuelve solo el texto dentro */
console.log($contenido.textContent = 'Hola');
/* Nos devuelve solo el texto dentro */
console.log($contenido.textContent);


/* Inner modifica a los hijos */
/* outer modifica al padre y a los hijos */

let $contenido2 = document.querySelector('#contenido');
/* console.log($contenido2.textContent = '<br>'); */

/* console.log($contenido2.innerHTML = '<br>'); */

/* console.log($contenido2.outerHTML = 'Hola'); */

let $contenidoParrafo = document.createElement('p');
$contenidoParrafo.textContent = 'Contenido de mi nuevo parrafo';
$contenido.appendChild($contenidoParrafo);




