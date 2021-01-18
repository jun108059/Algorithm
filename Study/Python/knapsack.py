# knapsack 구하는 함수                
# @param x[i] = 1인 경우 / 0인 경우 각각 시도
# @param K = 현재 가방 남은 자리
def knapsack (i, K):
    global MaxProfit
    global profit
    global size
    global n
    global x

    # 바닥조건 (물건이 없는 경우, 가방 남은 자리 x)
    if i >= n or K <= 0:
        print(x)
        return
    p = 0 # p 현재 상태 가치의 합
    s = 0 # s 현재 상태 크기의 합
    for j in range(1, i-1):
        if x[j] == 1:
            p = p + profit[j]
            s = s + size[j]
    
    # x[i] = 1인 경우로 시도
    # i+1 이후 아이템에 대해, 남은 배낭공간(T-size[i])에 fractional로 채울 수 있는 최대 가치 계산

    # 계속 탐색해야 한다면
    if size[i] <= K:
        # 물건 i가 무게 제한을 넘지 않아야 함
        B = fractional_knapsack(n-(i+1), size[i+1:], profit[i+1:], K-size[i])
        if MaxProfit < p + profit[i] + B:
            x[i] = 1
            MaxProfit = max(MaxProfit, p + profit[i])
            knapsack(i+1, K-S[i])
    # x[i] = 0인 경우 시도
    B = fractional_knapsack(n-(i+1), size[i+1:], profit[i+1:], K)
    if MaxProfit < p + profit[i]:
        x[i] = 0
        solution = x
        MaxProfit = p + profit[i]
        knapsack(i+1, K)


def fractional_knapsack(n, size, profit, K):
	# n개의 아이템, 크기 size[], 가치 profit[], 배낭의 현재 빈 공간 K
	if K <= 0: return 0
	# 가치의 내림차순으로 (size[i], profit[i])를 정렬되어 있다고 가정(아니면, 정렬함)
    # Todo 정렬 필요한지 Test
	s = 0 # 현재까지 선택한 아이템의 크기 합
	p = 0 # 현재까지 선택한 아이템의 가치 합
	for i in range(n):
        if s + size[i] <= K: # 배낭에 쏙 들어가면 전체 선택
            p += profit[i]
            s += size[i]
        else: # 넘치면 잘라서 선택
            p += (K-s) * (p[i]/s[i])
            s = K
            break
	return p

# K = 가방 크기 
# n = 물건 개수 (300 이하)
# size[] = 물건 크기
# profit[] = 물건 가치

K = int(input())
n = int(input())
size = []
profit = []

B = [int(x) for x in input().split()]
size.append(B)
C = [int(x) for x in input().split()]
profit.append(B)

x = [0] * len(profit) # 아이템 선택되면 1
MaxProfit = 0 # 현재까지 가장 큰 가치 값 [전역변수]
solution = [] # 정답 [전역변수]

knapsack(0, K)

# 출력 : MaxProfit 정수 출력