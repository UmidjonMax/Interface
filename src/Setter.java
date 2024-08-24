public class Setter extends VolleyballPlayer{
    private int countOfSets;
    public Setter(String nameOfPlayer, String sportType, int numberPosition, String temName, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, temName, numberOfPoints);
        this.countOfSets = countOfSets;
    }
    public int getCountOfSets(){
        return countOfSets;
    }
}
