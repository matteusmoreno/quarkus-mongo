package br.com.matteusmoreno.service;

import br.com.matteusmoreno.entity.Person;
import br.com.matteusmoreno.repository.PersonRepository;
import br.com.matteusmoreno.request.CreatePersonRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;

@ApplicationScoped
public class PersonService {

    private final PersonRepository personRepository;
    @Inject
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Person addPerson(CreatePersonRequest request) {

        Person person = new Person();
        person.setName(request.name());
        person.setAge(request.age());
        person.setCreatedAt(LocalDateTime.now());

        personRepository.persist(person);

        return person;
    }

}
