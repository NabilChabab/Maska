package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    @Column(name = "numero_adhesion")
    private String numeroAdhesion;

    private String nom;
    private String prenom;

    @Column(name = "piece_identification")
    private String pieceIdentification;

    private String nationalite;

    @Column(name = "date_adhesion")
    private LocalDate dateAdhesion;

    @Column(name = "date_expiration_licence")
    private LocalDate dateExpirationLicence;

}