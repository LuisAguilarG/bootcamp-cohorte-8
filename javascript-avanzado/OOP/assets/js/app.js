
/* JavaSript es multiparadigma */
// Aparentemente nos deja trabajar con clases, sin embargo por detrás sigue traduciendo y funcionando con prototipos. 

/* Clases, molde que nos permite crear objetos */

class Animal {
    // El constructor es opcional, pero muy útil para asignar propiedades cuando se crean objetos
/*     constructor() {
        console.log('Este es un constructor');
    } */

    // En javascript no podemos usar antes de las variables las palabras reservadas "let", "const" o "var". Además, podemos omitirlos al inicio siempre y cuando los declaremos en el constructor. En java sí es necesario.


    // Estos atributos son públicos por defecto. Si bien JavaSript ahora en su nueva versión puede declarar atributos como privados, no es una característica soportada por todos los navegadores y no es recomendable de momento. En Java sí se pueden declarar como privados, públicos o protegidos. Más información: 
    // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes/Private_class_fields
    nombre;  
    especie;

    constructor(n, e) {
        // This es una palabra reservada que hace referencia al contexto en que se está utilizando
        this.nombre = n; // Hace referencia a la propiedad "nombre" de la clase Animal
        this.especie = e; // Hace referencia a la propiedad "especie" de la clase Animal

        /* Si dejamos apretado ctrl y movemos el cursor a "this.nombre", VS Code nos muestra aqué parte del código pertenece el atributo */
    }

    // getters y setters
    // Utilizan palabras reservadas "get" y "set".
    /* Debe haber un get y set por cada uno de los atributos de la clase */
    get getNombre(){
        return this.nombre;
    }

    set setNombre(nombre){
        this.nombre = nombre;
    }

    get getEspecie() {
        return this.especie;
    }

    set setEspecie(especie) {
        this.especie = especie;
    }


    // Métodos (funciones)
    presentarse(){
        document.write(`Hola soy ${this.especie} y me llamo ${this.nombre} <br>`);
    }

    cambiarNombre(nuevoNombre){
        this.nombre = nuevoNombre;
        let mensaje = `Mi nuevo nombre es ${this.nombre} y soy un ${this.especie} <br>`;
        document.write(mensaje);
        return mensaje;
    }
    
    // Método estático
    // Pertenece solo a la clase, no se van a heredar a los objetos. 
    static saludar() {
        return console.log("Hola, soy un método estático");
    }
}

/* Animal.presentarse(); */ // error, puesto que no se ha creado el objeto en este punto del código.

Animal.saludar(); // Sí ejecuta sus instrucciones incluso sin un objeto creado, ya que es un método estático. Puede vivir sin necesidad de estar en una instancia. 



/* Crear un objeto a partir de una clase se llama instanciar */
const animalUno = new Animal('Scooby', 'Perro'); // Crea un objeto llamado animalUno

console.log(animalUno);

const animalDos = new Animal('Pecas', 'Gato');
console.log(animalDos);

const animalTres = new Animal();

animalUno.presentarse();
animalDos.presentarse();
animalTres.presentarse();


console.log(animalUno.nombre);
// Se puede cambiar el nombre directamente ya que el atributo es público.
animalUno.nombre ="Scrappy";
console.log(animalUno.nombre);
// Se puede cambiar también con el método correspondiente, aunque no haría falta  en este caso puesto que es público. *Ver el método cambiar nombre en la clase*

animalUno.cambiarNombre("Oddie");


// GETTERS y SETTERS
// get = Obtener el valor de una atributo
// set = fijar o cambiar el valor de un atributo

// Nota, aunque es un método perteneciente a un objeto, no hace falta utilizar paréntesis debido a las palabras reservadas"set" y "get".
console.log(animalUno.getNombre);

// Aquí sucede lo mismo que se menciona arriba, no hace falta utilizar los paréntesis. 
animalUno.setNombre = "Manchas";
console.log(animalUno.getNombre);
console.log(animalUno);


