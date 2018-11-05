import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Input World Time: ");
        int worldTime = sc.nextInt();
        dayYear(worldTime);
        trammelPhase(worldTime);
        fellucaPhase(worldTime);
    }
    public static void dayYear(int worldTime){
        int year = (worldTime / 1440 / 365) + 1;
        int day = ((worldTime / 1440) % 365) + 1;
        int hour = (worldTime / 60) % 24;
        int minute = worldTime % 60;
        System.out.printf("It is %02d:%02d on day %d of year %d.", hour, minute, day, year);
    }
    public static void trammelPhase(int worldTime){
        int trammelPhase = ((worldTime / 1440) % 9) + 1;
        System.out.print("\nTrammel is currently on day "+ trammelPhase +" of it's 9-day cycle.");
    }
    public static void fellucaPhase(int worldTime){
        int fellucaPhase = ((worldTime / 1440) % 14) + 1;
        System.out.print("\nFelucca is currently on day "+ fellucaPhase +" of it's 14-day cycle.");
    }
}
