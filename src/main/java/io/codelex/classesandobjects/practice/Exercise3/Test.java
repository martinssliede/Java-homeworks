package io.codelex.classesandobjects.practice.Exercise3;

public class Test {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(33);
        System.out.println(fuelGauge.reportCurrentAmount());
        fuelGauge.fuelUp();
        System.out.println(fuelGauge.reportCurrentAmount());

        Odometer odometer = new Odometer(100000);

        // Kā piekļūt fuelGauge amount?
//        public void driving() {
//            for (fuelGauge.)
//        }
    }
}
