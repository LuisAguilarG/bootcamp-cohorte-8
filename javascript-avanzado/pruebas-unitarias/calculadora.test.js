
// https://jestjs.io/docs/getting-started

// Como es javascript de lado del servidor (node js), no se utiliza el import, sino:
// En el otro documento se exportó como un objeto, por lo que también se debe importar como un objeto utilizando llaves. 
const {sumar, restar, multiplicar, dividir} = require('./calculadora');


// A qué archivo estamos haciéndole una prueba.
// Utilizamos una función anónima y de flecha
describe('Pruebas en el componente calculadora', () => {
    test('Pruebas en la función sumar', () => {
        // Solo importa la entrada y salida esperada
        expect(sumar(3, 5)).toBe(8);
    });

    test('Pruebas en la función restar', () => {
        // Solo importa la entrada y salida esperada
        expect(restar(3, 5)).toBe(-2);
    });

    test('Pruebas en la función multiplicar', () => {
        // Solo importa la entrada y salida esperada
        expect(multiplicar(3, 5)).toBe(15);
    });

    test('Pruebas en la función dividir', () => {
        // Solo importa la entrada y salida esperada
        expect(dividir(100, 2)).toBe(50);
    });


});