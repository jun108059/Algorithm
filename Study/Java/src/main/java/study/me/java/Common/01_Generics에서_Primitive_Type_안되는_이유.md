# Java Generics는 Primitive Type을 왜 사용할 수 없을까

List<>와 같은 자료형을 사용할 때 우리는 Generic을 받는데, 이 때 Primitive Type은 사용할 수 없다.

예를 들면, 아래와 같은 경우는 잘 동작한다.

```java
List<Integer> foo = new ArrayList<Integer>();
```

하지만 아래 케이스는 안된다.

```java
List<int> bar = new ArrayList<int>();
```

## 왜 때문일까

왜냐하면, Java의 Generic은 컴파일 타임에 Type을 캐스팅하는데, 이는 JVM 런타임과 호환성을 유지하기 위해서이다.

우리가 코드를 아래와 같이 작성하면,

```java
public class Container<T> {

    private T data;

    public T getData() {
        return data;
    }
}
```

컴파일 시 아래와 같이 변할 것이다.

```java
public class Container {

    private Object data;

    public Object getData() {
        return data;
    }
}
```

이를 `Type erasure` 라고 하며, 호환성을 위한 전략이다.

마찬가지로 한가지 예를 더 살펴보자.

```java
Container<Integer> val = new Container<Integer>();
Integer data = val.getData()
```

컴파일 시 아래와 같이 변경된다.

```java
Container val = new Container();
Integer data = (Integer) val.getData()
```

따라서 Generic으로 받는 타입은 `Object`로 변환이 가능해야 한데, Primitive Type은 `Object`를 상속받지 않으므로 사용할 수 없는 것이다.