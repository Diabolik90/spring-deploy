package com.example.springdeploy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String message;

    /**
     * Mensaje Hola mundo
     * http://localhost:8081/hola
     * @return
     */
    @GetMapping("/hola")
    public String holamundo(){
        return "¡Hola mundo! Diabolik te saluda." + message;
    }

    /**
     * Página HTML
     * http://localhost:8081
     * @return
     */
    @GetMapping("/")
    public String codigo(){
        return """
                <!DOCTYPE html>
                                
                <html>
                    <head>
                        <meta description="Ejercicio 2 del curso HTML y CSS">
                        <meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
                        <title>My Web Page</title>
                         <style>
                             .mypage{
                                 margin: 30px;
                                 padding: 20px;
                             }
                             .formhead{
                                 margin-top: 20px;
                                 margin-bottom: 5px;
                             }
                            .foot{
                                position: absolute;
                                text-align: center;
                                width: 99%;
                                bottom: 20px;
                            }
                        </style>
                    </head>
                                
                    <body>
                        <div class="mypage">\s
                            <table width="100%"
                            style="border: 1px #000 solid; background-color: beige" >
                                
                               \s
                                <tr>
                                    <th>\s
                                         <h2> Formulario </h2>\s
                                    </th>
                                    <th>
                                         <h2> Tabla </h2>\s
                                    </th>
                                </tr>
                                
                                <tr>
                                
                                    <td width="50%">
                                        <form id="formulario1"
                                        action="recibeform.html"
                                        method="post"\s
                                        style="margin: 20px; padding:10px">
                           \s
                                            <fieldset style="margin-right: 30px">
                                                <legend>
                                                    Formulario Open BootCamp
                                                </legend>
                               \s
                                                <div class="formhead">
                                                    Nombre*:
                                                </div>
                                                <div>
                                                    <input id="form1_nombre" name="nombre"\s
                                                    type="text" pattern="[A-Za-z]+" required value=""\s
                                                    placeholder="Escribir tu nombre..." />
                                                </div>
                               \s
                                                <div class="formhead">
                                                    Apellidos*:
                                                </div>
                                                <div>
                                                    <input id="form1_apellidos" name="apellidos"\s
                                                    type="text" pattern="[A-Za-z]+" required value=""\s
                                                    placeholder="Escribir tus apellidos..." />
                                                </div>
                               \s
                                                <div class="formhead">
                                                    Correo*:
                                                </div>
                                                <div>
                                                    <input id="form1_correo" name="correo" type="email"\s
                                                    required value="" placeholder="Escribir tu correo..." />
                                                </div>
                               \s
                                                <div class="formhead">
                                                    Tel&eacute;fono*:
                                                </div>
                                                <div>
                                                    <select name="telephon" id="telephon">
                                                        <option value="volvo">+34</option>
                                                        <option value="saab">+39</option>
                                                        <option value="opel">+33</option>
                                                        <option value="audi">+36</option>
                                                    </select>
                                                    <input id="form1_telefono" name="telefono" type="tel"\s
                                                    pattern="[0-9]+" required value="" placeholder="Escribir tu n&uacute;mero..." size="13"/>
                                                </div>
                               \s
                                                <div class="formhead">
                                                    Direcci&oacute;n*:
                                                </div>
                                                <div>
                                                    <input id="form1_direccion" name="direccion" type="text"\s
                                                    pattern="[A-Za-z0-9]+" required value="" placeholder="Escribir tu direcci&oacute;n..." />
                                                </div>
                               \s
                                                <div class="formhead">
                                                    <input type="checkbox" required cheked /> Acepto los términos
                                                </div>
                               \s
                                                <div>
                                                    <h6>* Campos obligatorios</h6>
                                                </div>
                                               \s
                               \s
                                                <div class="formhead">
                                                    <input type="submit" value="Enviar" />
                                                </div>
                               \s
                                            </fieldset>
                       \s
                                        </form>
                                
                                    </td>
                               \s
                                    <td width="50%" align="center">
                                
                                        <table class="default" border="1" width="500px" cellpadding="30">
                                            <tr align="center">
                                                <td rowspan="2"> A </td>
                                                <td> B </td>
                                                <td> C </td>
                                                <td> D </td>
                                            </tr>
                                            <tr align="center">
                                                <td> E </td>
                                                <td> F </td>
                                                <td> G </td>
                                            </tr>
                                            <tr align="center">
                                                <td> H </td>
                                                <td> I </td>
                                                <td colspan="2"> J </td>
                                            </tr>
                                            <tr align="center">
                                                <td> K </td>
                                                <td> L </td>
                                                <td> M </td>
                                                <td> N </td>
                                            </tr>
                                        </table>
                                
                                    </td>
                                </tr>
                               \s
                        </table>
                    </div>
                                
                        <footer class="foot">
                            Copyright &copy; Proyecto Open BootCamp Davide Pietro Fragnito
                        </footer>
                                
                    </body>
                </html>""";
    }

}
