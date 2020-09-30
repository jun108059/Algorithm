# Python 알고리즘

## [재귀] Palindrome

[👉코드 보기](palindrome.py)

<details><summary>🔻설명 보기</summary>

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

