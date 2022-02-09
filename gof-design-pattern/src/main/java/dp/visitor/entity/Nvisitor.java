package dp.visitor.entity;

import dp.visitor.PvistitorI;

public class Nvisitor implements PvistitorI {
    public void doCheckup() {
        System.out.println("Nurse visit");
    }
}
