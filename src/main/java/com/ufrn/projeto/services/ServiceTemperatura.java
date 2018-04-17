/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufrn.projeto.services;

import com.ufrn.projeto.dao.implementations.TemperaturaDaoImpl;
import com.ufrn.projeto.dao.interfaces.ITemperaturaDao;
import com.ufrn.projeto.model.OutputMessage;
import com.ufrn.projeto.model.Temperatura;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Aluno
 */
@Path("/temperatura")
public class ServiceTemperatura {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Temperatura t) {
        try {
            ITemperaturaDao temperaturaDAO = new TemperaturaDaoImpl();
            temperaturaDAO.save(t);
        } catch (Exception e) {
            return Response
                    .status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(new OutputMessage(500, e.getMessage()))
                    .build();
        }
        return Response
                .status(Response.Status.CREATED)
                .entity(t)
                .build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(int id) {
       return null;
    }

    public Response update(Temperatura t) {
        return null;
    }

    public Response listById(int id) {
        return null;
    }

    public Response listAll() {
        return null;
    }

}
