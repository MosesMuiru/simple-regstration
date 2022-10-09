package Accounts;
import java.util.Random;
import java.util.Scanner;

public class Fees implements importantDetails{
    private int expectedFee = 29000;
    private int fee;

    public boolean feePaid ;
    Scanner input = new Scanner(System.in);




//   getting expected fee
    public void setExpectedFee(int amount){
        this.expectedFee = amount;
    }
    // get
    public int getExpectedFee(){
        return expectedFee;
    }

    public void payingFee(){





        try {
            System.out.println("enter the your fees you have for this semester");
            this.fee = input.nextInt();
        }
        catch(NumberFormatException ex){
            System.out.println("please input a number mother fucker"+ex);
        }

        if(getExpectedFee() == this.fee) {
            this.feePaid = true;
            System.out.println("Fee is fully paid");
        }
        else if (this.fee > getExpectedFee()) {
            this.feePaid = true;
            System.out.println();
            System.out.println((getExpectedFee() - this.fee));

        }
        else {
            System.out.println("the fee is less, duration is running out");
           this.feePaid = false;
        }



    }
    //checkking the fee balance
    public void regesterUnits(){
        if(this.feePaid){
            System.out.println("Units are regestered");
        }
        else System.out.println("sooory--you can not regester for units");
    }


}
