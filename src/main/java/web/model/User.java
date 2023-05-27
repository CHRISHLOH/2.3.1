package web.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    private int id;
    @NotEmpty
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters.")
    private String name;

    @NotEmpty
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters.")
    private String lastName;

    public User(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
