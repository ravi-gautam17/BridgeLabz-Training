package com.oops.day9.birdsanctuary;


public class Penguin extends Bird implements Swimmable {

    public Penguin(String id, String name) {
        super(id, name, "Penguin");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims swiftly underwater.");
    }

    @Override
    public void displayInfo() {
        System.out.println(getId() + " | " + getName() + " | Penguin | Swimmable");
    }
}