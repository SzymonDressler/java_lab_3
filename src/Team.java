public class Team extends Polskie_Kluby {
    protected double budget;


    public Team(String fullName, String founded, double budget) {
        super(fullName, founded);
        this.budget = budget;
    }


    @Override
    public String toString() {
        return "Team{" +
                super.toString() +
                ", budget=" + budget +
                '}';
    }}
