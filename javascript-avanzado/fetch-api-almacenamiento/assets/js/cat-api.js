
/* https://lenguajejs.com/javascript/peticiones-http/fetch/ */

/* Fetch lo utilizamos para realizar peticiones HTTP, es asíncrono y funciona por medio de promesas */

let $btnGato = document.querySelector('#btnGato');

$btnGato.addEventListener('click', () => {
    fetch('https://api.thecatapi.com/v1/images/search') //Recibimos un arreglo que dentro tiene un objeto
    // Hasta este punto se puede ver la petición en Google Chrome Dev, en la sección de network. El recurso se llama "search".
        .then(resp => resp.json()).then(data => {
            console.log(data);

            let imagenGatito = document.createElement('img');
            imagenGatito.src = data[0].url;
            document.body.appendChild(imagenGatito);
        }) 
});


$btnGato.addEventListener('click', () => {
    fetch('https://dog.ceo/api/breeds/image/random') //Recibimos un arreglo que dentro tiene un objeto
    // Hasta este punto se puede ver la petición en Google Chrome Dev, en la sección de network. El recurso se llama "search".
        .then(resp => resp.json()).then(data => {
            console.log(data);

            let imagenGatito = document.createElement('img');
            imagenGatito.src = data.message;
            document.body.appendChild(imagenGatito);
        }) 
});




