package eci.ieti.data.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class User {
    @Id
    private String id;
    private String name;
    private String email;

    public User(String name, String email) {
        setId();
        this.name = name;
        this.email = email;
    }
    public String getId() {
        return id;
    }

    public void setId() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
