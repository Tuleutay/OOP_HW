package org.example.HW02;

import java.util.Random;

public abstract class Runner {

    String name;
    String type;

    protected int maxRunDistance;
    protected int maxJumpHeight;

    public static int getIndex() {
        return index;
    }

    static int index;




    public Runner(String name, String type, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;

    }

    protected Runner() {
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.name + " пробежал " + distance + " км.");
        } else {
            System.out.println(this.name + " не может пробежать " + distance + " км.");
            index++;
        }
    }

    public void jump(int wallHeight) {
        if (wallHeight <= maxJumpHeight) {
            System.out.println(this.name + " перепрыгнул стену высотой " + wallHeight + " м.");
        } else {
            System.out.println(this.name + " не может прыгнуть на высоту " + wallHeight + " м.");
            index++;
        }
    }

}
