package br.com.matteusmoreno.repository;

import br.com.matteusmoreno.entity.Person;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheMongoRepository<Person> {

}
