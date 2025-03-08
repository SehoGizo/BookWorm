package BookWorm;

public class Mercury implements Planet {
    @Override
    public String getEmoji() { return "☿️"; }  // Mercury symbol
    @Override
    public double getMass() { return 3.3011e23; }
    @Override
    public double getRadius() { return 2.4397e6; }
    @Override
    public double getGravity() { return 3.7; }
    @Override
    public double getDistanceFromSun() { return 57.9e6; }
}

