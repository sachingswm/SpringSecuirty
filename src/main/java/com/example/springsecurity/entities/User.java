package com.example.springsecurity.entities;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String authority;
    private boolean active;

    public User(String email, String password, String authority, boolean active) {
        this.email = email;
        this.password = password;
        this.authority = authority;
        this.active = active;
    }
}
