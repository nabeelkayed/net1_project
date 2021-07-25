/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net1_project;

/**
 *
 * @author hp
 */
public class receive implements Runnable {

    Client c;

    receive(Client aThis) {
        c = aThis;
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            c.receive();
        }
    }
}
