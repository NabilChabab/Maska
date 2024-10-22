package org.example.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Membre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adhesion_number")
    private String adhesionNumber;

    private String firstname;
    private String lastname;

    @Column(name = "cin")
    private String cin;

    private String nationality;

    @Column(name = "adhession_date")
    private LocalDate adhessionDate;

    @Column(name = "expiration_date_licence")
    private LocalDate expirationDateLicence;

}