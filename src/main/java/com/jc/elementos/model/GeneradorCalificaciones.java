/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T107
 */
public class GeneradorCalificaciones {
private static final Logger logger = Logger.getLogger(GeneradorCalificaciones.class.getName());
    private Object RequestMethod;
    
    private ArrayList<Evaluacion> generarCalificaciones(){
      ArrayList <Evaluacion> a = new ArrayList<>();
        a.add(new Evaluacion("Petra",(float) 5.8));
        a.add(new Evaluacion("Jose",(float) 7.4));
        a.add(new Evaluacion("Roberta",(float) 8.6));
        return a;
    }
   
}

 
    @RequestMapping(method = RequestMethod.GET, value="/servicio-calificaciones", headers = {"Accept=Application/JSON"})
    public @ResponseBody String servicioCalificaciones() throws IOException{
        String res;
        JsonFactory fc = new JsonFactory(null);
        ObjectMapper ob = new ObjectMapper(fc);
        try(ByteArrayOutputStream out = new ByteArrayOutputStream()){
            JsonGenerator jg = ob.getJsonFactory().createJsonGenerator(out);
            jg.writeObject(java.util.Collections.singletonMap("object", generarCalificaciones()));
            res = out.toString();
        }
        logger.log(Level.INFO, res);
        return res;
    }


/**
   SessionFactory factory= NewHibernateUtil.getSessionFactory();
        Session sesion=factory.openSession();
        Transaction tranza=sesion.beginTransaccion();
        
        String id= request.getParameter("ID");
        String nombre= request.getParameter("NOMBRE");
        String paterno= request.getParameter("PATERNO");
        String materno= request.getParameter("MATERNO");
        
        Trabajador t=new Trabajador();
        t.setIdTrabajador(new Integer(id));
        t.setNombre(nombre);
        t.setPaterno(paterno);
        t.setMaterno(materno);
        sesion.update(t);
        tranza.commit();
        sesion.close();
        
        out.println("trabajador-actualizado");

}
}