
package com.danjerous.sga.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonaServiceWS", targetNamespace = "http://servicio.sga.danjerous.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonaServiceWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.danjerous.sga.servicio.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarPersonas", targetNamespace = "http://servicio.sga.danjerous.com/", className = "com.danjerous.sga.servicio.ListarPersonas")
    @ResponseWrapper(localName = "listarPersonasResponse", targetNamespace = "http://servicio.sga.danjerous.com/", className = "com.danjerous.sga.servicio.ListarPersonasResponse")
    @Action(input = "http://servicio.sga.danjerous.com/PersonaServiceWS/listarPersonasRequest", output = "http://servicio.sga.danjerous.com/PersonaServiceWS/listarPersonasResponse")
    public List<Persona> listarPersonas();

}