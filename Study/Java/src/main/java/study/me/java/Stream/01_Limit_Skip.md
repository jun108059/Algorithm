# Stream으로 배열 자르기(Limit, Skip 주의사항)

## 1. Limit

> Limit은 어떤 스트림에서 일정 개수만큼만 가져와서 새로운 스트림을 Return

### 1-1. 사용 방법

`Stream.limit(숫자)`로, 숫자만큼 아이템을 취하고 스트림을 생성하여 Return

아래 코드에서 `stream1` 변수는 10개의 아이템을 갖고 있지만 `limit`을 이용하여 5개의 아이템이 있는 스트림을 생성한다.

```java
List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10" );

Stream<String> stream1 = list.stream();
Stream<String> stream2 = stream1.limit(5);

stream2.forEach(System.out::println);
```

결과
```shell
1
2
3
4
5
```

`limit`은 무한한 스트림에서 일정부분의 아이템을 얻을 때 유용하다.

아래코드에서 `Stream.generate(Math::random)`은 무한한 랜덤 숫자를 생성하는데, `limit`으로 5개의 아이템만 가져와서 스트림을 생성한다.

```java
Stream<Double> randoms = Stream.generate(Math::random).limit(5);
randoms.forEach(System.out::println);
```

결과

```shell
0.8844583284467448
0.31479976366108153
0.19877919671153288
0.7963431193552372
0.801045544374504
```


## 2. Skip

- `skip`은 `limit`과 반대
- `Stream.skip(숫자)`에서 숫자만큼 아이템을 건너뛰고 그 이후의 아이템들로 스트림을 생성

```java
List<String> list =
Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10" );
Stream<String> stream3 = list.stream();
Stream<String> stream4 = stream3.skip(5);
stream4.forEach(System.out::println);
```

결과
```shell
6
7
8
9
10
```

**Reference**

- https://codechacha.com/ko/java8-stream-limit-skip/
- https://ssamdu.tistory.com/17