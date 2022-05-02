package com.jpa.crud.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String writer;          // 글쓴이
    private String contents;        // 본문내용
    private String title;           // 제목
    private int views;              // 조회수
    private Date regDttm;           // 등록일

    @Builder
    public Board(int idx, String title){
        this.idx = idx;
        this.title = title;
    }


}
