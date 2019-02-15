var express = require('express');
var app = express();


app.get('/year', function(req, res){
var date=new Date();
var age=req.query.age;
var current_year=date.getFullYear();
var birth_year=current_year-age;

   res.send('Your birth year is:' + birth_year);
});
app.listen(3000);