import MarcaResourceClient from './MarcaResourceClient.js';
class MarcaController extends MarcaResourceClient{
	constructor(){
            super();
	}
       
    search(){
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
	}

} 


export default MarcaController;

