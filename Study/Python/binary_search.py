
def binary_search(A, i, j, x):
    # A[i], ..., A[j]에 x가 있다면 해당 인덱스, 없다면 -1 리턴
    
    if i > j: return -1
    m = (i+j)//2
    if x == A[m]: # x를 찾았다!
        return m
    elif x < A[m]: 
        # x가 오른쪽 반에는 없으니
        # 왼쪽 반 범위에서 탐색 계속함 (재귀호출!)
        return binary_search(A, i, m-1, x)
    else:
        # x가 왼쪽 반에는 없고, 오른쪽 반 범위에 대해 탐색 계속
        return binary_search(A, m+1, j, x)
    
# A = [0, 2, 4, ..., 20]
A = [2*i for i in range(11)]
print(A)

while True:
    # x = -1 을 입력받을 때까지 반복
    x = int(input("x = "))
    if x == -1: break
    index = binary_search(A, 0, 19, x)
    if index == -1 : print("Not found!")
    else : print(str(x) + " is found at index : " + str(index))
print("END")
