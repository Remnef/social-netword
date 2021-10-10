package com.cg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Calendar;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_userfrom")
    private User userFrom;

    @ManyToOne
    @JoinColumn(name = "id_userto")
    private User userTo;

    @NotBlank
    private Date time = Calendar.getInstance().getTime();

}
