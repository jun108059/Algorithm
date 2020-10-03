
def reconstruct(B):
    # B = 0,0,0,3,2,5,5
    # A = 3,1,0,4,2,6,5

    size = len(B)
    A = []    # 빈 리스트 생성
    for i in range(size):
        A.append(0)    # append로 요소 추가
    # A = [0, 0, 0, 0, 0, 0]
    for i in range(size):
        A[i] = B[i]
        if i != 0 and B[i] == 0:
            # 작은 값이 없을 경우
            for j in range(i):
                A[j] = A[j] + 1
        elif B[i] == i:
            # 작은 값 밖에 없을 경우
            pass
        else:
            # 일부만 작은 경우
            for j in range(i):
                if A[j] >= B[i]:
                    A[j] = A[j] + 1

    return A

# S와 L을 차례로 읽어들임

B = [int(x) for x in input().split()]

A = reconstruct(B)

print(A)
