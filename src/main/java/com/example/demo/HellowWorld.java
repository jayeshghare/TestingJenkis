/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jayesh
 */
@RestController
public class HellowWorld {

    @GetMapping(path = "/hii")
    public String Hii() {
        return ("{Hii:Theress}");
    }

    @GetMapping(path = "/hiithere/{name}")
    public HellowClass hellowClass(@PathVariable String name) {
        return new HellowClass("Hii, "+name);
    }

}
