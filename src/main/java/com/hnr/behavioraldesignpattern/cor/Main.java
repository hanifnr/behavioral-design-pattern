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
public class Main {

    public static void main(String[] args) {
        ListPerson listPerson = new ListPerson();

        Person hanif = new Person("Hanif", 26, Person.Gender.M);
        Person bibil = new Person("Bibil", 12, Person.Gender.M);
        Person ardha = new Person("Ardha", 14, Person.Gender.M);
        Person shafira = new Person("Shafira", 22, Person.Gender.F);
        Person michelle = new Person("Michelle", 10, Person.Gender.F);

        Group group = new GroupByGender();
        group.setNext(new GroupByAge());

        group.check(listPerson, hanif);
        group.check(listPerson, bibil);
        group.check(listPerson, ardha);
        group.check(listPerson, shafira);
        group.check(listPerson, michelle);

        listPerson.info();

    }

}
