class AbstractResourceCliente {
    constructor(){
        this._url='http:172.18.0.1:7070/MantenimientoWebApp-web-1.0-SNAPSHOT/webresources';
    }
    
    get url(){
        return this._url;
    }
}