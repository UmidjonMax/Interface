public class FootballPlayer extends Player{
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;
    public FootballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName,
                          int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }
    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }
}
