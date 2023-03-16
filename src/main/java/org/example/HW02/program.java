package org.example.HW02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class program {


    public static void main(String[] args) {
        Random r = new Random();

        List<letsValue> lets = new ArrayList<>();
        fillArrayLets(r, lets);

        List<Runner> runners = new ArrayList<>();
        fillArrayRunners(runners);

        for (letsValue o : lets) {
            if (Runner.getIndex() >= runners.size()) {
                System.out.println("Бегуны закончились");
                break;
            } else {
                if (o instanceof wall) {
                    (runners.get(Runner.getIndex())).jump(((wall) o).getHeight());

                } else {
                    (runners.get(Runner.getIndex())).run(((treadmill) o).getDistance());

                }
            }
        }
    }

    private static void fillArrayRunners(List<Runner> runners) {
        runners.add(new Cat("Barsik", "cat"));
        runners.add(new Human("Adam", "human"));
        runners.add(new Robot("3PO", "robot"));
        runners.add(new Robot("Arcana", "robot"));
    }

    private static void fillArrayLets(Random r, List<letsValue> lets) {
        lets.add(new wall(r.nextInt(8)));
        lets.add(new treadmill(r.nextInt(8, 13)));
        lets.add(new wall(r.nextInt(7)));
        lets.add(new treadmill(r.nextInt(8, 23)));
        lets.add(new wall(r.nextInt(7)));
        lets.add(new treadmill(r.nextInt(1, 33)));
        lets.add(new wall(r.nextInt(8)));
        lets.add(new treadmill(r.nextInt(13, 43)));
        lets.add(new treadmill(r.nextInt(1, 33)));
        lets.add(new wall(r.nextInt(8)));
        lets.add(new treadmill(r.nextInt(23, 43)));
        lets.add(new treadmill(r.nextInt(23, 43)));
        lets.add(new treadmill(r.nextInt(1, 33)));
        lets.add(new wall(r.nextInt(8)));
        lets.add(new treadmill(r.nextInt(13, 43)));
    }


}
