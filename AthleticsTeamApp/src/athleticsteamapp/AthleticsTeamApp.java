package athleticsteamapp;

import java.util.Scanner;

public class AthleticsTeamApp {

    public static double calcAvgDistance(int[] distanceRun) {

        double averageDist = 0;
        int sum = 0;

        for (int i = 0; i < distanceRun.length; i++) {
            sum += distanceRun[i];
        }
        averageDist = (double) sum / distanceRun.length;
        return averageDist;
    }

    public static int determineFastRunner(int[] distanceRun, double averageDistance) {
        int index;
        int fastRunner = 0;
        for (int i = 0; i < distanceRun.length; i++) {
            if (distanceRun[i] > averageDistance &&distanceRun[i] > fastRunner) {
                fastRunner = distanceRun[i];
                index =i;

            }
        }
        return fastRunner;
    }

    public static void displayMemberDetails(String[] membersNames, int[] membersAge, int[] distanceRun, double averageDistance, int fastR) {
        System.out.println("Club Member information{}");
        System.out.println("Name\t\tAge\t\tdistance");
        for (int i = 0; i < membersNames.length;i++) {
            System.out.println(membersNames[i]+ "\t\t" + membersAge[i] + "\t\t" +distanceRun[i]);
            
        }
        System.out.println(membersNames[fastR] + " run is above the average distance by club members");
        System.out.println("Average Distance run by Club members{} " +Math.round(averageDistance)+" kilometers");

    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String[] membersNames = {"Sello M", "Jason P", "Lethu A", "Banda B", "john B", "Wicky j"};
        int[] membersAge = {35, 42, 42, 25, 32, 49};

        int[] distanceRun = new int[membersAge.length];
        for (int i = 0; i < distanceRun.length; i++) {
            System.out.print("Enter distance run by " + membersNames[i]+". (in kilometers){} ");
            distanceRun[i] = kb.nextInt();
        }

        double averageDistance = calcAvgDistance(distanceRun);
        int fastR = determineFastRunner(distanceRun, averageDistance);

        displayMemberDetails(membersNames, membersAge, distanceRun, averageDistance, fastR);
    }
}
