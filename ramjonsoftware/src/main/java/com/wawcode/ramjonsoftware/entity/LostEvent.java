package com.wawcode.ramjonsoftware.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
public class LostEvent {

    private @Id @GeneratedValue Long eventId;

    private String name;
    private String mail;
    private String description;
    private String phone;
    private String nagroda;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
//            mappedBy = "lostEvent")
//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "pin_id")
    private Set<SinglePin> singlePins = new HashSet<>();

//    public void addSinglePin(SinglePin singlePin){
//        singlePins.add(singlePin);
//    }

}