init_val = 0

def print_IS(seq, x):
    for i in range(len(seq)):
        if x[i]:
            print(seq[i], end="")
        else:
            print("_", end="")
    print()


def LIS_backtrack(seq, x, k):
    m = init_val
    global lis  # LIS의 길이를 나타내는 전역변수
    global temp_lis

    if k >= len(seq): return

    # 값이 하나도 저장되지 않았을 경우
    if sum(x) == 0:
        temp_lis += 1
        x[k] = 1
        LIS_backtrack(seq, x, k + 1)
        temp_lis -= 1
    else:
        for index in range(k, -1, -1):
            if x[index] == 1:
                m = index
                break
    if seq[m] < seq[k]:
        temp_lis += 1  # lis ++
        x[k] = 1
        lis = max(lis, temp_lis)
        LIS_backtrack(seq, x, k + 1)
        temp_lis -= 1

    # x[k] == 0
    x[k] = 0
    LIS_backtrack(seq, x, k+1)


seq = input()  # 알파벳 소문자로만 구성된 string 하나가 입력된다
lis = 0
temp_lis = 0
x = [0] * len(seq)
LIS_backtrack(seq, x, 0)
print(lis)