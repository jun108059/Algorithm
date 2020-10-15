import random, timeit


def quick_sort(A, first, last):
	global Qc
	global Qs
	if first >= last: return
	left, right = first+1, last
	pivot = A[first]
	while left <= right:
		while left <= last and A[left] < pivot:
			Qc = Qc + 1
			left += 1
		while right > first and A[right] >= pivot:
			Qc = Qc + 1
			right -= 1
		if left <= right:  # swap A[left] and A[right]
			Qs = Qs + 1
			A[left], A[right] = A[right], A[left]
			left += 1
			right -= 1
		# place pivot at the right place
	A[first], A[right] = A[right], A[first]
	Qs = Qs + 1
	quick_sort(A, first, right-1)
	quick_sort(A, right+1, last)


def merge_sort(A, first, last):
	global Mc
	if first >= last:
		Mc += 1
		return

	mid = (first + last) // 2
	merge_sort(A, first, mid)
	merge_sort(A, mid + 1, last)
	merge_two_sorted_list(A, first, last)


def merge_two_sorted_list(A, first, last):
	global Mc, Ms
	mid = (first + last) // 2
	l, r = first, mid + 1
	N = []
	while l <= mid and r <= last:
		if A[l] <= A[r]:
			Mc += 1
			N.append(A[l])
			l += 1
		else:
			N.append(A[r])
			Ms += 1
			r += 1
	for k in range(l, mid + 1):
		N.append(A[k])
	for k in range(r, last + 1):
		N.append(A[k])
	for i in range(first, last + 1):
		A[i] = N[i - first]


def heap_sort(A):
	global Hc, Hs
	n = len(A)
	for k in range(n - 1, -1, -1):
		heapify_down(A, k, n)

	for k in range(len(A) - 1, -1, -1):
		A[0], A[k] = A[k], A[0]
		Hs += 1
		n = n - 1
		heapify_down(A, 0, n)


def heapify_down(A, k, n):
	global Hc, Hs
	while 2 * k + 1 < n:
		L, R = 2 * k + 1, 2 * k + 2
		if L < n and A[L] > A[k]:
			Hc += 1
			m = L
		else:
			m = k
		if R < n and A[R] > A[m]:
			Hc += 1
			m = R
		if m != k:
			A[k], A[m] = A[m], A[k]
			Hs += 1
			k = m
		else:
			break

# 아래 코드는 바꾸지 말 것!
# 직접 실행해보면, 어떤 값이 출력되는지 알 수 있음


def check_sorted(A):
	for i in range(n-1):
		if A[i] > A[i+1]: return False
	return True

#
# Qc는 quick sort에서 리스트의 두 수를 비교한 횟수 저장
# Qs는 quick sort에서 두 수를 교환(swap)한 횟수 저장
# Mc, Ms는 merge sort에서 비교, 교환 횟수 저장
# Hc, Hs는 heap sort에서 비교, 교환 횟수 저장
#
Qc, Qs, Mc, Ms, Hc, Hs = 0, 0, 0, 0, 0, 0

n = int(input())
random.seed()
A = []
for i in range(n):
	A.append(random.randint(-1000, 1000))
B = A[:]
C = A[:]

print("")
print("Quick sort:")
print("time =", timeit.timeit("quick_sort(A, 0, n-1)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}\n".format(Qc, Qs))
print("Merge sort:")
print("time =", timeit.timeit("merge_sort(B, 0, n-1)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}\n".format(Mc, Ms))

print("Heap sort:")
print("time =", timeit.timeit("heap_sort(C)", globals=globals(), number=1))
print("  comparisons = {:10d}, swaps = {:10d}\n".format(Hc, Hs))

# 진짜 정렬되었는지 check한다. 정렬이 되지 않았다면, assert 함수가 fail됨!
assert(check_sorted(A))
assert(check_sorted(B))
assert(check_sorted(C))
