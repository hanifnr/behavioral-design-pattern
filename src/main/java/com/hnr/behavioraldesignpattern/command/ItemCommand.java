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
public abstract class ItemCommand {

    Item item;

    public ItemCommand(Item item) {
        this.item = item;
    }

    public abstract void execute(int qty);

}
