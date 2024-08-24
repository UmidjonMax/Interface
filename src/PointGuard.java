public class PointGuard extends BasketballPlayer{
    private int countOfGuard;
    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }
    public int getCountOfGuard(){
        return countOfGuard;
    }
}
