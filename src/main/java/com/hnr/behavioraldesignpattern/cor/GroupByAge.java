/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.behavioraldesignpattern.cor;

/**
 *
 * @author hanifnr
 */
public class GroupByAge extends Group {

    @Override
    public void process(ListPerson list, Person person) {
        if (person.getAge() >= 17) {
            list.getListAdult().add(person);
        } else {
            list.getListMinor().add(person);
        }
    }
}
