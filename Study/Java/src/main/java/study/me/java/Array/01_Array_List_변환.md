# 배열 ↔️ List 변환

## 1. 배열 ➡️ 리스트

> Arrays.asList()  
> Stream : Collectors.toList()  

### 1-1. Arrays.asList()

```java
String[] arr = { "A", "B", "C" };

// Shallow Copy
List<String> list = Arrays.asList(arr);

// Deep Copy (권장)
List<String> list = new ArrayList<>(Arrays.asList(arr));
```

`Deep Copy` : 기존 배열과 별개의 List를 생성하게 되어 추가/변경/삭제에 자유롭기 때문에 권장

### 1-2. Collectors.toList()

Deep Copy

```java
String[] strArr = {"2", "3", "1"};

List<String> collect = Arrays.stream(strArr)
        .collect(Collectors.toList());
```

## 2. 리스트 ➡️ 배열

### 2-1. toArray()

인자로 넘겨주는 배열 size는 자동으로 조절 됨 (크면 null 채워짐)

```java
List<String> list = new ArrayList<>();
list.add("1");
list.add("2");

String[] strArr = list.toArray(new String[0]);
```

## 3. 배열 ➡️ 리스트 (Primitive 타입) 

- For loop    
- Arrays.stream().boxed().collect() 

### 3-1. For loop

```java
int[] intArr = {3, 2, 1};

// int -> List
List<Integer> intList = new ArrayList<>();
for (int item : intArr) {
    intList.add(item);
}
```

### 3-2. Stream 활용

`Arrays.stream().boxed().collect()`

```java
int[] intArr = {3, 2, 1};

// int -> List
List<Integer> intList = Arrays.stream(arr)
                            .boxed()
                            .collect(Collectors.toList());
```

boxed() 메소드는 Primitive Stream 값을 Wrapper Class로 바꿔준다.

## 4. 리스트 ➡️ 배열 (Primitive 타입)

### 4-1.Stream().mapToInt()

```java
List<Integer> numlist = new ArrayList<>();
list.add(1);
list.add(2);

int[] numArray = numList.stream()
                    .mapToInt(i -> i)
                    .toArray();
```

- `mapToInt()` 메서드가 IntStream(int 값의 시퀀스)을 반환

