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
public class ListPerson {

    ArrayListPerson listMale = new ArrayListPerson();
    ArrayListPerson listFemale = new ArrayListPerson();
    ArrayListPerson listAdult = new ArrayListPerson();
    ArrayListPerson listMinor = new ArrayListPerson();

    public ArrayListPerson getListMale() {
        return listMale;
    }

    public ArrayListPerson getListFemale() {
        return listFemale;
    }

    public ArrayListPerson getListAdult() {
        return listAdult;
    }

    public ArrayListPerson getListMinor() {
        return listMinor;
    }

    public void info() {
        System.out.println("======== Group of Male ========");
        listMale.info();
        System.out.println("======== Group of Female ========");
        listFemale.info();
        System.out.println("======== Group of Adult ========");
        listAdult.info();
        System.out.println("======== Group of Minor ========");
        listMinor.info();
    }

}
