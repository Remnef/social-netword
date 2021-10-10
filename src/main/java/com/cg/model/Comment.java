package com.cg.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long post_Id;

    @Column(nullable = false)
    private Long user_Id;

    @Column(nullable = false)
    private String content;

    private Date date_Created = Calendar.getInstance().getTime();

    private Date date_Updated;
}
