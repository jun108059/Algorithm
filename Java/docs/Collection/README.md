# Collection 정리

![image](https://user-images.githubusercontent.com/42997924/164982626-9d96aa3c-65fd-4c7f-9d7a-3e0fd8b30eca.png)
(⬆️ 출처 : https://ko.myservername.com/30-top-java-collections-interview-questions-with-answers)

<img width="967" alt="image" src="https://user-images.githubusercontent.com/42997924/166258140-e6878b16-be2f-410f-a6c5-e4c5e4ea635a.png">
(⬆️ 출처 : https://www.bigocheatsheet.com/)

> 성능은 Big-O 노테이션을 보편적으로 이야기한다.

## 1. Set

- 중복을 허용하지 않는다.
- 하위 인터페이스로 SortedSet이 있으며, 오름차순을 갖는 Set 인터페이스이다.
- 구현체로 HashSet, TreeSet, LinkedHashSet 세 가지가 있다.

### 1-1. HashSet

- 해쉬 테이블에 저장
- 순서가 없다.

### 1-2. TreeSet

- red-black 트리에 저장
- 데이터를 담으면서 정렬하기 때문에 HashSet보다 느리다.
- 순서에 따라 탐색하는 작업이 필요한 경우 사용하기 적합하다.
  - 구현한 인터페이스 중에 NavigableSet이 있는데 특정 값에 대해 큰지 작은지 추출하는 메서드가 있다.

#### (참고) red-black 트리?

- 이진 트리 구조를 가진다.
- 각 노드는 검은색이나 붉은색이어야 한다.
- 가장 상위(root) 노드와 가장 말단(leaves) 노드는 검은색
- 검은 노드는 붉은 노드만 가진다.
- 모든 말단 노드로 이동하는 경로의 검은 노드 개수는 동일하다.

### 1-3. LinkedHashSet

- 해쉬 테이블에 저장
- 저장된 순서로 저장

### 1-4. Set 성능 비교하기

- 데이터 추가 : HashSet > LinkedHashSet > TreeSet
  - HashSet과 LinkedHashSet은 성능이 비슷했다.
  - 데이터의 크기를 미리 지정하면 성능상 유리한데, 큰 차이는 없다.
- 데이터 읽기 : LinkedHashSet > Hasset > TreeSet

<img width="670" alt="image" src="https://user-images.githubusercontent.com/42997924/166262681-c86ab8e0-c4a5-4fa4-b95b-5e2ade7c1356.png">

<img width="754" alt="image" src="https://user-images.githubusercontent.com/42997924/166268023-60107276-ffd3-4c27-9d2b-90477502155a.png">

## 2. List

- 인덱스로 접근 가능하다.
- 중복 허용이 가능하다.
- 가장 많이 사용하는 것은 ArrayList
- 배열의 확장판으로, 배열은 크기가 정해져있다. 그러나 List는 크기가 자동으로 증가된다. 확실한 데이터 개수를 모르는 경우 사용하기 적합하다.
- 구현체로 ArrayList, LinkedList 두 가지와 초기 버전의 Vector가 있다.

### 2-1. Vector

- Collections가 포함되어 있지 않던 초기 버전 레거시 클래스(?)
- 객체 생성시 크기를 지정할 필요가 없다.
- 동기화 되어 있다. 하나의 스레드에서 사용하는 경우 적합하다.
- 최대 인덱스가 초과할 경우 Vector는 현재 크기의 100% 증가한다.

### 2-2. ArrayList

- Vector와 비슷하지만, 동기화 처리가 되어 있지 않다.
- Vector보다 빠르다.
- 멀티스레드 환경이 아닌 경우 사용하기 적합하다.
- 최대 인덱스가 초과할 경우 ArrayList는 현재 크기의 50% 증가한다.
- 삽입 삭제가 많은 경우 LinkedList가 사용하기 적합하다.

### 2-3. LinkedList

- 각 노드가 한 줄로 연결되어 있다. (앞 노드와 뒤 노드가 연결되어 있는 형태)
- Queue 인터페이스를 구현했기 때문에 FIFO 큐 작업을 수행한다.
- 삽입 삭제가 많은 경우 사용하기 적합하다.
- 조회하는 상황이 많으면 ArrayList가 사용하기 적합하다.
  - get()보다 순차적으로 결과를 받아오는 peek() 메서드를 사용하면 매우 빨라진다.

### 2-4. List 성능 비교하기

- 데이터 추가 : ArrayList > Vector > LinkedList
  - 어떤 클래스든 큰 차이는 없다.
- 데이터 읽기 : ArrayList > Vector > LinkedList
  - ArrayList가 압도적으로 빠르고, Vector와 LinkedList는 매우 느리다.
  - LinkedList는 순차적으로 결과를 받아오는 peek() 메서드를 사용하면 ArrayList보다 빠르다.
  - Vector는 synchronized가 선언되어 있어 성능 저하가 발생할 수 밖에 없다.
- 데이터 삭제
  - ArrayList와 Vector는 첫 번째 데이터와 마지막 데이터를 삭제할 때 속도 차이가 매우 많이 난다. 이유는 앞쪽으로 이동해야 하기 때문이다.
  - 마지막 데이터를 삭제할 때, ArrayList가 가장 빠르다.
  - LinkedList는 삭제 시 매우 빠른 것이 아니라, 가장 앞쪽 데이터와 마지막 데이터를 삭제할 때, 속도 차이가 거의 없다. 노드가 이어져있기 때문이다.

<img width="670" alt="image" src="https://user-images.githubusercontent.com/42997924/166259609-88599683-555e-47f6-8999-0096a67da0bc.png">

> 데이터 조회가 자주 이루어질 때 `ArrayList`를 사용하는 것이 유리하다.
> 데이터의 삽입, 삭제가 빈번히 일어날 때 `LinkedList`를 사용하는 것이 유리하다.

## 3. Queue

- FIFO를 따른다.
- 먼저 들어온 것이 먼저 나간다.
- 구현체로 LinkedList, PriorityQueue 두 가지가 있다.
- java.util.concurrent 패키지에 속하는 클래스는 LinkedBlockingQueue, ArrayBlockingQueue, PriorityBlockingQueue, DelayQueue, SynchronousQueue 다섯 가지가 있다.

### 3-1. PriorityQueue

- 우선 순위를 결정할 수 있는 큐이다.

### 3-2. LinkedBlockingQueue

- 저장할 데이터의 크기를 선택적으로 정할 수 있다.
- FIFO 기반으로 링크 노드를 사용하는 Blocking Queue

> Blocking Queue?
> 크기가 지정되어 있는데 더이상 공간이 없으면, 공간이 생길 때 까지 대기하는 큐이다.

### 3-3. ArrayBlockingQueue

- 저장되는 데이터가 크기가 정해져 있다.
- FIFO 기반의 Blocking Queue

### 3-4. PriorityBlockingQueue

- 저장되는 데이터의 크기가 정해져 있지 않다.
- 우선 순위를 결정할 수 있는 Blocking Queue

### 3-5. DelayQueue

- 큐가 대기하는 시간을 지정할 수 있다.

### 3-6. SynchronousQueue

- put() 메서드는 다른 스레드에서 take() 메서드가 호출될 때까지 대기한다.
- 저장되는 데이터가 없다.

## 4. Map

- 키와 값의 쌍으로 구성되어 있고, 키는 중복을 허용하지 않는다.
- 하위 인터페이스는 SortedMap이 있으며, 키를 오름차순으로 정렬하는 Map 인터페이스이다.
- 구현체는 HashMap, TreeMap, LinkedHashMap 세 가지와 초기 버전의 Hashtable이 있다.

### 4-1. Hashtable

- 데이터를 해쉬 테이블에 담는 클래스이다.
- 내부에서 관리하는 해쉬 테이블 객체가 동기화되어 있다. 따라서 동기화가 필요한 경우 사용하기 적합하다.
- null을 허용하지 않는다.

### 4-2. HashMap

- 데이터를 해쉬 테이블에 담는 클래스이다.
- Hashtable과 달리 null 값을 허용하며, 동기화되어 있지 않다.
- 동기화가 필요하지 않은 경우 Hashtable보다 HashMap이 사용하기 적합하다.

### 4-3. TreeMap

- red-black 트리에 데이터를 담는다.
- TreeSet과 달리 키에 의해 순서가 정해진다.

### 4-4. LinkedHashMap

- HashMap과 거의 동일하다.
- 이중 연결 리스트라는 방식을 이용하여 데이터를 담는다.
- 키의 순서가 지켜지므로, 키의 순서가 보장되어야 할 경우 사용하기 적합하다.

### 4-5. 성능 비교하기

- 데이터 읽기 : HashMap > LinkedHashMap > Hashtable > TreeMap
  - HashMap과 LinkedHashMap은 거의 비슷하다. 그러나 TreeMap은 매우 느리다.

<img width="756" alt="image" src="https://user-images.githubusercontent.com/42997924/166270324-5e8dabcb-9778-4229-a2d1-1176ca28ad7b.png">

<img width="945" alt="image" src="https://user-images.githubusercontent.com/42997924/166275351-0240a17e-7296-4e4f-927a-33412b7b7206.png">

**Reference**

- https://www.hyojae.info/0d0244c8-19e8-4730-8f06-0dc9f9594362
- https://hobby-collect.tistory.com/119
