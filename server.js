var express =require("express");
var app=express();
app.get('/',function(req, res){

  res.senFile('index.html');


});

app.listen(5000);
console.log("Running on port 5000");
