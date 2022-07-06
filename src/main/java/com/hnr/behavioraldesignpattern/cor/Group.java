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
public abstract class Group {

    Group group;
    ListPerson listPerson;

    public Group setNext(Group group) {
        this.group = group;
        return group;
    }

    public abstract void process(ListPerson list, Person person);

    public void check(ListPerson list, Person person) {
        process(list, person);
        if (group != null) {
            group.check(list, person);
        }
    }

}
