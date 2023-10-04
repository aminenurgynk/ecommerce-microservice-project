package com.aminenurgynk.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "authtbl")
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surname;
    private String password;
    private String email;
    private String activationCode;
    private String status;
    private String role;
    private String createdDate;
    private String updatedDate;
}
