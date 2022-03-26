package com.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Player")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    String firstName;
    String lastName;
    long marketValue;
}
