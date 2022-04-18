# HashMap

Map 인터페이스를 구현한(상속한) 대표적인 Map 컬렉션

## 1. Map의 특성

- Key-Value 구성된 Entry객체를 저장하는 자료구조 
- 여기서 Key와 Value는 모두 객체
  - Value(값) = 중복 저장 가능
  - Key(키) = 중복 저장 불가능
- 만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 업데이트 

## 2. HashMap

- 해싱(Hashing)을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 성능이 뛰어남!

![image](https://user-images.githubusercontent.com/42997924/164271104-dc94d86f-238e-448a-9b68-7700e75e81f9.png)

⬆️ 출처 : https://coding-factory.tistory.com/556

### 2-1. HashMap 초기화

```java
HashMap<String,String> map1 = new HashMap<>(); // new 타입 파라미터 생략 가능
HashMap<String,String> map2 = new HashMap<>(map1); // map1의 모든 값을 가진 HashMap 생성
HashMap<String,String> map3 = new HashMap<>(10); // 초기 용량(capacity)지정
HashMap<String,String> map4 = new HashMap<>(10, 0.7f); // 초기 capacity, load factor 지정
HashMap<String,String> map5 = new HashMap<String,String>(){{ // 초기값 지정
    put("a","b");
}};
```

- HashMap은 저장공간보다 값이 추가로 들어오면 List 처럼 저장공간을 추가로 늘리는데 List 처럼 저장공간을 한 칸씩 늘리지 않고 약 두배로 증가
- 여기서 과부하가 많이 발생함!
- 따라서 초기에 저장할 데이터 개수를 알고 있다면 Map의 초기 용량을 지정해주는 것이 좋음

### 2-2. HashMap CRUD

#### 2-2-1. 추가 & 업데이트

```java
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "새우"); // 값 추가
map.put(2, "만두");
map.put(3, "라면");
        
map.put(1, "카레"); // 1번 데이터 업데이트
```

#### 2-2-2. 삭제

```java
map.remove(3); // key == 3 데이터 삭제
map.clear(); // 모든 데이터 삭제
```

- 오직 키 값으로만 Map의 데이터를 삭제할 수 있다.

#### 2-2-3. 출력

1. get(index) 메소드 (key mapping value)
2. entrySet() 메소드
3. keySet() 메소드

```java
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "만두");
map.put(2, "라면");

// 전체 출력
System.out.println(map); // {1=만두, 2=라면}
        
// get() 메소드
System.out.println(map.get(1)); // 만두

// entrySet() 활용
for (Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
}

//KeySet() 활용
for(Integer i : map.keySet()){ //저장된 key 값 확인
    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
}

// [Key]:1 [Value]:만두
// [Key]:2 [Value]:라면
```

- **key-value 모두 필요한 상황에 대량 데이터를 가져온다면 keySet() 보다 entrySet() 성능이 더 좋다.**

#### 2-2-4. Iterator 활용

전체 데이터 접근 시 Iterator를 활용할 수 있다.

```java
// entrySet().iterator()
Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
while (entries.hasNext()) {
    Map.Entry<Integer, String> entry = entries.next();
    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
}
		
// keySet().iterator()
Iterator<Integer> keys = map.keySet().iterator();
while (keys.hasNext()) {
    int key = keys.next();
    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
}

//[Key]:1 [Value]:만두
//[Key]:2 [Value]:라면
```

**Reference**

- https://coding-factory.tistory.com/556