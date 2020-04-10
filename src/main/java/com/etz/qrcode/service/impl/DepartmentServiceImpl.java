package com.etz.qrcode.service.impl;

import com.etz.qrcode.model.dtos.DepartmentDto;
import com.etz.qrcode.model.entities.Department;
import com.etz.qrcode.repository.DepartmentRepository;
import com.etz.qrcode.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ajao temitayo
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void createDepartment(DepartmentDto departmentDto) {
        Department department = new Department();
        BeanUtils.copyProperties(departmentDto, department);
        departmentRepository.save(department);
    }
}
