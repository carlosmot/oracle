package com.pruebas;

//import static org.junit.Assert.*;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
//import org.junit.Test;

public class PruebasTest {

	/*@Test
	public void testGetTrackInJSON() {
		Response output = target("/disco").request().get();
        assertEquals("should return status 200", 200, output.getStatus());
        assertNotNull("Should return list", output.getEntity());
	}

	@Test
	public void testCreateTrackInJSON() {
		Notification notification = new Application(1, "New user created at Antwerp");
        Response output = target("/disco/crear")
                .request()
                .put(Entity.entity(notification, MediaType.APPLICATION_JSON));
        assertEquals("Should return status 204", 204, output.getStatus());
	}*/

}
