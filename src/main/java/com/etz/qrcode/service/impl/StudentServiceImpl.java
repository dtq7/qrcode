package com.etz.qrcode.service.impl;

import com.etz.qrcode.advice.DepartmentNotFoundException;
import com.etz.qrcode.model.dtos.StudentDto;
import com.etz.qrcode.model.entities.Department;
import com.etz.qrcode.model.entities.Student;
import com.etz.qrcode.repository.DepartmentRepository;
import com.etz.qrcode.repository.StudentRepository;
import com.etz.qrcode.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = new Student();
        if(departmentRepository.existsById(studentDto.getDepartmentId())){
            Department department = departmentRepository.findById(studentDto.getDepartmentId()).get();
            BeanUtils.copyProperties(studentDto, student);
            student.setDepartment(department);
            studentRepository.save(student);
        }else{
            throw new DepartmentNotFoundException("Department with this ID does not exist");
        }
    }
}
