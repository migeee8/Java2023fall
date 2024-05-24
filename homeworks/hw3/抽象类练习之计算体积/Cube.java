package hw3;

public class Cube extends ObjectVolume{
	private double Length;

    public Cube(double Length) {
        this.Length = Length;
    }

    @Override
    double getVolume() {
        return Math.pow(Length, 3);
    }
}
