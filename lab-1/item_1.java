public class item_1 {
    public static void main(String[] args) {
        long birthRateInSeconds = 7;
        long deathRateInSeconds = 13;
        long newImmigrantInSeconds = 45;
        long currentPopulation = 312032486;
        long secondsInyears;

        for (int i = 1; i <= 5; i++) {
            secondsInyears = i * 60 * 60 * 24 * 365;
            long numBirths = secondsInyears / birthRateInSeconds;
            long numDeaths = secondsInyears / deathRateInSeconds;
            long numImmigrants = secondsInyears / newImmigrantInSeconds;
            long population = currentPopulation + numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + population);
        }
    }
}
