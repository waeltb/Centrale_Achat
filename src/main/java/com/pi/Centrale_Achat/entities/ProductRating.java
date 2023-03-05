package com.pi.Centrale_Achat.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String feedback;
    @ManyToOne
    private User rater;
    private int rating;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern ="yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private Date ratingDate;
    @ManyToOne()
    private Product product;
}
