W = int(input())
words = input().split()  # 입력받을 문장

size = len(words)

dp_table = [0]*size

for i in range(0, size): # O(n)
    min_penalty = size * (W ** 3)

    temp_i = i
    curr_W = 0
    while temp_i >= 0:
        curr_W += len(words[temp_i]) + 1
        curr_penalty = dp_table[temp_i-1] + ((W - curr_W + 1)**3)
        if curr_W - 1 <= W:
            if min_penalty > curr_penalty:
                min_penalty = curr_penalty
        else:
            break
        temp_i = temp_i - 1
    dp_table[i] = min_penalty

print(dp_table[size-1])
