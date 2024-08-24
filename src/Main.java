public class Main {
    public static void main(String[] args) {
        double celsius = 25.5;

        BaseConverter kelvin = new CelToKel();
        double kel = kelvin.convert(celsius);
        System.out.println(celsius+"°C = "+kel+"K");

        BaseConverter fahrenheit = new CelToFar();
        double fahr = fahrenheit.convert(celsius);
        System.out.println(celsius + "°C = " + fahr + "°F");

        FootballPlayer footballPlayer = new FootballPlayer("Pedri", "Football", 8, "Spain", 4, 9, 12);
        System.out.println("\n"+footballPlayer.getInfo());
        System.out.println("Team: " + footballPlayer.getTeamName());
        System.out.println("Goals: " + footballPlayer.getCountOfGoals());
        System.out.println("Red Cards: " + footballPlayer.getCountOfRedCard());
        System.out.println("Yellow Cards: " + footballPlayer.getCountOfYellowCard());

        GoalKeeper goalKeeper = new GoalKeeper("Jose Sa", "Football", 12, "Wolves", 0, 4, 0, 250);
        System.out.println("\n"+goalKeeper.getInfo());
        System.out.println("Team: " + goalKeeper.getTeamName());
        System.out.println("Saves: "+ goalKeeper.getCountOfSaves());

        VolleyballPlayer volleyballPlayer = new VolleyballPlayer("Karch Kiraly", "Volleyball", 5, "USA",
                2000);
        System.out.println("\n" + volleyballPlayer.getInfo());
        System.out.println("Team: " + volleyballPlayer.getTeamName());
        System.out.println("Points: " + volleyballPlayer.getNumberOfPoints());

        // Setter yaratish
        Setter setter = new Setter("John Doe", "Volleyball", 3, "Some Team",
                1500, 200);
        System.out.println("\n" + setter.getInfo());
        System.out.println("Team: " + setter.getTeamName());
        System.out.println("Sets: " + setter.getCountOfSets());

        // Basketball Player yaratish
        BasketballPlayer basketballPlayer = new BasketballPlayer("Michael Jordan", "Basketball", 23, "Chicago Bulls",
                30000);
        System.out.println("\n" + basketballPlayer.getInfo());
        System.out.println("Team: " + basketballPlayer.getTeamName());
        System.out.println("Goals: " + basketballPlayer.getNumberOfGoals());

        // Point Guard yaratish
        PointGuard pointGuard = new PointGuard("Stephen Curry", "Basketball", 30, "Golden State Warriors",
                20000);
        System.out.println("\n" + pointGuard.getInfo());
        System.out.println("Team: " + pointGuard.getTeamName());
        System.out.println("Guard Count: " + pointGuard.getCountOfGuard());
    }
}