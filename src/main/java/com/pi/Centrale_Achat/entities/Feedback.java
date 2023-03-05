package com.pi.Centrale_Achat.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int questionCount;
    String theme;

    @Enumerated(EnumType.STRING)
    @Column
    private TypeQu typeQu;

    @OneToMany(mappedBy = "feedback", cascade= CascadeType.PERSIST)
    List<Question> questions;
}
