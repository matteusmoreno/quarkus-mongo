package br.com.matteusmoreno.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@MongoEntity(database = "quarkus_mongo" ,collection = "persons")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Person extends PanacheMongoEntity {

    private ObjectId id;
    private String name;
    private Integer age;
    @BsonProperty("created_at")
    private LocalDateTime createdAt;

}
