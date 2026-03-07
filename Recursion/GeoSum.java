public class GeoSum {
    public static double geo(int k)
    {
        if(k==0)
            return 1;
        double val = 1/Math.pow(2, k);
        return val+geo(k-1);
    }

    public static void main(String[] args) {
        int k=1;
        System.out.println(geo(k));
    }
}
