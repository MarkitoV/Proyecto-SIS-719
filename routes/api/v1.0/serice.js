var express = require('express');
var router = express.Router();

/* GET home page. */
router.post('/superficie', function(req, res, next) {
// añadido por frank
  var superficie = Number(req.body.ancho)*(Number(req.body.largo))
  if (superficie < 300){
     req.send(
       {
         "msn" : "Casa pequeña"
       });
  } else if (superficie > 300 && superficie < 500){
    rep.sed(
      {
         "msn" : "Casa mediano"
      });
  }else if (superficie > 500.99 && superficie < 800){
    rep.sed(
      {
         "msn" : "Casa grande"
      });
    }
  //res.render('index', { title: 'Express' });
});

module.exports = router;
