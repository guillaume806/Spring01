package com.example.demo_bases_spring.controllers;

import com.example.demo_bases_spring.model.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class PersonController {

    @GetMapping("/person-details")
    public String getPersonDetails(Model model) {

        Person person = new Person();
        person.setFirstName("bibou");
        person.setLastName("bobine");
        person.setAge(30);
        person.setEmail("belette@gmail.com");
        person.setPhoneNumbers(54456565);



        model.addAttribute("person", person);


        return "person/person-details";
    }

    @GetMapping("/person-details-json")
    @ResponseBody
    public Person getPersonDetailsJson() {

        Person person = new Person();
        person.setFirstName("adi");
        person.setLastName("bou");
        person.setAge(30);
        person.setEmail("adi@boub.com");
        person.setPhoneNumbers(54456565);


        return person;
    }
}
