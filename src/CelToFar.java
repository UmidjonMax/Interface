public class CelToFar implements BaseConverter{
    @Override
    public double convert(double celsius) {
        return (celsius*9/5)+32;
    }
}
