/* Diferencia entre métodos y funciones: https://www.geeksforgeeks.org/difference-between-methods-and-functions-in-javascript/ 
*/

/* Los métodos son funciones asociadas a un objeto determinado (almacenadas como propiedades de objetos) */


/* Revisar los siguientes console log para notar las diferencias */
/* Los objetos tienen métodos. */

let cadena1 = "Hola";
console.log(cadena1);
/* Salida: 
Hola
*/

/* Otra forma de declarar un string y establecer el valor inicial. */
let cadena2 = new String("Adiós");
console.log(cadena2);
/* Salida: 
String {'Adiós'}
0: "A"
1: "d"
2: "i"
3: "ó"
4: "s"
length: 5
[[Prototype]]: String
    anchor: ƒ anchor()
    at: ƒ at()
    big: ƒ big()
    blink: ƒ blink()
    bold: ƒ bold()
    charAt: ƒ charAt()
    charCodeAt: ƒ charCodeAt()
    codePointAt: ƒ codePointAt()
    concat: ƒ concat()
    constructor: ƒ String()
    endsWith: ƒ endsWith()
    fixed: ƒ fixed()
    fontcolor: ƒ fontcolor()
    fontsize: ƒ fontsize()
    includes: ƒ includes()
    indexOf: ƒ indexOf()
    italics: ƒ italics()
    lastIndexOf: ƒ lastIndexOf()
    length: 0
    link: ƒ link()
    localeCompare: ƒ localeCompare()
    match: ƒ match()
    matchAll: ƒ matchAll()
    normalize: ƒ normalize()
    padEnd: ƒ padEnd()
    padStart: ƒ padStart()
    repeat: ƒ repeat()
    replace: ƒ replace()
    replaceAll: ƒ replaceAll()
    search: ƒ search()
    slice: ƒ slice()
    small: ƒ small()
    split: ƒ split()
    startsWith: ƒ startsWith()
    strike: ƒ strike()
    sub: ƒ sub()
    substr: ƒ substr()
    substring: ƒ substring()
    sup: ƒ sup()
    toLocaleLowerCase: ƒ toLocaleLowerCase()
    toLocaleUpperCase: ƒ toLocaleUpperCase()
    toLowerCase: ƒ toLowerCase()
    toString: ƒ toString()
    toUpperCase: ƒ toUpperCase()
    trim: ƒ trim()
    trimEnd: ƒ trimEnd()
    trimLeft: ƒ trimStart()
    trimRight: ƒ trimEnd()
    trimStart: ƒ trimStart()
    valueOf: ƒ valueOf()
    Symbol(Symbol.iterator): ƒ [Symbol.iterator]()
    [[Prototype]]: Object
    [[PrimitiveValue]]: ""
[[PrimitiveValue]]: "Adiós"
*/

let arreglo = new Array();
console.log(arreglo);
/* Salida:
length: 0
[[Prototype]]: Array(0)
    "copyWithin": true,
    "entries": true,
    "fill": true,
    "find": true,
    "findIndex": true,
    "flat": true,
    "flatMap": true,
    "includes": true,
    "keys": true,
    "values": true,
    "at": true,
    "findLast": true,
    "findLastIndex": true
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

/* Métodos, propiedades:
https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
*/

console.log(cadena2.includes("a"));
console.log(cadena2.toLocaleLowerCase().includes("a"));
console.log(cadena2.toUpperCase());
console.log(cadena2.toLowerCase());
console.log(cadena2.indexOf("s"));


/* --------------------------------- */

/* Los valores primitivos no tienen propiedades o métodos, es decir, no son objetos. */

/* ----------------------- */

/* Cohersión y conversión */
/* Cohersión - Javascript convierte en automático un tipo de dato en otro */

/* No hace falta que se convierta de forma manual a objeto, javascript lo hace siempre. Es indiferente usar String como dato primitivo y un String como objeto.  */
console.log(cadena1.toLowerCase());

/* ------------------------------- */


/* No se puede utilizar el método reverse directamente() con un string, por lo que la solución es primero convertir el objeto String en un arreglo de caracteres y luego utilizarlo */

/* Más información: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String */

let palabra ="Hola Mundo";
let arreglo2 = palabra.split(""); // R= (10) ['H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o']
// palabra.split(" "); R= (2) ['Hola', 'Mundo']
// palabra.split("u"); R= (2) ['Hola M', 'ndo']

console.log(arreglo2);

console.log(arreglo2.reverse());

/* ---------------- */


function invertirPalabra(cadena) {
    let arreglo = cadena.split(""); // Convirtiendo la cadena en un arreglo
    arreglo.reverse(); // Invirtiendo el arreglo
    let cadenaInvertida = arreglo.join(""); // Une los elementos de un arreglo y regresa un string
    return console.log(cadenaInvertida);
}

invertirPalabra("Generation");

