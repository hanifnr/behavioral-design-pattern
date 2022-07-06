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
public class SellCommand extends ItemCommand {

    TransactionHistory th;

    public SellCommand(Item item, TransactionHistory th) {
        super(item);
        this.th = th;
    }

    @Override
    public void execute(int qty) {
        item.sell(qty);
        th.addTransction(item, qty, TransactionHistory.action.jual);
    }

}
