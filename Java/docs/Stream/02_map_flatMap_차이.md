# flatMap 활용할 수 있는 상황

Stream의 형태가 배열과 같을 때, 모든 원소를 단일 원소 스트림으로 변환

## 1. 2차원 배열에 특정 조건만 출력

> 2차원 배열에서 문자열의 길이가 3보다 큰 문자열을 출력하는 코드

### 1-1. flatMap

```java
String[][] namesArray = new String[][]{
        {"abc", "park"}, {"young", "jun"},
        {"abc", "jun"}, {"young", "park"}};
        
Set<String> namesWithFlatMap = Arrays.stream(namesArray)
        .flatMap(innerArray -> Arrays.stream(innerArray))
        .filter(name -> name.length() > 3)
        .collect(Collectors.toSet());

namesWithFlatMap.forEach(System.out::println); // young park 출력
```

- flatMap의 결과로 단일 원소 스트림을 반환하기 때문에 filter 메서드를 바로 체이닝하여 사용 가능.
- 초기에 생성된 스트림이 배열인 경우에 매우 유용!

### 1-2. map

같은 결과를 출력하기 위한 map

```java
// 2차원 배열 선언 생략
Set<String> namesWithMap = Arrays.stream(namesArray)
        .map(innerArray -> Arrays.stream(innerArray)
        .filter(name -> name.length() > 3)
        .collect(Collectors.toSet()))
        .collect(HashSet::new, Set::addAll, Set::addAll);
```

조금 더 복잡해진다.

**Reference**
- https://madplay.github.io/post/difference-between-map-and-flatmap-methods-in-java