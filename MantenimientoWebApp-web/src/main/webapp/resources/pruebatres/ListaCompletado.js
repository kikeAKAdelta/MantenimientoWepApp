import MarcaController from './MarcaController.js';
class ListaCompletado extends HTMLElement{


		constructor(){
			//siempre llamar al constructor super
			super();

		}

		//Cuando se conecta por primera vez al DOM
		connectedCallback(){
			//creando un shadow root
			let shadow=this.attachShadow({mode: 'open','composed':true,'bubbles':true});

			//creando datalist
			let lista=document.createElement('datalist');
			lista.setAttribute('class', 'lista');	
			lista.style.width = '200px'; 
                        lista.setAttribute('id','browsers');

			

			//creando input text
			let inputText=document.createElement('input');
			inputText.setAttribute('class', 'inputText');
			inputText.setAttribute('type', 'text');
			inputText.setAttribute('placeholder', 'Busqueda por nombre...');
			inputText.setAttribute('event','keypress');

			//creando boton
			let boton=document.createElement("input");
			boton.setAttribute('type', 'button');
			boton.setAttribute('value', 'Busqueda');
			boton.style.width='100px';
                        
                        //al lio
                        this.mrc=new MarcaResourceClient();
                        this.mrc.findAll()
                        .then(function (res){
                        return res.json();
                })
                .then(function (data){
                        let html = '';
                        data.forEach(function (marca){
                        html += ' <option> ${marca.marca} </option>'
                        console.log(marca.marca);
                })
                   document.getElementById("browsers").innerHTML=html;

                })


			//Creando evento
			//let evento=new new CustomEvent('key_complete', {'detail':inputText});
			let evento=new Event('key_complete');

			//el escucha del evento
			//inputText.addEventListener('key_complete', )
			inputText.addEventListener('click', teclear(), false);
			lista.appendChild(opcion);
			shadow.appendChild(inputText);
			shadow.appendChild(boton);
			shadow.appendChild(lista);

		}

}
     function teclear () {
     		let x=2+2;
			console.log(x);
		}

	//Definiendo un nuevo elemento
	customElements.define('list-complete',ListaCompletado);

	