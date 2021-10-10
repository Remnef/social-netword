package com.cg.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long user_Id;

    private String caption;

    private enum type {
        IMAGE,
        VIDEO
    };

    @Column(nullable = false)
    private String post_Url;


    private Date date_Created;

    private Date date_Updated;

    public  String getUpdate(Date date) {
        return  new SimpleDateFormat("yyyy:MM:dd HH:mm").format(date);
    }
}
