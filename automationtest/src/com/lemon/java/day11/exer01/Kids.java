package com.lemon.java.day11.exer01;

public class Kids extends ManKind {
    private int tearsOld;
    public void printAge(){
        System.out.println("I am" + " yes");
    }
    public Kids(){

    }
    public Kids(int tearsOld) {
        this.tearsOld = tearsOld;
    }

    public int getTearsOld() {
        return tearsOld;
    }

    public void setTearsOld(int tearsOld) {
        this.tearsOld = tearsOld;
    }
}
