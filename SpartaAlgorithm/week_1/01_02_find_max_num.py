# 2020.12.24(목)
# 최대값 찾기

input_array = [3, 5, 6, 1, 2, 4]


# 3.배열에 저장해서 찾기
# 가장 큰 수를 변수에 저장해서 배열을 비교 후 대입
def find_max_num(array):
    max_num = array[0]
    for num in array:
        if num > max_num:
            max_num = num
    return max_num


result = find_max_num(input_array)
print(result)
