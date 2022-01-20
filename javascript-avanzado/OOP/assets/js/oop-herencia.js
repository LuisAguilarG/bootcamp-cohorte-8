
/* https://medium.com/@jmz12/javascript-el-paradigma-de-poo-b04d19b6322c */

/* https://medium.com/beginners-guide-to-mobile-web-development/super-and-extends-in-javascript-es6-understanding-the-tough-parts-6120372d3420 */

class Pokemon {
    constructor(nombre, tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Métodos
    atacar() {
        return console.log(`${this.nombre} está atacando.`);
    }
}

class Pikachu extends Pokemon {

    // Si dejamos la clase hija sin constructor, por defecto se utilizará el constructor de la clase padre.
    constructor(nombre, tipo, edad) {
        // Para utilizar el constructor de la clase padre
        super(nombre);
        this.edad = edad;
    }

    evolucionar(){
        return console.log(`${this.nombre} está evolucionando.`);
    }
}

// Presionar ctrl y mover el cursos sobre una propieda/clase nos mostrará de donde proviene. 
const pikachu1 = new Pikachu("Juan", 3); // Pertenece a la clase pikachu

console.log(pikachu1);
pikachu1.atacar();
pikachu1.evolucionar();

const otroPokemon = new Pokemon("Charmander", "Fuego"); // Pertenece a la clase pokemón
otroPokemon.atacar();
otroPokemon.atacar();

/* Extender de una clase significa que la clase hija va a heredar TODOS los atributos y MÉTODOS de las clases padre , abuelo, etc. Esto puede afectar negativamente el rendimiento, por lo que es recomendable ser consciente de este efecto.  */

