
/* Código síncrono */

let variableSincrona;
variableSincrona = 10 * 3;
console.log(variableSincrona);


/* Código asíncrono */

let variableAsincrona;

/* Utilizando una función anónima */
setTimeout( () => {
    variableAsincrona = 10 *3;
    console.log(variableAsincrona);
}, 2000);

console.log(variableAsincrona);

/* Para las APIS, no se utiliza setTimeout, se utilizan otros mecanismos */