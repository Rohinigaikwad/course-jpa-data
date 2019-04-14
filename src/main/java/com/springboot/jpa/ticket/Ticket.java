package com.springboot.jpa.ticket;

import org.aspectj.weaver.ast.Not;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket {
    @Id
    @NotNull
    @Min(5)
    private String id;

    @NotNull
    @Min(10)
    private String name;

    @NotNull
    @Min(40)
    private  String description;

    public Ticket(){

    }

    public Ticket(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
