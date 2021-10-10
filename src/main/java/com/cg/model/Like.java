package com.cg.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "likes")
public class Like {

    @Id
    private Long user_Id;

    @Id
    private Long post_Id;

    @Column(nullable = false)
    private Long reaction_Id;

    private Date date_Created;

}
