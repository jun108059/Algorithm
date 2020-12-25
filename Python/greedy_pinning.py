def pin(A):
    total_pin = 1
    A = sorted(A, key=lambda x: x[1])
    Start = []
    Final = []
    for item in A:
        Start.append(item[0])
        Final.append(item[1])
    
    temp_index = Final[0]

    for k in range(len(Final)-1):
        if temp_index < Start[k+1]:
            total_pin = total_pin + 1
            temp_index = Final[k+1]

    return total_pin


A = []
count = int(input())
for i in range(count):
    B = [int(x) for x in input().split()]
    A.append(B)

print(pin(A))


# 알고리즘 설명

# 입력부분
## line 20~24
### 리스트 A에 각 라인 별로 입력받은 구간 값을 리스트(B)로 append 하였습니다.
#### 수행시간 : 2n + c

# pin 함수
## line 3
### built-in 함수인 sorted()를 사용해 list 내부에서 
### 오른쪽 끝점을 기준으로 sorting 하였습니다.
#### 수행시간 : nlogn
## line 6~8
### sorting 된 A 리스트를 구간시작(Start), 구간끝(Final) 리스트로 나눴습니다.
#### 수행시간 : n + c
## line 12~15
### 현재 구간끝 리스트에 값보다 구간시작이 더 크면 새로운 핀을 추가하는 알고리즘입니다.
### 새로운 핀이 추가되면 구간끝을 해당 Index로 재 할당 후 다시 비교합니다.
#### 수행시간 : n + c

# 따라서 수행시간(O(n))은 최고차항인 nlogn 입니다.