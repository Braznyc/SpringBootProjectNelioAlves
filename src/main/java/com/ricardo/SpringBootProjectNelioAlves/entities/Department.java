package com.ricardo.SpringBootProjectNelioAlves.entities;

import jakarta.persistence.*;

import java.util.Collection;

// The following annotations will determine that this class is an entity and that it's a table in a relational database, named "tb_department".
//JPA annotations: @Entity, @Table, @Id and @GenerateValue. This will send the info to create the database.

@Entity                          // These 2 annotations are part of the JPA that will connect the 2 entities. It's called "class mapping"
@Table(name = "tb_department")


public class Department {

    @Id // This annotation determines that this is a primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // In JPA this is used to generate unique ids

    private Long id;
    private String name;

    public Department() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "department")
    private Collection<User> user;

    public Collection<User> getUser() {

        return user;
    }

    public void setUser(Collection<User> user) {

        this.user = user;
    }
}
