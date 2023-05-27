package io.codelex.oop.Parcels;

public class Parcel implements Validatable{
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        int sumOfDimensions = xLength + yLength + zLength;
        boolean areDimensionsValid = sumOfDimensions <= 300 && xLength >= 30 && yLength >= 30 && zLength >= 30;
        boolean isWeightValid = (isExpress && weight <= 15) || (!isExpress && weight <= 30);

        if (!areDimensionsValid) {
            System.out.println("Invalid dimensions: sum of dimensions exceed 300, or one of the dimensions is less than 30.");
        } else {
            System.out.println("Dimensions are valid!");
        }

        if (!isWeightValid) {
            System.out.println("Invalid weight: weight exceeds maximum limit.");
        } else {
            System.out.println("Weight is valid!");
        }

        return areDimensionsValid && isWeightValid;
    }
}
