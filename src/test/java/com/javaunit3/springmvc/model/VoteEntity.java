package com.javaunit3.springmvc.model;

import javax.persistence.*;

@Entity
@Table(name="votes")
public class VoteEntity {
    @Id
    @GeneratedValue
    private Integer Id;
    @Column
    private String voterName;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

}
