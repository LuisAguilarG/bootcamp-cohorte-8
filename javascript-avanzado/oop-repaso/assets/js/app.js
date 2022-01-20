
/* https://www.w3schools.com/js/js_objects.asp */

/* https://www.w3schools.com/jsref/jsref_push.asp */

class Animalito {
    constructor(nombre, edad, especie, revisado){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.enfermo = false;
        this.revisado = revisado;
    }

    saludar() {
        return console.log(`Hola, mi nombre es ${this.nombre}`);
    }
}

class Veterinario {
    constructor() {
        this.cantidadPacientes = 0;
        this.pacientesRevisados = 0;
        this.listaPacientes = [];
    }

    // Debido a que no es un método estático, es necesario que se cree un objeto a partir de la clase par apoder utilizarlo. 
    agregarPaciente(paciente) {
        this.listaPacientes.push(paciente);
        this.cantidadPacientes += 1;
        /* Otra opción: this.cantidadPacientes++ */
        let mensaje = `Paciente agregado <br>`;
        return document.write(mensaje);
    }

    modificarPacientesRevisados() {
        this.pacientesRevisados++;
    }

    revisarPaciente(paciente) {
        if(paciente.revisado === false) {
           paciente.revisado = true;
            this.modificarPacientesRevisados();
           /* this.pacientesRevisados++; */
           document.write("<br> Paciente ha sido revisado. <br>");
        } else {
            document.write(" <br> Este paciente ya fue revisado.");
        }
    }

    mostrarLista(){
        for(let i = 0; i < this.listaPacientes.length; i++) {
            document.write("<br> " + this.listaPacientes[i].nombre);
        }
        document.write(`<br> Cantidad de pacientes: ${this.cantidadPacientes} <br>  Pacientes revisados: ${this.pacientesRevisados}`);
    }
}

const veterinarioPanchito = new Veterinario();

/* Ctrl y mover el cursor sobre el constructor nos dirá qué atributos necesitamos */
const animalito1 = new Animalito("Manchas", 5, "Perro", false);
console.log(animalito1);

const animalito2 = new Animalito("Galleta", 2, "Gato", true);
console.log(animalito2);

veterinarioPanchito.agregarPaciente(animalito1);
veterinarioPanchito.agregarPaciente(animalito2);

console.log(veterinarioPanchito);
console.log(veterinarioPanchito.listaPacientes);

veterinarioPanchito.mostrarLista();
veterinarioPanchito.revisarPaciente(animalito1);
veterinarioPanchito.mostrarLista();

// Operador de cortocircuito
