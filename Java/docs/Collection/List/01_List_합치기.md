# List 합치기

1. List.addAll()
2. Collections.addAll()
3. Stream.of() + flatMap() + collect()

## 1.List.addAll()
 
```java
boolean addAll (Collection<? extends E> c)
```

- java.util.List 인터페이스의 addAll() 메소드는 Collection 객체를 파라미터로 입력받아서 뒤에 추가

```java
List<String> list1 = new ArrayList<>(Arrays.asList("A", "B"));
List<String> list2 = new ArrayList<>(Arrays.asList("C", "D"));

List<String> mergedList = new ArrayList<>();

// list 합치기
mergedList.addAll(list1);
mergedList.addAll(list2);

// 결과 출력
System.out.println(mergedList); // [A, B, C, D]
```

결과
```shell
[A, B, C, D]
```

## 2. Collections.addAll()
```java
public static <T> boolean addAll(Collection<? super T> c, T... elements)
```

- Collections 클래스의 static 메소드
- Collection 객체와 n개의 파라미터 (배열 가능)
- 첫번째 파라미터 Collection 객체에 n개의 element 추가

> `List.addAll()` 보다 성능이 더 좋다.

```java
List<String> list1 = new ArrayList<>(Arrays.asList("A", "B"));
List<String> list2 = new ArrayList<>(Arrays.asList("C", "D"));

List<String> mergedList = new ArrayList<>();

// list 합치기
Collections.addAll(mergedList, list1.toArray(new String[0]));
Collections.addAll(mergedList, list2.toArray(new String[0]));

// 결과 출력
System.out.println(mergedList); // [A, B, C, D]
```

결과
```shell
[A, B, C, D]
```

## 3. Stream.of() + flatMap() + collect()

```java
        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B"));
        List<String> list2 = new ArrayList<>(Arrays.asList("C", "D"));
 
        // list 합치기
        List<String> mergedList = Stream.of(list1, list2)
                                        .flatMap(x -> x.stream())
                                        .collect(Collectors.toList());
 
        // 결과 출력
        System.out.println(mergedList); // [A, B, C, D]
```

결과
```shell
[A, B, C, D]
```

`Stream.of()`
- list1, list2의 stream 생성

`flatMap(x -> x.stream())`
- 각 list의 element를 단일 stream 처리
 
`collect(Collectors.toList())`
- Stream을 List로 변환


**Reference**
- https://hianna.tistory.com/560 [어제 오늘 내일]