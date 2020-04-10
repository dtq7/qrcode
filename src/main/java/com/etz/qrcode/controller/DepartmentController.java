package com.etz.qrcode.controller;

import com.etz.qrcode.model.dtos.DepartmentDto;
import com.etz.qrcode.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author ajao temitayo
 */
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createDepartment(@Valid @RequestBody DepartmentDto departmentDto){
        departmentService.createDepartment(departmentDto);
    }
}
