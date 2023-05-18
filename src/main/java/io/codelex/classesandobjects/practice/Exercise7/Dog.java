package io.codelex.classesandobjects.practice.Exercise7;

import java.util.Objects;

public class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        } else {
            return father;
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (Objects.equals(mother, otherDog.mother)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getMother() {
        return mother;
    }

    public String getFather() {
        return father;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
