package com.jgharris314.kendamaconnection.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="member")
public class Member {
    @Id
    @JsonProperty(value="member_id")
    @Column(name="member_id", columnDefinition = "UUID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID member_id;

    @JsonProperty(value="username")
    @Column(name="username")
    private String username;


    public Member(){}

    @JsonCreator
    public Member(@JsonProperty("username") String username){

        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}
