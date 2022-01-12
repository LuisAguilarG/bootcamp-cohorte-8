/* 
Buenos días 6-11
Buenas tardes 12 - 18
Buenas noches 19 - 23
Dejame dormir 0 - 5
*/

let horaUsuario = parseInt(prompt("Introduce solo la hora actual (0-23): "));

if(horaUsuario >= 6 && horaUsuario <= 11){
    document.write(`Buenos días. La hora actual es ${horaUsuario} <br>`);
}

else if(horaUsuario >= 12 && horaUsuario <=18) {
    document.write(`Buenas tardes. La hora actual es ${horaUsuario} <br>`);
}

else if(horaUsuario >= 19 && horaUsuario <=23) {
    document.write(`Buenas noches. La hora actual es ${horaUsuario} <br>`);
}

else if(horaUsuario >= 0 && horaUsuario <=5) {
    document.write(`Déjame dormir. La hora actual es ${horaUsuario} <br>`);
}
else {
    document.write(`La hora que introdujiste no es válida.`);
}

