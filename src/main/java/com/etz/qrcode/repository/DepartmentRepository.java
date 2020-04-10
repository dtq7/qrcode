package com.etz.qrcode.repository;

import com.etz.qrcode.model.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ajao temitayo
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
