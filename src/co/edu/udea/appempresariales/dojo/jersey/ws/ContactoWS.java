package co.edu.udea.appempresariales.dojo.jersey.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path; //ctl+shif+o importa y elimina las librerías adecuadas
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.udea.appempresariales.dojo.jersey.pojo.Contacto;

@Path("contacto")
// identificador para acceder
public class ContactoWS {

	private List<Contacto> misContactos;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/todoscontactos")
	public List<Contacto> obtenerTodosContactos() {
		return misContactos;
	}

	public ContactoWS() {

		super();
		this.misContactos = new ArrayList<Contacto>();
		Contacto nuevoContacto = new Contacto(1, "Jorge", "Cazorla", "5723438",
				"jorge@gmail.com");
		Contacto contacto2 = new Contacto(2, "Pedro", "Perez", "5903033",
				"pedro@gmail.com");
		Contacto contacto3 = new Contacto(3, "Carlos", "Figueroa", "4444445",
				"carlos@gmail.com");

		misContactos.add(nuevoContacto);
		misContactos.add(contacto2);
		misContactos.add(contacto3);

	}

}
