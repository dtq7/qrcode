package com.etz.qrcode.controller;

import com.etz.qrcode.QRgenerator;
import com.etz.qrcode.model.dtos.StudentDto;
import com.etz.qrcode.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.OutputStream;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@Valid @RequestBody StudentDto studentDto){
        studentService.createStudent(studentDto);
    }

//    @RequestMapping(value = "get/student/{matricNumber}", method = RequestMethod.GET)
//    public void qrcode(@PathVariable("matricNumber") String matricNumber, HttpServletResponse response) throws Exception {
//        response.setContentType("image/png");
//        OutputStream outputStream = response.getOutputStream();
//        outputStream.write(QRgenerator.getQRCodeImage(matricNumber, 200, 200));
//        outputStream.flush();
//        outputStream.close();
//    }


}
