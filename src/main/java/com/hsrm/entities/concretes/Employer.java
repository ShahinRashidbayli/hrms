package com.hsrm.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "employer_id")
    private int employer_id;

    @Column(name = "company_name")
    private String company_name;

    @Column(name = "website")
    private String website;

    @Column(name = "company_email")
    private String company_email;


    @Column(name = "sifre")
    private String sifre;

    @Column(name = "sifre_tekrar")
    private String sifre_tekrar;

}
