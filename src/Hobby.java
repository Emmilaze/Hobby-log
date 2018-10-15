public class Hobby {

    private boolean masterOfSport;
    private int amountOfAwards;
    private double duration;
    private byte amountOfEquipment;
    private char numberInTeam = '1';
    private long amountOfCompetitions;
    private short amountOfGoldMedals;
    private float winRate;

    public Hobby() {
    }

    public Hobby(boolean masterOfSport, int amountOfAwards, double duration) {
        this.masterOfSport = masterOfSport;
        this.amountOfAwards = amountOfAwards;
        this.duration = duration;
    }

    public Hobby(int amountOfAwards, double duration, char numberInTeam, long amountOfCompetitions,
                 float winRate) {
        this.amountOfAwards = amountOfAwards;
        this.duration = duration;
        this.numberInTeam = numberInTeam;
        this.amountOfCompetitions = amountOfCompetitions;
        this.winRate = winRate;
    }

    public Hobby(boolean masterOfSport, int amountOfAwards, double duration, byte amountOfEquipment,
                 char numberInTeam, long amountOfCompetitions, short amountOfGoldMedals, float winRate) {
        this.masterOfSport = masterOfSport;
        this.amountOfAwards = amountOfAwards;
        this.duration = duration;
        this.amountOfEquipment = amountOfEquipment;
        this.numberInTeam = numberInTeam;
        this.amountOfCompetitions = amountOfCompetitions;
        this.amountOfGoldMedals = amountOfGoldMedals;
        this.winRate = winRate;
    }

    public boolean isMasterOfSport() {
        return masterOfSport;
    }

    public void setMasterOfSport(boolean masterOfSport) {
        this.masterOfSport = masterOfSport;
    }

    public int getAmountOfAwards() {
        return amountOfAwards;
    }

    public void setAmountOfAwards(int amountOfAwards) {
        this.amountOfAwards = amountOfAwards;
    }

    public double getDuration() {
        return duration;
    }

    public byte getAmountOfEquipment() {
        return amountOfEquipment;
    }

    public void setAmountOfEquipment(byte amountOfEquipment) {
        this.amountOfEquipment = amountOfEquipment;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public char getNumberInTeam() {
        return numberInTeam;
    }

    public void setNumberInTeam(char numberInTeam) {
        this.numberInTeam = numberInTeam;
    }

    public long getAmountOfCompetitions() {
        return amountOfCompetitions;
    }

    public void setAmountOfCompetitions(long amountOfCompetitions) {

        this.amountOfCompetitions = amountOfCompetitions;
    }

    public short getAmountOfGoldMedals() {
        return amountOfGoldMedals;
    }

    public void setAmountOfGoldMedals(short amountOfGoldMedals) {
        this.amountOfGoldMedals = amountOfGoldMedals;
    }

    public float getWinRate() {
        return winRate;
    }

    public void setWinRate(float winRate) {
        this.winRate = winRate;
    }

    @Override
    public String toString() {
        String info = "Information about hobby: ";
        if (masterOfSport == true) {
            info = "Master of sport. ";
        }
        info += "Amount of awards: " + amountOfAwards + ". ";
        info += "Duration: " + duration + ". ";
        info += "Amount of equipment: " + amountOfEquipment + ". ";
        info += "Number in team: " + numberInTeam + ". ";
        info += "Amount of competitions: " + amountOfCompetitions + ". ";
        info += "Amount of gold medals: " + amountOfGoldMedals + ". ";
        info += "Win rate: " + winRate + ".";
        return info;
    }
}
