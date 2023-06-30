package net.ictcampus.yournal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "owners")
public class Owner {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String user_name;
    private String password;
}
