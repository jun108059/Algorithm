def find_median_five(L):
    # 승자패자 정렬
    win1, win2, lose1, lose2 = 0, 0, 0, 0
    if len(L) <= 2:
        return L[0]
    elif len(L) <= 3:
        if L[0] < L[1]:
            win1, lose1 = L[1], L[0]
        else:
            win1, lose1 = L[0], L[1]
        if win1 < L[2]:
            return win1
        else:
            if lose1 < L[2]:
                return L[2]
            else:
                return lose1
    elif len(L) <= 4:
        if L[0] < L[1]:
            win1, lose1 = L[1], L[0]
        else:
            win1, lose1 = L[0], L[1]
        if L[2] < L[3]:
            win2, lose2 = L[3], L[2]
        else:
            win2, lose2 = L[2], L[3]

        if win1 < win2:
            return win1
        else:
            return win2
    elif len(L) == 5:
        if L[0] < L[1]:
            win1, lose1 = L[1], L[0]
        else:
            win1, lose1 = L[0], L[1]
        if L[2] < L[3]:
            win2, lose2 = L[3], L[2]
        else:
            win2, lose2 = L[2], L[3]
        if win1 > win2:
            if lose1 < L[4]:
                win1 = L[4]
            else:
                win1 = lose1
                lose1 = L[4]
        else:
            if lose2 < L[4]:
                win2 = L[4]
            else:
                win2 = lose2
                lose2 = L[4]

        if win1 > win2:
            if win2 > lose1:
                return win2
            else:
                return lose1
        else:
            if win1 > lose2:
                return win1
            else:
                return lose2

def MoM(L, k):
    if len(L) == 1:
        return L[0]

    i = 0
    A, B, M, medians = [], [], [], []

    while i+4 < len(L):
        medians.append(find_median_five(L[i: i+5]))
        i += 5
    if i < len(L) and i+4 >= len(L):
        medians.append(find_median_five(L[i:]))

    mom = MoM(medians, len(medians)//2)
    
    for v in L:
        if v < mom: A.append(v)
        elif v > mom: B.append(v)
        else: M.append(v)
    
    if len(A) >= k: return MoM(A, k)
    elif len(A) + len(M) < k: return MoM(B, k-len(A)-len(M))
    else: return mom

n, k = (int(x) for x in input().split())
L = [int(x) for x in input().split()]

print(MoM(L, k))
