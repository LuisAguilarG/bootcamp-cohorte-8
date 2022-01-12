/*
Escribir un programa que detecte el cupón que tiene el usuario.

Bronce se le hará el descuento del 5%.
Plata descuento del 10%
Oro descuento del 20%
Platino descuento del 25%

-El usuario introduce un precio primero y después el cupón.
-El programa debe mostrar el precio original y el precio con el descuento aplicado.
-También debe mostrar el mensaje "El cupón no es válido" en caso de que sea un cupón equivocado.

Ejercicio en equipos: Sala 1.

*/



let precioUsuario = parseFloat(prompt("Introduce el precio $: "));
let cuponUsuario = prompt("Introduce el cupón (Bronce, Plata, Oro o Platino) $: ");
let descuento;
let precioFinalUsuario;
let valido = true;

switch (cuponUsuario) {
    case "Bronce":
        descuento = .05;
        break;

    case "Plata":
        descuento = .1;
        break;

    case "Oro":
        descuento = .2;
        break;

    case "Platino":
        descuento = .25;
        break;

    default:
    document.write(`Algún dato no es válido <br>`);
    valido = false;
        break;
}

if(valido != false){
    precioFinalUsuario = precioUsuario - (precioUsuario * descuento);
    document.write(`El precio inicial era $ ${precioUsuario} <br> El descuento es de $ ${descuento*100}% <br> El precio final es de $ ${precioFinalUsuario} `);
}
