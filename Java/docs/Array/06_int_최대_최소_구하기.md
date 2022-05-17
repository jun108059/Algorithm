# int 배열의 최대값 최소값 구하기

## 1. For문을 활용한 방법

```java
// 최대값 최소값을 구할 int배열
int array[] = {4, 3, 2, 1, 10, 8, 7, 6, 9, 5};

int max = array[0]; // 최대값
int min = array[0]; // 최소값

for (int i = 0; i < array.length; i++) {
    if (max < array[i]) {
        // max의 값보다 array[i]이 크면 max = array[i]
        max = array[i];
    }

    if (min > array[i]) {
        // min의 값보다 array[i]이 작으면 min = array[i]
        min = array[i];
    }
}

System.out.println("최대값 : " + max);
System.out.println("최소값 : " + min);
```

### 결과

```shell
최대값 : 10
최소값 : 1
```

## 2. Arrays 클래스의 sort(정렬)을 활용한 방법

```java
int array[] = {4, 3, 2, 1, 10, 8, 7, 6, 9, 5};
int max = array[0]; // 최대값
int min = array[0]; // 최소값

Arrays.sort(array); // 배열 정렬
        
// 최대값(Max) 출력
System.out.println("최대값 : " + array[array.length - 1]);

// 최소값(Min) 출력
System.out.println("최소값 : " + array[0]);
```

### 결과

```shell
최대값 : 10
최소값 : 1
```

## 3. Stream 활용
```java
// Arrays.stream(배열명) 으로 배열 생성
System.out.println("최대값 : " + Arrays.stream(arr).max().getAsInt());
System.out.println("최소값 : " + Arrays.stream(arr).min().getAsInt());
```


**Reference**
- https://coding-factory.tistory.com/254
- https://wakestand.tistory.com/423