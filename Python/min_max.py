# 최소 최대값 찾기

import math

def min_max2(A):
    m = math.ceil(len(A) / 2)

    if len(A) <= 1:
        return A[0], A[0]

    A_left_min, A_left_max = min_max2(A[:m])
    A_right_min, A_right_max = min_max2(A[m:])


    if A_left_min < A_right_min:
        if A_left_max < A_right_max:
            return A_left_min, A_right_max
        else:
            return A_left_min, A_left_max
    else:
        if A_left_max < A_right_max:
            return A_right_min, A_right_max
        else:
            return A_right_min, A_left_max


tempA = input().split()
A = []

for num in tempA:
    A.append(int(num))

m, M = min_max2(A)
print(m, M)