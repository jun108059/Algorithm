W = int(input())
words = input().split()
# code below

# Global variables
average_length = (len(''.join(words)) + len(words) - 1) / len(words)  # The average length of the input string
normal_penalty = (W - average_length) ** 3  # Expected penalty per line based on average word
penalties = []  # To store penalties in all cases


def left_align(W, words, depth, penalty, sum_of_line):
    # Escape Condition
    if len(words) == 0:
        if sum_of_line != 0:
            penalty += (W - sum_of_line) ** 3
        penalties.append(penalty)
        return

    # local variable
    new_penalty = 0

    # First word of the line
    if sum_of_line == 0:
        sum_of_line = -1

    # Can append at the line
    if sum_of_line + (1 + len(words[0])) <= W:
        sum_of_line += (1 + len(words[0]))
        new_penalty = (W - sum_of_line) ** 3
        # print(" " + words[0] + " " + str(depth) + " " +  str(sum_of_line) + " " + str(penalty) + " " + str(new_penalty) + " " + str(penalty + new_penalty))
        if new_penalty < normal_penalty:
            left_align(W, words[1:], depth + 1, penalty + new_penalty, 0)
        left_align(W, words[1:], depth, penalty, sum_of_line)
    # Can't
    else:
        new_penalty = (W - sum_of_line) ** 3
        left_align(W, words, depth + 1, penalty + new_penalty, 0)


left_align(W, words, 0, 0, 0)
print(min(penalties))