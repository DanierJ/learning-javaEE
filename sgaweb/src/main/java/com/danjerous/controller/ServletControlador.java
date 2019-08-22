package com.danjerous.controller;

import com.danjerous.sga.domain.Persona;
import com.danjerous.sga.servicio.PersonaService;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador", "/listarPersonas"})
public class ServletControlador extends HttpServlet {

    @EJB
    private PersonaService personaService;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<Persona> listarPersonas = personaService.listarPersonas();

        request.setAttribute("personas", listarPersonas);


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listarPersonas.jsp");

        requestDispatcher.forward(request, response);
    }
}
