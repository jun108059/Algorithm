# 2020.12.24(목)
# 최대값 찾기

input_array = [3, 5, 6, 1, 2, 4]


# 1.내가 짠 코드
def find_max_num(array):
    max_value = max(array)
    return max_value


# 2.비효율적인 코드
# 각 숫자마다 모든 다른 숫자와 비교해서 최대값 찾기
def find_max_num2(array):
    for num in array:
        for compare_num in array:
            if num < compare_num:
                break
            else:
                return num


result = find_max_num(input_array)
print(result)
