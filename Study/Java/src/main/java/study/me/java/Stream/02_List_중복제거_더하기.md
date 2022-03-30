# List 중복제거 하면서 합치기


이번에는 중복은 제거하면서, 2개의 List를 합치는 방법을 알아보겠습니다.

> LinkedHashSet 이용하기  
> List.removeAll() 이용하기

## 1. LinkedHashSet 이용하기

LinkedHashSet 클래스는 중복을 허용하지 않으면서, 데이터가 입력된 순서대로 데이터를 저장하여,

List를 LinkedHashSet으로 변환하거나, LinkedHashSet을 List로 변환할 때 순서를 보장할 수 있습니다.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MergeListWithoutDuplication {
public static void main(String[] args) {
    List<String> list1 = new ArrayList<>(Arrays.asList("A", "B"));
    List<String> list2 = new ArrayList<>(Arrays.asList("B", "C"));

    // list1을 LinkedHashSet으로 변환
    Set<String> set = new LinkedHashSet<>(list1);

    // LinkedHashSet 객체에 list2 병합
    set.addAll(list2);

    // LinkedHashSet 객체를 List로 변환
    List<String> mergedList = new ArrayList<>(set);

    // 결과 출력
    System.out.println(mergedList);  // [A, B, C]
}
}

```

결과

[A, B, C]

2. List.removeAll() 이용하기
   boolean removeAll(Collection<?> c)
   List의 removeAll() 메소드는

파라미터로 전달된 Collection 객체가 가지고 있는 값이 list에 있으면

이 값들을 모두 list에서 제거합니다.


### Reference

--- 

- https://hianna.tistory.com/561 [어제 오늘 내일]