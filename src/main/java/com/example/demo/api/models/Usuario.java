package com.example.demo.api.models;

import javax.persistence.*;


@Entity
@Table(uniqueConstraints = { @UniqueConstraint(name = "email", columnNames = { "correo" }), @UniqueConstraint(name = "name", columnNames = { "name" }) })
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(length = 25)
    private String name;

    @Column(name="correo", length = 35)
    private String correo;

    @Column(name="password", length = 100)
    private String password;

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
