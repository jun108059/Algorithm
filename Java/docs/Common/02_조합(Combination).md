# 조합(Combination)

> n 개의 숫자 중에서 r 개의 수를 순서 없이 뽑는 경우

예를 들어 [1, 2, 3] 배열에서 조합은 아래와 같다.

```shell
[1, 2]
[1, 3]
[2, 3]
```

현재 **인덱스를 선택하거나, 선택하지 않는 경우** 로 나눠서 완전탐색하면 됨. 

- (1, X) - 1을 뽑는 경우(하나의 원소를 선택할 경우)
- (X, X) - 1을 뽑지 않는 경우(하나의 원소를 선택하지 않는 경우)

위 예제에서 3C2를 만드는 과정을 설명하면,

- 1을 뽑은 경우 나머지 (2, 3) 중 1개를 선택 
  - 총 2개의 경우 (1, 2) (1, 3) -> 2C1
- 1을 뽑지 않은 경우 (2, 3) 모두 선택
  - 총 1개의 경우 (2, 3) -> 2C2

> 즉 (1, 2, 3)에서 2개를 뽑는 조합은 둘을 합해 (1, 2) (1, 3), (2, 3) 총 3가지

## 1. 조합 경우의 수 구하기

> nCr

순열과 달리 조합은 r 을 유지할 필요가 없으므로 숫자를 하나 뽑을때마다 r 을 하나씩 줄여준다.

> r == 0 일 때가 r 개의 숫자를 뽑은 경우

- 재귀를 통해 호출하다가 `r == 0`인 경우(r개를 다 뽑은 경우) 1을 리턴
- 전체 개수 n이 뽑아야 할 개수 r과 같아졌다면, 1을 리턴
- 나머지 경우는 `원소를 선택할 경우` + `선택하지 않을 경우` 둘의 합을 **계속 재귀 호출** 

```java
public class Combination {

	public static void main(String[] args) {
        // 3개 중에서 2개를 뽑는 조합의 경우의 수
		System.out.println(combination(3, 2)); 
	}
	
    // n = 전체 개수, r = 현재 뽑은 개수 
	public static int combination(int n, int r) {
		if(n == r || r == 0) 
			return 1; 
		else 
			return combination(n - 1, r - 1) + combination(n - 1, r); 
	}
}
```

## 2. 조합 구하기 (재귀)

> 실제 선택된 원소

|   변수   |              설명             |
| :------: |:-----------------------------:|
|    arr   |       조합을 뽑아낼 배열      |
|  visited | 조합에 뽑혔는지 체크하는 배열 |
|     n    |        전체 배열의 길이       |
|     r    |     조합의 길이(뽑을 개수)    |
|   depth  |     1씩 증가하는 탐색 깊이    |

depth == 현재 탐색 깊이 (0부터 시작)

1. [1, 2, 3] 배열 depth == 0
2. 만약 0 인덱스인 1을 뽑는다면 visited[depth] 는 `true` 가 되고 뽑지 않는다면 visited[depth] 는 `false`
3. 1을 선택한 경우와 선택하지 않은 경우 둘 다 호출
4. `depth`는 1증가
5. depth == n (전체 배열 길이) `return` : 완전 탐색
6. r == 0 (뽑을 개수) `return` : 모두 뽑았으니 재귀 종료

![image](https://user-images.githubusercontent.com/42997924/166256201-2598d72b-3a52-4ec6-bc52-c1b96237f4a9.png)
(출처 : https://minhamina.tistory.com/38)

```java
static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
    if(r == 0) {
        print(arr, visited, n);
        return;
    }
    if(depth == n) {
        return;
    } else {
        visited[depth] = true;
        comb(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        comb(arr, visited, depth + 1, n, r);
    }
}
```

## 3. 전체 코드

```java
public class Combination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; //조합을 만들 배열
        boolean[] visited = new boolean[arr.length];

        for (int r = 1; r <= arr.length; r++) {
            System.out.println("\n" + arr.length + "개 중에 " + r + "개 뽑음");
            comb(arr, visited, 0, r);
        }
    }

    // 재귀를 이용해 구현
    static void comb(int[] arr, boolean[] visited, int depth, int r) {
        if (r == 0) {
            print(arr, visited);
            return;
        }
        if (depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, r - 1);

            visited[depth] = false;
            comb(arr, visited, depth + 1, r);
        }
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited) {
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```

```shell
3개 중에 1개 뽑음
1
2
3

3개 중에 2개 뽑음
1 2
1 3
2 3

3개 중에 3개 뽑음
1 2 3 
```

**Reference**
- https://minhamina.tistory.com/38
- https://bcp0109.tistory.com/15