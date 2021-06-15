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
	
	/*
	 * 	//Para este ejercicio, habilitar en el pom.xml esta dependencia 
	 *  que esta comentada(linea 53):
	 *  <dependency>
			<groupId>org.glassfish.jersey.media</groupId>
			<artifactId>jersey-media-json-binding</artifactId>
		</dependency>
	 */
	
	@GET
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
	//http://localhost:8080/proyecto/rest/disco/crear
	//En la pestaña Body de RestClient, escoger application/json
	/*{
	    "grupo":"Eagles",
	    "titulo":"On the border"
	  }
	*/
	//Seleccionamos el método POST y lanzamos
	public Response createTrackInJSON(Disco track) {
		String result = "Disco guardado: " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}
