
let title = document.getElementsByTagName("h1");
let person = "";

function setName() {
    person = prompt("Ingresa tu nombre: ");
    title[0].textContent = "Hola " + person;
    console.log(title[0].textContent);
}

console.log(title[0].textContent);



