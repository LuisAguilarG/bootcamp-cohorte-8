
/* 
Función 
Bloque de código reutilizable

function nombre(parametros){
    return 
}

nombre(argumentos);
*/

function procesadorDeFrutas(manzanas, naranjas){
    let jugo = "Jugo de " + manzanas + " manzanas y " + naranjas + " naranjas.";
    return jugo;
    // Hasta aquí, la única forma de acceder a la variable "jugo" es por medio del return, ya que es de contexto (no es una variable global).
    // Cuando terminan de ejecutarse las instrucciones de la función, los valores se "borran" o "dejan de existir" hasta que se vuelva a hacer uso de ella.
}

// En esta función le damos como argumento los valores 4 y 0, además obtenemos de retorno el texto: "Jugo de 4 manzanas y 0 naranjas".
let jugoDeManzana = procesadorDeFrutas(4, 0);
console.log(jugoDeManzana);

// En esta función le damos como argumento los valores 0 y 5, además obtenemos de retorno el texto: "Jugo de 0 manzanas y 5 naranjas." 
let jugoDeNaranja = procesadorDeFrutas(0, 5);
console.log(jugoDeNaranja);

