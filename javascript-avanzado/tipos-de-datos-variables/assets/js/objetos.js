
/* Colección de información, estructurada con pares de claves y valores */

/* let miObjeto = {
    /* Pares de clave valor */
    /* clave: "valor" */
    /* nombre: "Carlos Eduardo" */
/* }  */

/* Variables independientes */

let nombre = "Luis Aguilar";
let edad = 22;
let direccion = "Ciudad de México"
let numero = 5500000000;

console.log(nombre);


/* Objeto */
let persona = { // Llaves porque es objeto
    nombre: "Luis Aguilar",
    sumar: function(num1, num2) {
        let suma = num1 + num2;
        return suma;
    },
    edad: 22,
    direccion: {
        ciudad: "Ciudad de México",
        estado: "Ciudad de México"
    },
    numero: [ // Corchetes porque es un arregl
        5500000001,
        5500000002
    ]
}

console.log(persona.sumar(5, 10));

console.log(persona);
/* Imprime:  
{nombre: 'Luis Aguilar', edad: 22, direccion: {…}, numero: Array(2)}
    direccion:
        ciudad: "Ciudad de México"
        estado: "Ciudad de México"
        [[Prototype]]: Object
    edad: 22
    nombre: "Luis Aguilar"
    numero: Array(2)
        0: 5500000001
        1: 5500000002
        length: 2
        [[Prototype]]: Array(0)
        at: ƒ at()
        concat: ƒ concat()
        constructor: ƒ Array()
        copyWithin: ƒ copyWithin()
        entries: ƒ entries()
        every: ƒ every()
        fill: ƒ fill()
        filter: ƒ filter()
        find: ƒ find()
        findIndex: ƒ findIndex()
        findLast: ƒ findLast()
        findLastIndex: ƒ findLastIndex()
        flat: ƒ flat()
        flatMap: ƒ flatMap()
        forEach: ƒ forEach()
        includes: ƒ includes()
        indexOf: ƒ indexOf()
        join: ƒ join()
        keys: ƒ keys()
        lastIndexOf: ƒ lastIndexOf()
        length: 0
        map: ƒ map()
        pop: ƒ pop()
        push: ƒ push()
        reduce: ƒ reduce()
        reduceRight: ƒ reduceRight()
        reverse: ƒ reverse()
        shift: ƒ shift()
        slice: ƒ slice()
        some: ƒ some()
        sort: ƒ sort()
        splice: ƒ splice()
        toLocaleString: ƒ toLocaleString()
        toString: ƒ toString()
        unshift: ƒ unshift()
        values: ƒ values()
        Symbol(Symbol.iterator): ƒ values()
        Symbol(Symbol.unscopables): {copyWithin: true, entries: true, fill: true, find: true, findIndex: true, …}
        [[Prototype]]: Object
    [[Prototype]]: Object
        constructor: ƒ Object()
        hasOwnProperty: ƒ hasOwnProperty()
        isPrototypeOf: ƒ isPrototypeOf()
        propertyIsEnumerable: ƒ propertyIsEnumerable()
        toLocaleString: ƒ toLocaleString()
        toString: ƒ toString()
        valueOf: ƒ valueOf()
        __defineGetter__: ƒ __defineGetter__()
        __defineSetter__: ƒ __defineSetter__()
        __lookupGetter__: ƒ __lookupGetter__()
        __lookupSetter__: ƒ __lookupSetter__()
        __proto__: (...)
        get __proto__: ƒ __proto__()
        set __proto__: ƒ __proto__()

*/

let computadoraPersonal = {
    dueño: persona.nombre,
    tipo: "Laptop",
    marca: "Dell",
    modelo: "Inspiron 15 - 5000 series",
    tamañoPantalla: 15.6,
    ram: 8,
    color: "Negro",
    procesador: "Intel core i3"
}

console.log(computadoraPersonal);