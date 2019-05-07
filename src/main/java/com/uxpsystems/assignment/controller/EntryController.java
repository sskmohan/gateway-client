package com.uxpsystems.assignment.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("/EntryService")
@Api(tags = "Entry Service",value="EntryService", description="Operations pertaining to User Assignment")
@CrossOrigin
public class EntryController{
	

}

