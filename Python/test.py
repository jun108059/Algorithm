
def rotation_count(A, start, end):
    if A[start] < A[end]:
        print("끝")
        print(end)
        return 0
    else:
        m = (start + end)//2
        print("start")
        print(start)
        print("end")
        print(end)
        if end - start <= 1:
            print(A[m])
            print(A[m+1])
            if A[m] > A[m+1]:
                return len(A) - start + 1
            else: 
                return A[m+1]
        else:
            return max(rotation_count(A, start, m-1), rotation_count(A, m, end))

    

# tempA = input().split()
# A = []

# for num in tempA:
    # A.append(int(num))

A = [5, 6, 1, 2, 3, 4]
# A = [1, 2, 3, 4, 5, 6]

start = 0
end = len(A) - 1 

print(A)

print(rotation_count(A, start, end))