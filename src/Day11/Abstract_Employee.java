package Day11;

public abstract class Abstract_Employee {
    private String name;
    private String ID;
    private double pay;

    Abstract_Employee(String name, String ID, double pay) {
        this.name = name;
        this.ID = ID;
        this.pay = pay;
    }

    public abstract void work();
}

class manage extends Abstract_Employee {
    private int bonus;

    manage(String name, String ID, double pay, int bonus) {
        super(name, ID, pay);
        this.bonus = bonus;
        System.out.println(name+" "+ID+" "+pay+" "+bonus );
    }

    public void work() {
        System.out.println("manage work");
    }

}
class Profession extends Abstract_Employee {
    Profession(String name, String ID, double pay) {
        super(name, ID, pay);
    }
    public void work(){
        System.out.println("profession work");
    }
}
