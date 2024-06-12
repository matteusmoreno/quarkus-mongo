package br.com.matteusmoreno.response;

import br.com.matteusmoreno.entity.Person;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

public record PersonDetailsResponse(
        ObjectId id,
        String name,
        Integer age,
        LocalDateTime createdAt) {

    public PersonDetailsResponse(Person person) {
        this(person.getId(), person.getName(), person.getAge(), person.getCreatedAt());
    }
}
