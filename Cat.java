package Lesson7;

public class Cat extends Animal{

    public static int countCat = 0;

    public Cat(String name, float maxJump, float maxRun, float maxSwim) {
        super("Кот", name, maxJump, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    public int swim(float distance) {
        return Animal.SWIM_NONE;
    }
//
}

