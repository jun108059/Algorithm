import time, random

def evaluate_n2(A, x):
	# code for O(n^2)-time function
	result = A[0]
	temp = [0]*len(A)
	for i in range(1, len(A)):
		x_square = 1
		for j in range(1, i+1):
			x_square = x_square * x
		temp[i] = A[i] * x_square
		result = result + temp[i]
	# print("O(n²) - Evaluate Result\n>> ", result)
	
def evaluate_n(A, x):
	# code for O(n)-time function
	result = A[0]
	x_square = [1]*len(A)
	temp = x
	# O(n)으로 x 배열 할당
	for i in range(1, len(A)):
		x_square[i] = temp
		temp = temp * x
	# O(n)으로 더하기
	for i in range(1, len(A)):
		result = result + A[i] * x_square[i]
	# print("O(n) - Evaluate Result\n>> ", result)


random.seed()		# random 함수 초기화
n = int(input("Input coefficient size : ")) # n 입력받음
A = []


for i in range(n):
	A.append(random.randint(-999, 999))
	# 리스트 A를 randint를 호출하여 n개의 랜덤한 숫자로 채움


x = random.randint(-99,99)

# print("Random coefficient :\n>> ", A)
# print("Random 'x' created :\n>> ", x)
# print("\n")

before = time.clock() # 함수 호출 전 시간
evaluate_n2(A, x) # evaluate_n2 호출
print("O(n²) performanece time : ", round(time.clock() - before, 6))

before = time.clock() # 함수 호출 전 시간
evaluate_n(A, x) # evaluate_n 호출
print("O(n) performanece time : ", round(time.clock() - before, 6))
# 두 함수의 수행시간 출력 끝








