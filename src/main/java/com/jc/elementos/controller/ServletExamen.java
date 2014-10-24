/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import com.jc.elementos.model.Evaluacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T107
 */
public class ServletExamen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
     
        protected void DoGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
        {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
        Evaluacion a = new Evaluacion("Ana",7);
        try(PrintWriter out = response.getWriter()){
         response.setContentType("application/json");
          ObjectMapper mp = new ObjectMapper();
          JsonGenerator jg = mp.getJsonFactory().createJsonGenerator(out);
          jg.writeObject(java.util.Collections.singletonMap("object", a));
        
    }
   }

    
 
