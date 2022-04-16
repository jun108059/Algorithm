# String ↔ int 배열 변환

## 1. String → int 배열 변환

1. `Stream.mapToInt()` 함수 활용
2. `split` 함수 활용

```java
String str = "12345";
int[] digits = Stream.of(str.split(""))
        .mapToInt(Integer::parseInt)
        .toArray();
System.out.println(Arrays.toString(digits));
```

```java
String str = "12345";
int[] digits = new int[str.length()];
for (int i = 0; i < str.length(); i++)
    digits[i] = str.charAt(i) - '0';
System.out.println(Arrays.toString(digits));
```

## 2. int 배열 → String 변환

1. 배열 형태
2. String 형태 : `replaceAll()`

### 2-1. 배열 형태
```java
int[] arr = {1, 2, 3, 4};
String str = Arrays.toString(arr);
System.out.println(str);
```

결과
```shell
[1, 2, 3, 4]
```

### 2-2. String 형태 (공백 구분자)
```java
int[] arr = {1, 2, 3, 4};
String str = Arrays.toString(arr).replaceAll("[^0-9 ]","");
System.out.println(str);
```

결과
```shell
1 2 3 4
```

### 2-3. String 형태 (숫자만)

```java
int[] arr = {1, 2, 3, 4};
String str = Arrays.toString(arr).replaceAll("[^0-9]","");
System.out.println(str);
```

결과
```shell
1234
```

**Reference**

-[zetawiki : 자바 int 배열을 String으로 변환](https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_int_%EB%B0%B0%EC%97%B4%EC%9D%84_String%EC%9C%BC%EB%A1%9C_%EB%B3%80%ED%99%98)