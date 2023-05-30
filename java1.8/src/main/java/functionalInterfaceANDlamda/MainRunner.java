package functionalInterfaceANDlamda;


import java.util.ArrayList;

public class MainRunner {

    public static void main(String[] args) {
        Human human = new Human("첫번째 사람", () -> System.out.println("사람의 달리는 행위"));
        human.run();

        Human human2 = new Human("두번째 사람", HumanFunction::new);
        human2.run();
    }
}
