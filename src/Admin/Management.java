package Admin;

public class Management implements Vc,Dvc {

    @Override
    public String getDvcName() {
        return "Gachaguadvc";
    }

    @Override
    public long getDvcNumber() {
        return 7030409534l;
    }

    @Override
    public String getVcName() {
        return "kimkimvc";
    }

    @Override
    public long getPhoneNumber() {
        return 30943434l;
    }
    public void details(){
        System.out.println("vsname--");
    }
}
