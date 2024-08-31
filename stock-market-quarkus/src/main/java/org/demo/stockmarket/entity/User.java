package org.demo.stockmarket.entity;
/**
 * @author Leu A. Manuel
 * @see https://github.com/Leupesquisa
 */

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;

@Entity
public class User extends PanacheEntity {

    public String username;
    public String email;
    public String password;
    public String role;
}

