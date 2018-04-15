fetch('http://localhost:36929/pruebaRestMarca/webresources/marca/getMarca')
            .then(function (res){
            return res.json();
        })
                .then(function (data){
                    let html = '';
                    data.forEach(function (marca){
                        html += ` <option> ${marca.marca} </option>`
                    })
                    document.getElementById("browsers").innerHTML=html;
                })
