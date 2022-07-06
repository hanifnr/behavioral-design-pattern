/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.behavioraldesignpattern.command;

/**
 *
 * @author hanifnr
 */
public class Item {

    private int id;
    private String name;
    private int qty;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void buy(int qty) {
        this.qty = this.qty + qty;
    }

    public void sell(int qty) {
        int result = this.qty - qty;
        if (result < 0) {
            System.out.println("Qty tidak mencukupi!");
        } else {
            this.qty = result;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }
}
