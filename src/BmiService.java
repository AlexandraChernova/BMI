public class BmiService {
    public double bmi(double height, int weight) {
        double index;
        index = weight / height / height;
        return index;
    }
}
