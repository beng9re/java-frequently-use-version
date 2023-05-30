package functionalInterfaceANDlamda;


public class Human {
    private String name;
    private final MyFunctional run;

    public Human(String name, MyFunctional run) {
        this.name = name;
        this.run = run;
    }

    public void run() {
        System.out.println(this.name + " is running");
        this.run.excute();
    }

}
