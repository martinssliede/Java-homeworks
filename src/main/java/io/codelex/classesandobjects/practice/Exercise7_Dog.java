package io.codelex.classesandobjects.practice;

public class Exercise7_Dog {
    private String name;
    private String sex;
    private String mothersName;
    private String fathersName;

    public String fathersName() {
        if (fathersName == null) {
            return "Unknown";
        } else {
            return fathersName;
        }
    }

    public Boolean hasSameMotherAs(Exercise7_Dog otherDog) {
        if (otherDog.mothersName.equals(otherDog.mothersName)) {
            return true;
        } else {
            return false;
        }
    }

    public Exercise7_Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Exercise7_Dog(String name, String sex, String mothersName, String fathersName) {
        this.name = name;
        this.sex = sex;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    @Override
    public String toString() {
        return "Exercise7_Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
