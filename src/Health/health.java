package Health;

import java.util.ArrayList;
import Regestration.Regester;
import java.util.Scanner;

public class health implements confirmHealth {

    Scanner input = new Scanner(System.in);
    ArrayList<String>healthIssues = new ArrayList<>();


    @Override
    public void confirmhealth() {
        healthIssues.add("underweight");
        healthIssues.add("normal");
        healthIssues.add("overweight");
//        System.out.println(healthIssues);

        if(complication()<10.0)
            System.out.println(healthIssues.get(0));
        else if(complication()<15 && complication()>10) System.out.println(healthIssues.get(1));
        else System.out.println(healthIssues.get(2));

    }

    @Override
    public double complication() {
        System.out.println("this system calculates the malnitrition ");
        System.out.println();
        System.out.println("enter you height in cm");

        int height = input.nextInt();
        System.out.println("enter your weight in kgs");

        int weight = input.nextInt();
        //calculating the compilication
        double bmi = 703 * weight/Math.pow(height,2.0);
        System.out.println("you BMI is -->  "+bmi);

        return bmi;



    }
}
