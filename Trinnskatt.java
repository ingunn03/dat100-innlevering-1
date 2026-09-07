import java.util.Scanner;

public class Trinnskatt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Skriv inn bruttoinntekt: ");
        double inntekt = in.nextDouble();
        double trinnskatt = 0;

        if (inntekt >= 226101.0) {
            trinnskatt = (inntekt - 226100.0) * 0.017;
        }

        else if (inntekt >= 318301.0F) {
            trinnskatt = (inntekt - 318300.0) * 0.04;
        }

        else if (inntekt >= 725051.0) {
            trinnskatt = (inntekt - 725050.0) * 0.0137;
        }

        else if (inntekt >= 980101.0) {
            trinnskatt = (inntekt - 980100.0) * 0.0168;
        }

        else if (inntekt >= 1467201.0) {
            trinnskatt = (inntekt - 1467200.0) * 0.178;
        }

        System.out.println("Trinnskatten du må betale er: " + trinnskatt);
        in.close();
    }
}
