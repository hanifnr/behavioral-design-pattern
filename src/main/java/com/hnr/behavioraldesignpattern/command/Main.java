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
public class Main {

    public static void main(String[] args) {
        TransactionHistory th = new TransactionHistory();
        Item baju = new Item(1, "baju");
        Item celana = new Item(2, "celana");

        BuyCommand buyBajuCommand = new BuyCommand(baju, th);
        SellCommand sellBajuCommand = new SellCommand(baju, th);
        buyBajuCommand.execute(10);
        sellBajuCommand.execute(2);
        sellBajuCommand.execute(4);

        BuyCommand buyCelanaCommand = new BuyCommand(celana, th);
        SellCommand sellCelanaCommand = new SellCommand(celana, th);
        buyCelanaCommand.execute(2);
        buyCelanaCommand.execute(2);
        sellCelanaCommand.execute(3);

        th.showHistory(baju);
        th.showHistory(celana);

    }

}
