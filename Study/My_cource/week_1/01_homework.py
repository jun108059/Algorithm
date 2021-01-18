# 2021.01.01
# Q1. 소수 나열하기
# 정수를 입력 했을 때, 그 정수 이하의 소수를 모두 반환하세요!

input = 20


def find_prime_list_under_number(number):
    prime_list = []
    for n in range(2, number + 1):
        for i in range(2, n):
            if n % i == 0:
                break
        else:
            prime_list.append(n)

    return prime_list


result = find_prime_list_under_number(input)
print(result)