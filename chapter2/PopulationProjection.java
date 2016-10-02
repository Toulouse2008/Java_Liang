/**2.11 Rewrite the 2.11 prompt "enter the years and diplay the population */

import java.util.Scanner;

public class PopulationProjection{
    public static void main(String[] args){
        final long CURRENT = 312032486;
        int years;
        long seconds = 365 * 24 * 60 * 60;
        long totalSeconds, birth, immigrant, death, population;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of years:");
        years = input.nextInt();
        totalSeconds = years * seconds;
        birth = (int)(totalSeconds / 7);
        immigrant = (int)(totalSeconds / 45);
        death = (int)(totalSeconds / 13);

        population = CURRENT + birth + immigrant - death;
        System.out.println("The US population in " + years +
            " years is " + population);
    }
}
