# List 중복제거 + 합치기

1. LinkedHashSet 이용하기
2. List.removeAll() 이용하기

## 1. LinkedHashSet 활용

**LinkedHashSet 특징**

- 중복을 허용하지 않음
- 데이터가 입력된 순서대로 데이터를 저장
- List ↔ LinkedHashSet 변환 시 순서 보장

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
 
        System.out.println(mergedList);  // [A, B, C]
    }
}
```

결과
```shell
[A, B, C]
```


## 2. List.removeAll() 활용

`boolean removeAll(Collection<?> c)`

- 파라미터로 전달된 Collection 객체가 가지고 있는 값이 list에 있으면 이 값들을 모두 list에서 제거

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeListWithoutDuplication {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B"));
        List<String> list2 = new ArrayList<>(Arrays.asList("B", "C"));
 
        // list1으로 새로운 mergedList 생성
        List<String> mergedList = new ArrayList<>(list1); // [A, B]
 
        // mergedList에서 list2와 중복되는 항목 제거
        mergedList.removeAll(list2); // [A]
 
        // mergedList와 list2 합치기
        mergedList.addAll(list2); // [A, B, C]
 
        // 결과 출력
        System.out.println(mergedList);  // [A, B, C]
    }
}
```

결과
```shell
[A, B, C]
```

**Reference**
- https://hianna.tistory.com/561 [어제 오늘 내일]

