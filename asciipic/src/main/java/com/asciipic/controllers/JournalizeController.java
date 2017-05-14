package com.asciipic.controllers;

import com.asciipic.models.Journalize;
import com.asciipic.services.journalize.JournalizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alexandru on 5/14/2017.
 */

@RestController
@RequestMapping("/journalize")
public class JournalizeController {
    

    @Autowired
    private JournalizeService journalizeService;



    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addJournalize(@RequestBody String action) {
        Journalize journalize = new Journalize(action);
        this.journalizeService.save(journalize);
        return new ResponseEntity(HttpStatus.CREATED);
    }


}
