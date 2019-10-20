package com.wawcode.ramjonsoftware.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SinglePin {

    private @Id @GeneratedValue Long pinId;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private LostEvent lostEvent;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "post_id", nullable = false)
//    private Post post;

    private Double longitude;

    private Double latitude;
}
