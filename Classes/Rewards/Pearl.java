package org.example.Classes.Rewards;

import org.example.Classes.iGameItem;

public class Pearl implements iGameItem{

    @Override
    public void open() {
        System.out.println("Pearl!");
    }
}
