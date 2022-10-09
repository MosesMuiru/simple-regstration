package Admin;

public class Finance implements FinanceDepartment{


    @Override
    public void accountClerk() {
        System.out.println("-------the names of the clerks;------");
        System.out.println("moses");
        System.out.println("kariuki james");
        System.out.println("william ruto");

    }

    @Override
    public void accountants() {
        System.out.println("---------this are the accountants of mmust-------");
        System.out.println("micheal");
        System.out.println("kamau");
        System.out.println("maureen");


    }

    @Override
    public int balance() {

        return 70000;
    }
}
