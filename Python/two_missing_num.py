# Two missing numbers
# 2020.10.05 (월)
# 1 ~ n 까지의 수를 모두 더하기
# 실수로 두 수를 빼고 더했따. = S
# 각 수의 제곱을 더하다가 다시 두 수의 제곱을 빼고 더했따. = T
import math

def guess_two_missing_numbers(n, S, T):
    a, b = 0, 0
    origin_sum = int((n*(n+1))/2)
    sub1 = origin_sum - S

    origin_sqr_sum = 0
    for i in range(1, n+1):
        origin_sqr_sum += i*i

    sub2 = origin_sqr_sum - T
    for i in range(1, n+1):
        if sub2 < i*i:
            continue
        else:
            temp = sub2 - i*i
            sub2_b = int(math.sqrt(temp))
            if i + sub2_b == sub1:
                a = i
                b = sub2_b
                break
    return a, b


n = int(input())
S, T = [int(x) for x in input().split()]
a, b = guess_two_missing_numbers(n, S, T)

print(a, b)