# Java 8 
## 1. Java 8 기능
### 1.1. Java 8 함수형 인터페이스
메서드 하나만 정의된 인터페이스를 함수형 인터페이스라고 선언한다.
해당 함수형 인터페이스는 람다식으로 표현할 수 있다.
```java 
@FunctionalInterface
public interface MyFunctional {
    void excute();
}
```

### 1.2. 람다 표현식 (Lambda Expressions)
```java
MyFunctional function = () -> System.out.println("Hello World");
function.execute();
```

#### 1.2.1 람다표현식은 메서드 표현식으로 대응할 수 있음
```java

// 같다 
Human human = new Human("첫번째 사람", () -> System.out.println("사람의 달리는 행위"));
human.run();
// 같다 
Human human2 = new Human("두번째 사람", HumanFunction::new);

```

