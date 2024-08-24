public class VolleyballPlayer extends Player{
    private int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, String sportType, int numberPosition, String temName, int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition, temName);
        this.numberOfPoints = numberOfPoints;
    }
    public int getNumberOfPoints(){
        return numberOfPoints;
    }
}
