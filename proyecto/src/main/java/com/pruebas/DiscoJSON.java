package com.pruebas;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/disco")
public class DiscoJSON {

	
	@GET
	@Path("/heavy")
	@Produces(MediaType.APPLICATION_JSON)
	public Disco getTrackInJSON() {
		Disco track = new Disco();
		track.setTitulo("Enter Sandman");
		track.setGrupo("Metallica");
		return track;
	}
	
	@POST
	@Path("/crear")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Disco track) {
		String result = "Disco guardado: " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}
