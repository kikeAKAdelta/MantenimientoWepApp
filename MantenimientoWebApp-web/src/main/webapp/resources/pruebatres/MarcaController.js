import MarcaResourceClient from './MarcaResourceClient.js';
class MarcaController extends MarcaResourceClient{
	constructor(){
            super();
	}
        search(){
		this.mrc=new MarcaResourceClient();
		this.mrc.findByName("d")
		.then(function (res){
                return res.json();
        })
        .then(function (data){
	        let html = '';
	        data.forEach(function (marca){
	        html += ' <option> ${marca.marca} </option>'
        })
           document.getElementById("browsers").innerHTML=html;
        })
	}

} 

export default MarcaController;

