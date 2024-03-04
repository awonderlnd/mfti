package ru.sadovskaya.peoples;

import java.util.ArrayList;
import java.util.List;

public class KarateKid {
    String name;

    public KarateKid(String name) {
        this.name = name;
    }

    public void kick() {
        System.out.println(name + ": kiya!");
    }

    public void jump() {
        System.out.println(name + ": uaaaa!");
    }

    public void punch() {
        System.out.println(name + ": bac!");
    }
}


/*KarateKid kid = new KarateKid("daniel");
        kid.kick();
        kid.kick();
        kid.jump();

        Combo combo = new Combo();
        combo.kicks.add(x -> x.punch());
        combo.perform(kid);*/