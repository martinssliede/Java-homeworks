package io.codelex.Objects_Additional.Exercise2;

public class TrafficLight_test {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight("Green", 45);
        System.out.println("Current light: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration());
        System.out.println("Is it red? " + trafficLight.isRead());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.changeColor("Red", 30);
        System.out.println();
        System.out.println("Color changed!");
        System.out.println("Current light: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration());
        System.out.println("Is it red? " + trafficLight.isRead());
        System.out.println("Is it green? " + trafficLight.isGreen());
    }

}
