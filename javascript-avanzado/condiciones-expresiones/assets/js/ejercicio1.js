
/* Mejorar código de la sesión de objetosString.js */

let fraseOriginal = prompt("Ingresa la frase que quieres invertir: ");


function invertirFrase(frase) {
    frase = frase.split("").reverse().join("");
    return frase;
}

document.write(`La frase original es: ${fraseOriginal} <br> La frase invertida es: ${invertirFrase(fraseOriginal)}`);