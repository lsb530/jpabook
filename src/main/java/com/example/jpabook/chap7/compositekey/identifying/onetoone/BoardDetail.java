package com.example.jpabook.chap7.compositekey.identifying.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

// ์์
@Entity
public class BoardDetail {
    @Id
    private Long boardId;

    @MapsId // BoardDetail.boardId ๋งคํ
    @OneToOne
    @JoinColumn(name = "BOARD_ID")
    private Board board;

    private String content;

    public BoardDetail() {
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setContent(String content) {
        this.content = content;
    }
}