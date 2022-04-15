# String ↔ Char 배열 변환

## 1. 문자열 → char 배열

1. `toCharArray()` 함수 활용
2. `split()` 함수 활용

### 1-1. `toCharArray()` 함수 활용

```java
String str = "developer";
char[] chs = str.toCharArray();
System.out.println(java.util.Arrays.toString(chs));
```

결과
```shell
[d, e, v, e, l, o, p, e, r]
```

### 1-2. `split()` 함수 활용 (String 배열)

```java
String word = "developer";
String[] wordArr = word.split(""); // 배열에 한글자씩 저장하기
for (String s : wordArr) System.out.print(s + " ");
```

결과
```shell
d e v e l o p e r 
```

## 2. char 배열 → 문자열

1. new String();
2. String.valueOf();
3. String.copyValueOf();

```java
char[] arr = {'h', 'e', 'l', 'l', 'o'};
String str = new String(arr);
System.out.println(str); // hello

String str2 = String.valueOf(arr);
System.out.println(str2); // hello

String str3 = String.copyValueOf(arr);
System.out.println(str3); // hello
```

> 세 메소드 모두 같은 동작을 하고 성능에도 차이가 없다.  
> 자세한 논의 : https://stackoverflow.com/questions/48134493/java-valueof-vs-copyvalueof

**Reference**
- [zetawiki : 자바 char 배열을 String으로 변환](https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_char_%EB%B0%B0%EC%97%B4%EC%9D%84_String%EC%9C%BC%EB%A1%9C_%EB%B3%80%ED%99%98)