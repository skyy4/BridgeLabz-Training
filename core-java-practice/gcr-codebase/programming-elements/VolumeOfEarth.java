public class VolumeOfEarth {

    public static void main(String[] args) {

        double r = 6378;
        double vKm = (4.0 / 3.0) * Math.PI * r * r * r;
        double vM = vKm * 0.239913;

        System.out.println("The volume of the earth in cubic kilometers is " + vKm + " and in cubic miles is " + vM);
    }
}