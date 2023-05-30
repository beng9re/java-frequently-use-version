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
### 1.3. Stream
컬랙션에 대한 Stream API는 데이터 핸들링을 위한 표준화된 방법을 제공한다.
그리고 병렬처리를 위한 기능도 제공한다.
함수 프로그래밍 언어의 영향을 받아 설계되었다라고 한다.

###  1.3.1 예제 
Map, filter, sorted, collect, forEach, reduce 등의 메서드를 제공한다.
그리고 종결연산자가 발생되면 새로운 컬랙션이 발생된다. 

* filter 데이터들을 특정 조건에 따라 필터링한다.
  * 사용법
```java
    <Collection>.stream().filter(조건 람다식)
```
  * 테스트
```java 
        
   //given
    final List<String> initData = List.of("a", "b", "c", "d", "e");
    
    //when
    List<String> filterData = initData.stream()
            .filter((data) -> data.equals("a"))
            .collect(Collectors.toList());
    
    //then
    assertAll(
            () -> assertThat(filterData).hasSize(1),
            () -> assertThat(filterData).contains("a"),
            () -> assertThat(filterData).doesNotContain("b")
    );
```



### 1.4. Java 8 Optional
### 1.5. Java 8 Collectors
#### 1.6.1. Java 8 Collectors Example
```java
List<String> list = Arrays.asList("A", "B", "C", "D");
String result = list.stream().collect(Collectors.joining(","));
System.out.println(result);
```
### 1.8. Java 8 StringJoiner
### 1.9. Java 8 Date Time API
### 1.10. Java 8 Base64
### 1.11. Java 8 Parallel Arrays
### 1.12. Java 8 CompletableFuture
### 1.13. Java 8 Nashorn JavaScript

