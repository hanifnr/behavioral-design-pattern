/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.behavioraldesignpattern.cor;

import java.util.ArrayList;

/**
 *
 * @author hanifnr
 */
public class ArrayListPerson extends ArrayList<Person> {

    public void info() {
        this.forEach(next -> {
            System.out.println(String.format("Nama: %s\nJenis Kelamin: %s\nUmur: %d\n", next.getName(), next.getGender(), next.getAge()));
        });
    }

}
