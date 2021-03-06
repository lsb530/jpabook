package com.example.jpabook.chap6.manytoone.oneside;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

}

// 하나의 파일을 계속 바꿔가면서 개선하는 방식의 책