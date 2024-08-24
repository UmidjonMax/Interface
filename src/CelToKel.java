public class CelToKel implements BaseConverter{
    @Override
    public double convert(double celsius) {
        return celsius+273.15;
    }
}
