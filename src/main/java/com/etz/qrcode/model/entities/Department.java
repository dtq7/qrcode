package com.etz.qrcode.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ajao temitayo
 */
@Entity
@Getter
@Setter
@Table(name = "department")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Department extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "fee", nullable = false)
    private long fee;
}
