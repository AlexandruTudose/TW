package com.asciipic.controllers;

import com.asciipic.models.User;
import com.asciipic.services.TestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1/test_models")
public class TestModelController {

    @Autowired
    private TestModelService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> get() {
        List<User> students = this.service.getAll();
        if (students.isEmpty()) {
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(students, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<User> addStudent(@RequestBody User student) {
        User savedStudent = this.service.save(student);
        return new ResponseEntity<User>(savedStudent, HttpStatus.CREATED);
    }
}
