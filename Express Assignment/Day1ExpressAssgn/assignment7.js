var express = require('express');
var app = express();
var products=['Mobile','Hardware','Appliances'];
var price=[1000,5000,7000];
app.get('/', function (req, res) {
   res.send(products);
})

app.get('/items/:id',function(req,res){
var id=req.params.id;
res.send(products[id]);
})
app.post('/items/:name',function(req,res){
   var name=req.params.name;
   products.push(name);
   res.send(products);
})
app.delete('/del_items/:id',function(req,res){
   var id=req.params.id;
   products.splice(id,1);
   res.send(products);
})
app.patch('/items/:name/:id',function(req,res){
   var Id=req.params.id;
   var name=req.params.name;
   products[Id]=name;
   res.send(products);
})
var server = app.listen(8081, function () {
   var host = server.address().address
   var port = server.address().port
   
   console.log("Example app listening at http://%s:%s", host, port)
})