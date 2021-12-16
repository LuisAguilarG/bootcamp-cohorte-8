/*
 Condicionales se utilizan para tomar decisiones dentro de nuestro programa

 if(condicion){
    codigo
    codigo
    }
*/

// Ejemplo 1 con dato estático
// let edad = 20;
// Ejemplo 2 con dato pedido al usuario

let edadUsuario = parseInt(prompt("Ingresa tu edad: "));

if(edadUsuario >= 18 && edadUsuario < 30){
    document.write("Eres un joven");
} else if(edadUsuario >= 30 && edadUsuario < 60){
    document.write("Eres un adulto");
} else if(edadUsuario >= 60){
    document.write("Eres un adulto mayor");
} /* Este es el valor por defecto que se ejecutará en caso de que */
    else if(edadUsuario > 100){
        document.write("Error en la edad");
    }
    else {
    document.write("Eres un niñe");
}

