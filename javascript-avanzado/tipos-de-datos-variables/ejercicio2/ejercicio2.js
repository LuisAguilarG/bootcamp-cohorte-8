let edad = document.getElementById("parrafoEdad");
let añoActual = 2022;

function calcularEdad() {
    edadAñoUsuario = prompt("Ingresa tu año de nacimiento, formato (aaaa): ");
    edad.textContent = "Este año cumplirás/cumpliste: " + (añoActual - edadAñoUsuario) + " años.";
}