package com.example.jpabook.chap7.compositekey.identifying.embeddedId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

// ์์
@Entity
public class GrandChild {
    @EmbeddedId
    private GrandChildId id;

    @MapsId("childId") // GrandChildId.childId ๋งคํ
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "PARENT_ID"),
        @JoinColumn(name = "CHILD_ID")
    })
    private Child child;

    private String name;
}