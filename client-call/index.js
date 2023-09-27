fetch('http://localhost:9090/api/products')
.then(response=>response.json())
.then(products=>console.log(products));
