package io.codelex.oop.Parcels;

public class Parcels_Test {
    public static void main(String[] args) {
        Parcel validParcel = new Parcel(35,33,45,29.0f, false);
        validParcel.validate();

        System.out.println();
        Parcel invalidParcel = new Parcel(29, 16, 44, 10.5f, true);
        invalidParcel.validate();
    }
}
