
/* https://lenguajejs.com/javascript/caracteristicas/eventos/ */


let $titulo = document.querySelector('#titulo');
let $mensaje = document.querySelector('#mensaje');
let $btnMensaje = document.querySelector('#btnMensaje');
let $spanError = document.querySelector('span');


/* Función anónima, pues no tiene nombre y solo vive dentro del código. Se puede utilizar también la función de flecha. Puede ser incluso una función que nosotros definamos. */
$btnMensaje.addEventListener('click', () => {
    console.log('No me presiones');
});

$mensaje.addEventListener('keydown', (e) => {

    console.log(e.target.value);

    if(e.target.value.length < 3) {
        $spanError.classList.remove('hide');
        $spanError.classList.add('error');
    } else {
        $spanError.classList.add('hide');
        $spanError.classList.remove('error');
    }

    /* console.log(e); */
});

/* $mensaje.addEventListener('keydown', () => {
    console.log('Escribiste algo');
}); */



/* $mensaje.addEventListener('keydown', funcionPropia);

function funcionPropia() {
    console.log('Esto está dentro de la función propia');
} */

