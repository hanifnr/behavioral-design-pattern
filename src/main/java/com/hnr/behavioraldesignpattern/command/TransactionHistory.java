/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hnr.behavioraldesignpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanifnr
 */
public class TransactionHistory {

    enum action {
        jual, beli
    }
    private List<Transaction> list = new ArrayList<>();

    public TransactionHistory() {
    }

    public void addTransction(Item item, int qty, action act) {
        list.add(new Transaction(item, qty, act));
    }

    public void showHistory(Item item) {
        list.forEach((t) -> {
            Item i = t.getItem();
            if (item.getId() == i.getId()) {
                System.out.println(String.format("Item %s %s %d", i.getName(), t.getAct(), Math.abs(t.getQty())));

            }
        });
        System.out.println("--------------------------");
        System.out.println(String.format("Total %s qty = %d\n\n", item.getName(), item.getQty()));
    }

    class Transaction {

        private Item item;
        private int qty;
        private action act;

        public Transaction(Item item, int qty, action act) {
            this.item = item;
            this.qty = qty;
            this.act = act;
        }

        public Item getItem() {
            return item;
        }

        public int getQty() {
            return qty;
        }

        public action getAct() {
            return act;
        }

    }

}
