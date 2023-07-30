package org.example.Classes.Rewards;

import org.example.Classes.iGameItem;

public class Gem implements iGameItem {
    @Override
    public void open() {
        System.out.println("Gem !");
    }
}
