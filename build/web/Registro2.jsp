<%-- 
    Document   : Registro2
    Created on : 22/05/2016, 12:25:45 PM
    Author     : RICHARD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row"> <div class="col-lg-4"></div>
                <div class="col-lg-4">
                    <h1>Registro</h1>
                  </div>
                <div class="col-lg-4"></div></div>
              
                <%--Contenedor para Los campos de texto--%>
        <div class="container">
            
            <div class="row">
                <div class="col-lg-4"></div>
                <div class="col-lg-4">
                    <div class="panel panel-primary">
                                <div class="panel-heading"><p>
                            registrate y forma parte de  nuestra comunidad
                            </p></div>
                        <div class="panel-body">
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
                                <div id="valir" class="col-md-9 col-lg-offset-3"></div>
                                <div id="MensError3" class="col-lg-offset-4" style=""></div>
                            </div>
                                <div class="form-group" style="margin-top: ">
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
                    </div>
                </div>
                <div class="col-lg-4"></div>
            </div>
        </div> 
        <script src="js/jquery.min.js" type="text/javascript"></script>
       
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/script.js" type="text/javascript"></script>
        <script src="js/script.min.1.js" type="text/javascript"></script>
        </body>
</html>
