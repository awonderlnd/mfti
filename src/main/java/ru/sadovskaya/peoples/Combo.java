package ru.sadovskaya.peoples;

import java.util.ArrayList;
import java.util.List;

public class Combo {
    public List<Kick> kicks = new ArrayList<>();

    public void perform(KarateKid kid) {
        for (Kick kick : kicks) {
            kick.make(kid);
        }
    }
}
