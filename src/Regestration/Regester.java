package Regestration;
import java.text.NumberFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Regester {

    Scanner scan = new Scanner(System.in);
    ArrayList<String> listAll = new ArrayList<>();
    private String name;
    private String regNumber;
    private String age;

//    set the variables
    public void setName(){
        System.out.println("enter your name");
       this.name = scan.nextLine();

    }

  public void setAge(){
        try {


            System.out.println("enter your age");

            String age = scan.nextLine();
            if (parseInt(age) > 30) {
                System.out.println("this age is invalid please put another age");
                setAge();
            } else this.age = age;
        }
        catch(NumberFormatException ex){
            System.out.println("we expect a number"+ex);
            setAge();
        }

    }


    public void setRegNumber(){
        System.out.println("input your reg n");
        this.regNumber = scan.nextLine();
    }

    //

    public String getName() {
        return name;
    }
    public String getRegNumber(){
        return regNumber;
    }
    public String getAge(){
        return age;
    }

    public void compile(){

        listAll.add(getName());
        listAll.add(getRegNumber());
        listAll.add(getAge());
        System.out.println(listAll);
    }
}
