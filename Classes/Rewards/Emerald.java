package org.example.Classes.Rewards;

import org.example.Classes.iGameItem;

public class Emerald implements iGameItem {
    @Override
    public void open() {
        System.out.println("Emerald! ");
    }
}
