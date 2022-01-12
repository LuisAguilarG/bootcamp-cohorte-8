/* El orden en el que se van ejecutando las instrucciones */
/* Estructuras de control */

let edad = 17;
let tienesINE = true;

/* Símbolo (AND) && se llama ampersand */
/* Símbolo (OR) || */

if (edad >= 18 && tienesINE == true){
    console.log("Puedes entrar");
} else {
    console.log("No puedes entrar");
}

/* Operador ternario, versión simplificada de un if else */
/* (Condición a evaluar) ? se ejecuta si es verdadero : se ejecuta si es falso; */

let edadUno = 17;

/* https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Expressions_and_Operators#comparison_operators */
/* https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator */

/* Forma 1 */
(edadUno >= 18) ? console.log("Mayor de edad") : console.log("Menor de edad");

/* Forma 2 */
(edadUno >= 18)
    ? console.log("Mayor de edad") 
    : console.log("Menor de edad");

let pregunta = (edadUno >= 18)
    ? "Mayor de edad"
    : "Menor de edad";

console.log(pregunta);

let preguntaEdad = `Tengo ${edadUno} años y soy ${edadUno >= 18 ? "mayor" : "menor" } de edad`;

console.log(preguntaEdad);

let dia = 5;

if(dia === 0) {
    console.log("Domingo")
} else if(dia === 1) {
    console.log("Lunes");
} else if(dia === 2) {
    console.log("Martes");
} else if(dia === 3) {
    console.log("Miércoles");
} else if(dia === 4) {
    console.log("Jueves");
} else if(dia === 5) {
    console.log("Viernes");
} else if(dia === 6) {
    console.log("Sábado");
} else {
    console.log("Ese no es un día");
}

/* Switch case */

/* 
switch (variable a evaluar){
    case valor: 
        codigo a ejecutar
    break;

    case valor2:
        codigo a ejecutar
    break;
    default: 
        código a ejecutar
    break;
} 

*/

switch(dia){
    case 0: 
        console.log("Domingo");
        break;
    case 1:
        console.log("Lunes");
        break;
    
    case 2:
        console.log("Martes");
        break;

    case 3:
        console.log("Miércoles");
        break;

    case 4:
        console.log("Jueves");
        break;

    case 5:
        console.log("Viernes");
        break;

    case 6:
        console.log("Sábado");
        break;

    default:
        console.log("No es un día válido");
        break;
}



let cuponDescuento = "Oro";
let descuento;

console.log(descuento);

switch(cuponDescuento){
    case "Bronce":
        descuento = 5;
        break;
    case "Plata":
        descuento = 10;
        break;
    case "Oro":
        descuento = 15;
        break;
    default: 
        console.log("Cupón erróneo");
        break;
}

console.log(descuento);


