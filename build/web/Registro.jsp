<%-- 
    Document   : Registro
    Created on : 22/05/2016, 11:33:20 AM
    Author     : RICHARD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">
        
    </style>
    </head>
    <body>
        <div class="container">
            <div class="row"> <div class="col-lg-4"></div>
                <div class="col-lg-4">
                    <h1>Registro</h1>
                  </div>
                <div class="col-lg-4"></div></div></div><br>
                <%--Contenedor para Los campos de texto--%>
        <div class="container">
            
            <div class="row">
                <div class="col-lg-4"></div>
                <div class="col-lg-4">
                    <form class="form-horizontal">
                            <div class="form-group">
                                <label class="control-label col-md-3">Nombre</label>
                                <div class="col-lg-9">
                                    <input id="txtNombre" class="form-control" type="text" name="" value="" placeholder="Nombre"/>
                                </div>
                                <div id="MensError1" class="col-lg-offset-4"></div>
                            </div>
                        <div class="form-group">
                                <label class="control-label col-md-3">Correo</label>
                                <div class="col-lg-9">
                                    <input id="txtCorreo" class="form-control" type="text" name="" value="" placeholder="Correo"/>
                                </div>
                                <div id="MensError2" class="col-lg-offset-4"></div>
                            </div>
                        <div class="form-group">
                                <label class="control-label col-md-3">Contraseña</label>
                                <div class="col-lg-9">
                                    <input id="txtPassword1" class="form-control"  type="text" name="" value="" placeholder="Contraseña"/>
                                </div>
                                <div id="campo2" class="col-md-9 col-lg-offset-3"></div>
                                <div id="MensError3" class="col-lg-offset-4"></div>
                            </div>
                        <div class="form-group">
                                <label class="control-label col-md-3">Repit Contraseña</label>
                                <div class="col-lg-9">
                                    <input id="txtPassword2" class="form-control" type="text" name="" value="" placeholder="Contraseña(Repite)"/>
                                </div>
                                <div id="MensError4" class="col-lg-offset-4"></div>
                            </div>
                        <div class="form-group">
                                <div class="col-lg-9 col-lg-offset-5">
                                    <input type="submit" value="Ingresar" class="btn btn-success" />
                                </div>
                              
                            </div>
                        </form>
                </div>
                <div class="col-lg-4"></div>
            </div>
        </div> 
        
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
     <script src="js/script.js" type="text/javascript"></script>
     <script src="js/script.min.js" type="text/javascript"></script>
     <script>
          
     </script>
    
    </body>
</html>
