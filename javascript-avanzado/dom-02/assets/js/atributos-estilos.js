/* https://lenguajejs.com/javascript/dom/insertar-elementos-dom/ */


let $titulo = document.querySelector('#titulo');
let $texto = document.querySelector('.texto');

$texto.id = 'texto';

/* $texto.style = 'color: white; font-size: 24px; background-color: black'; */

/* Para añadir una clase sin eliminar las que ya están */
$texto.className += ' bg-purple';

/* Esto remplaza completamente las clases que tenía */
$texto.className = 'bg-purple';

$texto.className = 'h3';

/* Otra forma de añadir clases (más recomendable que la anterior) */

$texto.classList.add('text-center', 'bg-purple');

$texto.classList.remove('bg-purple');

