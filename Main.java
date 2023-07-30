package org.example;

import org.example.Classes.ItemGenerator;
import org.example.Classes.Rewards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();
        fab1.openReward();
        ItemGenerator fab2 = new GemFabric();
        fab2.openReward();
        ItemGenerator fab3 = new EmeraldFabric();
        fab3.openReward();
        ItemGenerator fab4 = new PearlFabric();
        fab4.openReward();
        ItemGenerator fab5 = new PlatinumFabric();
        fab5.openReward();
        ItemGenerator fab6 = new RubyFabric();
        fab6.openReward();
        ItemGenerator fab7 = new SapphireFabric();
        fab7.openReward();
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabList = new ArrayList<>();
        fabList.add(fab1);
        fabList.add(fab2);
        fabList.add(fab3);
        fabList.add(fab4);
        fabList.add(fab5);
        fabList.add(fab6);
        fabList.add(fab7);
        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(fabList.size());
            fabList.get(index).openReward();
        }
    }
}