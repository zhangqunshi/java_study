//: c08:Adventure.java
// Multiple interfaces.
interface CanFight {
    //int a = 1;
    void fight();
}

interface CanSwim {
    void swim();
    //void fly();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    //int a = 3;
    public void fight() {
        System.out.println("fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    //int a = 9;

    public void swim() {
        //System.out.println("swim" + a);
        System.out.println("swim");
    }

    public void fly() {
        System.out.println("fly");
    }
}

public class Adventure {
    static void t(CanFight x) {
        x.fight();
    }

    static void u(CanSwim x) {
        x.swim();
    }

    static void v(CanFly x) {
        x.fly();
    }

    static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
    }
}
