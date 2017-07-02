<%-- 
    Document   : formPeriodo
    Created on : 23-jun-2015, 10:23:00
    Author     : SistemasUpeu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>        
    </head>
    <body>
        <div>

            <fm:form modelAttribute="modeloDetallesventa" method="post" action="guardarDetallesventa">
                <table>

                    <tr>
                        <td><fm:label path="cantidad">Cantidad</fm:label> </td>
                        <td><fm:input path="cantidad" /></td>
                    </tr>
                    <tr>
                        <td><fm:label path="igv">IGV</fm:label> </td>
                        <td><fm:input path="igv" size="60" /></td>
                    </tr>  
                    <tr>
                        <td><fm:label path="idProducto.idProducto">Producto</fm:label> </td> 
                            <td>
                            <fm:select path="idProducto.idProducto" cssClass="myinput"  >
                                <fm:option value=""><c:out value="--------------------"/> </fm:option>
                                <c:if test="${!empty ListProducto}">
                                    <c:forEach var="pro"  items="${ListProducto}">
                                        <fm:option value="${pro.idProducto}" >
                                            <c:out value="${pro.nombre}"/>
                                        </fm:option>
                                    </c:forEach>
                                </c:if>
                            </fm:select> 
                        </td>
                    </tr> 
                 
                    <tr>
                        <td><fm:label path="idVenta.idVenta">Codigo</fm:label> </td> 
                            <td>
                            <fm:select path="idVenta.idVenta" cssClass="myinput"  >
                                <fm:option value=""><c:out value="--------------------"/> </fm:option>
                                <c:if test="${!empty ListVenta}">
                                    <c:forEach var="ve"  items="${ListVenta}">
                                        <fm:option value="${ve.idVenta}" >
                                            <c:out value="${ve.codigo}"/>
                                        </fm:option>
                                    </c:forEach>
                                </c:if>
                            </fm:select> 
                        </td>
                    </tr>
                    <tr>
                        <td><fm:label path="idVenta.idVenta">Cliente</fm:label> </td> 
                            <td>
                            <fm:select path="idVenta.idVenta" cssClass="myinput"  >
                                <fm:option value=""><c:out value="--------------------"/> </fm:option>
                                <c:if test="${!empty ListCliente}">
                                    <c:forEach var="pa"  items="${ListCliente}">
                                        <fm:option value="${pa.idCliente}" >
                                            <c:out value="${pa.idPersona.nombres}"/>
                                        </fm:option>
                                    </c:forEach>
                                </c:if>
                            </fm:select> 
                        </td>
                    </tr> 
                    <tr>
                        <td><fm:label path="idVenta.idVenta">Empleado</fm:label> </td> 
                            <td>
                            <fm:select path="idVenta.idVenta" cssClass="myinput"  >
                                <fm:option value=""><c:out value="--------------------"/> </fm:option>
                                <c:if test="${!empty ListEmpleado}">
                                    <c:forEach var="pe"  items="${ListEmpleado}">
                                        <fm:option value="${pe.idEmpleado}" >
                                            <c:out value="${pe.idPersona.nombres}"/>
                                        </fm:option>
                                    </c:forEach>
                                </c:if>
                            </fm:select> 
                        </td>
                    </tr>
                    <tr>
                        <td><fm:label path="idVenta.idVenta">Documento</fm:label> </td> 
                            <td>
                            <fm:select path="idVenta.idVenta" cssClass="myinput"  >
                                <fm:option value=""><c:out value="--------------------"/> </fm:option>
                                <c:if test="${!empty ListDocumento}">
                                    <c:forEach var="doc"  items="${ListDocumento}">
                                        <fm:option value="${doc.idDocumento}" >
                                            <c:out value="${doc.nombre}"/>
                                        </fm:option>
                                    </c:forEach>
                                </c:if>
                            </fm:select> 
                        </td>
                    </tr>



                    <tr>                        
                        <td colspan="2"><input type="submit" value="Enviar" > </td>
                    </tr>
                </table>                
            </fm:form>         
        </div>
    </body>
</html>
