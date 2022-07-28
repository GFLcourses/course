package org.my.bike;

public class BicycleFactory {

    private int mountainBikeCount = 0;
    private int roadBikeCount = 0;
    private int touringBikeCount = 0;

    public Bicycle create(BikeTypes type) {
        Bicycle bicycle = null;
        switch (type) {
            case MOUNTAIN:
                bicycle = new MountainBike();
                mountainBikeCount++;
                break;
            case ROAD:
                bicycle = new RoadBike();
                roadBikeCount++;
                break;
            case TOURING:
                bicycle = new TouringBike();
                touringBikeCount++;
                break;
            default:
                throw new IllegalArgumentException("wrong argument: " + type);
        }
        return  bicycle;
    }

    void printCounts() {
        System.out.println("Moontain bikes created: " + mountainBikeCount);
        System.out.println("Road bikes created: " + roadBikeCount);
        System.out.println("Touring bikes created: " + touringBikeCount);
    }
}
