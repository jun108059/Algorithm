# Python 알고리즘

## 1.[재귀] Palindrome

[👉코드 보기](palindrome.py)

<details><summary>🔻설명 보기</summary>

### 문제 설명

- 좌우가 대칭인 문자열을 palindrome이라 한다 (예: radar, 1122, madam, a, 빈 문자열 등)
  - 문자열을 구성하는 문자는 영어 대문자와 소문자이며, 대문자와 소문자는 구별하지 않는다. (예: Radars palindrome)
  - 문자열이 여러 단어로 구성된 하나의 문장일 수도 있다. (예: I am AI 라면 공백을 모두 제거한 IamAI 문자열이 palindrome인지 아닌지를 검사해야 한다.)

---

- 길이가 `k`인 문자열 `s`에 대해, `s[0] == s[k-1]` 이어야 하고, `s[1]...s[k-2]` 까지가 다시 palindrome이면 `s`가 palindrome이 된다. 즉, 재귀적인 방법으로 문자열이
palindrome인지 검사할 수 있다.

- 재귀 함수 **palindrome(s, left, right)** 를 작성한다 (문자열 `s`의 `s[left]...s[right]` 이 palindrome이면 `True`, 아니면 `False` 리턴)
  - [주의1] 반드시 재귀함수로 작성해야 함
  - [주의2] 입력 문자열의 길이는 0 이상임. (그래서 빈 문자열도 입력 가능함. 빈 문자열은 palindrome임.)

### 입출력 예시

입력 1

```shell script
radar
```

출력 1

```shell script
True
```

입력 2

```shell script
salsa
```

출력 2

```shell script
False
```

입력 3

```shell script
Rats live on no evil star
```

출력 3

```shell script
True
```

</details>

## 2.O(n) vs O(n2) 비교

[👉코드 보기](on_vs_on2.py)

<details><summary>🔻설명 보기</summary>

### 문제 설명

다항식 계산으로 O(n) 시간 비교

- `f(x) = a0x^0 + a1x^1 + ... + a(n-1)n^(x-1) • 
- 위의 식은 전형적인 `n-1` 차 다항식이다
- 다항식의 `n`개의 계수(coefficient)가 리스트 `A`에 저장되어 있다고 하자
- **evaluate_n2(A, x)**:
  - `f(x)`를 계산하고 그 값을 리턴하는 데, `O(n^2)` 시간의 계산이 필요한 함수
- **evaluate_n(A, x)** :
  - `f(x)`를 계산하고 그 값을 리턴하는 데, `O(n)` 시간의 계산이 필요한 함수

### 실행시간 측정하기

1. import time
2. time.clock() 함수는 현재 clock 시간을 알려준다.
3. 함수 `f(x)`의 시간을 측정하고 싶다면 다음과 같이 한다.

```python
import time
before = time.clock()   # 현재 시간을 얻는다.
f(x)                    # 함수 f를 호출한다.
after = time.clock()    # 현재 시간을 얻는다.
print(after - before)   # 함수 호출 전과 후의 시간 차이 (= 함수 수행시간)
```

다항식 계산을 위한 두 가지 버전 시간 측정해 보기

1. 입력 크기 `n` 을 `input` 받은 후, `n-1` 차 다항식의 `n`개의 **계수**를 랜덤 생성하여 리스트 `A`에 저장함.
   - `random` 모듈을 `import`한 후, `randint(-999, 999)`을 호출하여 랜덤 정수를 `n`개 생성하면 됨
2. x 값을 `randint(-99, 99)`을 호출하여 생성함
3. 두 함수 `evaluate_n2(A, x)`과 `evaluate_n(A, x)` 을 작성하여 각각 호출함
4. 위의 실행시간 측정 방법을 이용하여 두 함수의 실행시간을 각각 측정하여 출력함

</details>

## 3.[재귀] 최소 최대값 찾기

[👉코드 보기](min_max.py)

<details><summary>🔻설명 보기</summary>

### 문제 설명

입력으로 주어진 n개의 정수를 읽어 최소값과 최대값을 출력하는 `min_max2` 함수를 작성

- `min_max2(A)` : `A`의 값 중에서 최소값과 최대값을 찾아 Return(재귀 호출 활용)
- `A`를 2등분 - 최소 최대를 다시 계산하는 방식
- [제약 사항] 재귀함수 호출 시 리스트의 **slicing 활용**
- [제약 사항] python에서 제공하는 `max`, `min` 함수 사용 안 됨

입력 1

```shell script
3 9
```

출력 1

```shell script
3 9
```

입력 2

```shell script
5 9 10 2 4 5 12 8 -6 -2 1
```

출력 2

```shell script
-6 12
```

</details>

## 4.순열 복원 Two List

[👉코드 보기](reconstruct.py)

<details><summary>🔻설명 보기</summary>

### 문제 설명

- 0부터 n-1까지 서로 다른 수로 구성된 순열(permutation) `A`, 리스트 `S`와 `L`은 다음과 같다.
- `S[i]` = `A[0]` ~ `A[i]` 중 A[i]보다 작은 수의 개수
  - S[0] = 0
- `L[i]` = `A[i+1]` ~ `A[n-1]`까지 수 중에서 A[i]보다 큰 수의 개수
  - L[n-1] = 0
  
실수로 리스트 A를 잃어버려서 `S`와 `L`만가지고 있다고 하고 `A`를 **재구성**하면 된다.

### 입력

- 첫 줄에 리스트 `S`의 값 n개
- 두번째 줄에 리스트 `L`의 값 n개

### 출력

- `print(A)`


입력 1

```shell script
0 1 2 3 4
4 3 2 1 0
```

출력 1

```shell script
[0, 1, 2, 3, 4]
```

입력 2

```shell script
0 0 0 0 0
0 0 0 0 0
```

출력 2

```shell script
[4, 3, 2, 1, 0]
```

입력 3

```shell script
0 1 1 3 3
4 2 2 0 0
```

출력 3

```shell script
[0, 2, 1, 4, 3]
```

</details>


## 5.순열 복원 One List

[👉코드 보기](reconstruct2.py)

<details><summary>🔻설명 보기</summary>

### 문제 설명

- 0부터 n-1까지 서로 다른 수로 구성된 순열(permutation) `A`, 리스트 `B`는 다음과 같다.
- `B[i]` = `A[0]` ~ `A[i-1]` 중 A[i]보다 작은 수의 개수
  - B[0] = 0
  
실수로 리스트 A를 잃어버려서 `B`만 가지고 있다고 하고 `A`를 **재구성**하면 된다.

### 입력

- 첫 줄에 리스트 `B`의 값 n개(n은 1이상 1000이하)

### 출력

- `print(A)`


입력 1

```shell script
0 1 2 3 4
```

출력 1

```shell script
[0, 1, 2, 3, 4]
```

입력 2

```shell script
0 0 0 0 0
```

출력 2

```shell script
[4, 3, 2, 1, 0]
```

입력 3

```shell script
0 0 0 3 2 5 5
```

출력 3

```shell script
[3, 1, 0, 4, 2, 6, 5]
```

</details>


## 6. 깜빡한 두 수 찾기

[👉코드 보기](two_missing_num.py)