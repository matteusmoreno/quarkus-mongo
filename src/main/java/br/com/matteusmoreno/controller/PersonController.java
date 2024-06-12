package br.com.matteusmoreno.controller;

import br.com.matteusmoreno.entity.Person;
import br.com.matteusmoreno.request.CreatePersonRequest;
import br.com.matteusmoreno.response.PersonDetailsResponse;
import br.com.matteusmoreno.service.PersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonController {

    private final PersonService personService;

    @Inject
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @POST
    public Response addPerson(CreatePersonRequest request) {
        Person person = personService.addPerson(request);

        return Response.ok(new PersonDetailsResponse(person)).build();
    }
}
