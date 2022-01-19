
let $btn = document.querySelector('#btn');

$btn.addEventListener('click', () => {
    fetch('https://jsonplaceholder.typicode.com/albums/1/photos') //Recibimos un arreglo que dentro tiene un objeto
    // Hasta este punto se puede ver la petición en Google Chrome Dev, en la sección de network. El recurso se llama "search".
        .then(resp => resp.json()).then(data => {
            console.log(data);
            console.log(data.length);

            for(let i = 0; i < data.length; i++) {

                let title = data[i].title;
                let thumbnail = data[i].thumbnailUrl;
                let url = data[i].url;
                let id = data[i].id;

                /* document.body.innerHTML += "<h1>Today's date is " + "</h1>"; */
                let card = 
                document.body.innerHTML += `<br> <br> <div class="card" style="width: 18rem;">
                <img src="${thumbnail}" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">ID: ${id}</h5>
                  <p class="card-text">${title}</p>
                  <a href="#" class="btn btn-primary d-flex p-2">${url}</a>
                </div>
              </div>`
            }

            
            
            
            
        }) 
});