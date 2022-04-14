/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author Jayesh
 */
public class HellowClass {

    private String messege;
    
    public HellowClass(String messege) {
        this.messege=messege;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    @Override
    public String toString() {
        return "HellowClass{" + "messege=" + messege + '}';
    }

   
    
    
}
