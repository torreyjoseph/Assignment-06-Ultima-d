import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Input World Time: ");
        int worldTime = sc.nextInt();
        int year = (worldTime / 1440 / 365) + 1;
        int day = ((worldTime / 1440) % 365) + 1;
        int hour = (worldTime / 60) % 24;
        int minute = worldTime % 60;
        int trammelPhase = ((worldTime / 1440) % 9) + 1;
        int fellucaPhase = ((worldTime / 1440) % 14) + 1;
        System.out.printf("It is %02d:%02d on day %d of year %d.", hour, minute, day, year);
        System.out.print("\nTrammel is currently on day "+ trammelPhase +" of it's 9-day cycle.");
        System.out.print("\nFelucca is currently on day "+ fellucaPhase +" of it's 14-day cycle.");
    }
}
