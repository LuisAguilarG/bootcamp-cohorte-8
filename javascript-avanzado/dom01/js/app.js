
/* Acceder al elemento con id title */
let title = document.getElementById("title");

/* Imprimir en consola */
console.log(title);
/* Mostrará esto (el nodo): */
/* <h1 id="title">Javascript DOM</h1> */

title.textContent = 'Este texto está escrito desde Javascript';

/* Podemos acceder también a un elemento por medio de su índice correspondiente en la colección en la que se encuentre */
let parrafos = document.getElementsByTagName("p");
console.log(parrafos);
/* parrafos[0].textContent = "Párrafo 1";
parrafos[1].textContent = "Párrafo 2"; */

/* Para cambiar todos los elementos de la colección en "parrafos", se tiene que modificar uno por uno, no se pueden modificar todos a la vez */

/* Incorrecto: */
/* parrafos.textContent = "Nuevo contenido de parrafos" */

/* Correcto:  */
/* for(let i = 0; i < parrafos.length; i++){
    parrafos[i].textContent = "parrafo " + i + " escritos desde Javascript"
} */

let email = document.getElementById("email");
let password = document.getElementById("password");

function getInformation() {
    console.log(email.value);
    console.log(password.value);
}

