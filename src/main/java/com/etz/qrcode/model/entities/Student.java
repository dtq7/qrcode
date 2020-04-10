package com.etz.qrcode.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "student")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Student extends BaseEntity{

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "matric_number", unique = true, nullable = false)
    private String matricNumber;

}
