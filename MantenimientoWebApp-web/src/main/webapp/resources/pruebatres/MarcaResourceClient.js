import AbstractResourceClient from './AbstractResourceClient.js';

class MarcaResourceClient extends AbstractResourceClient{

	constructor(){
		super();
		this.url=this.url+'/marca';
	}
        
        findByName (nombre) {
		return fetch(url+'/nombre'+nombre);
	}


}

export default MarcaResourceClient;