let fijo = 75;

var adivina = () => {
        
    numero = parseInt(document.getElementById('number').value);
    resta = Math.abs(fijo - numero); 

    if(resta === 0){
        saludo.innerHTML = `Ganaste!!!`;
    }else if(resta <= 5) {
        saludo.innerHTML = `Calienteeeeeeeeeeeeeeeee`;

    }else if(resta <= 10) {
        saludo.innerHTML = `Calienteeeeeee`;
    }else if(resta <= 20) {
        saludo.innerHTML = `Tibioo`;
    }else if(resta <= 30) {
        saludo.innerHTML = `Frio`;
    }else {
        saludo.innerHTML = `Congelado`;
    }
}