package org.example.Classes.Rewards;

import org.example.Classes.ItemGenerator;
import org.example.Classes.iGameItem;

public class PlatinumFabric extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Platinum();
    }
}
