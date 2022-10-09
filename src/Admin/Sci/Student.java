package Admin.Sci;
import Admin.Finance;
import Admin.Management;

import java.util.Scanner;

public class Student extends StudentDetails {
Scanner scan = new Scanner(System.in);
    @Override
    public void getDetails() {
        System.out.println("---------enter you first name-------");
        firstName = scan.next();
        System.out.println(firstName);

        System.out.println("-------enter you lastname----");
        lastName = scan.next();
        System.out.println();

        System.out.println("---------input you id number--------");
        idNumber = scan.nextInt();

        System.out.println("---------enter your reg number--------");
        regNumber = scan.next();

    }

    @Override
    public void displayMarks() {
        int [] marks = {20,30,40,56,70};
        System.out.println("---student marks-------");
//        for(int i : marks){
//            System.out.println(marks[i]);
//        }

        for (int mark : marks) {
            System.out.println(mark);
        }

    }

    public void displayDetails(){
        Management managing = new Management();
        Finance fine = new Finance();
        Lecturers lecture = new Lecturers();
        ComputerScience compSCi = new ComputerScience();
        CourseCodes code = new CourseCodes();
        Cod chair = new Cod();

        System.out.println("---------Masinde muliro university------------");
        System.out.println("-------i------choose---------mmust-------");
//vc details
        System.out.println();
        System.out.println("vice details");
        System.out.println("name---"+managing.getVcName());
        System.out.println("phone------"+managing.getVcName());

//dpv details

        System.out.println("--dvc details---");

        System.out.println("name---"+managing.getDvcName());
        System.out.println("phonenumber"+managing.getDvcName());

        //fiinance
        System.out.println("------finance-------");
        fine.accountants();
        fine.accountClerk();
        //System.out.println("balance--"+fine.balance());

        System.out.println("---compppppscieece---");
        compSCi.displayTitle();

        //name of cod
        System.out.println("our cod");
        System.out.println("name---"+chair.getCodName());
        System.out.println("number"+chair.codPhoneNumber());

        //lectures details
        System.out.println("------sci lectures------");
        lecture.compLectureers();

        System.out.println("-------2022/2023---course code");
        code.courseCodes();
        //student details

        System.out.println("------studentDetails---");
        System.out.println();
        System.out.println();

//        System.out.println("full_name  "+firstName+"\t"+lastName);
//        System.out.println("reg name--"+regNumber);
//        System.out.println("id number=="+idNumber);


        System.out.println("fee balance---"+fine.balance());

        System.out.println("thank for choosing mmust----you have power to reAD");

    }
}
