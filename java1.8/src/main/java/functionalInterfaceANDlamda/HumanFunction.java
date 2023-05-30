package functionalInterfaceANDlamda;

public class HumanFunction implements MyFunctional{
    @Override
    public void excute() {
        System.out.println("사람의 달리는 행위");
    }
}
