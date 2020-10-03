# 순열 복원 level 1 - selection

def reconstruct(S, L):
    A = S
    size = len(A)
    for i in range(size):
        check_val = (size - 1 - i) - L[i]
        if check_val > 0:
            A[i] = A[i] + check_val
    
    return A

# S와 L을 차례로 읽어들임

S = [int(x) for x in input().split()]
L = [int(x) for x in input().split()]

A = reconstruct(S, L)
print(A)
