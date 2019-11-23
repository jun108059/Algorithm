W = int(input())         # 페이지 폭 W
words = input().split()  # 입력받을 문장
index = 0       # words 접근 index
penalty = 0     # Total penalty
bl = 0          # 글자 사이 공백


# 페이지 폭, List, 접근 index, 공백, penalty
def penalty_cal(W, words, index, bl, penalty):
    blink = W - words[index] - bl  # blink = 해당 줄에 남은 자리
    W = blink - 1                  # W 를 blink -1 로 설정
    penalty = penalty + (blink)**3    # penalty 구하기
    # 다음 String 이 존재 하고
    if index != len(words[index])-1:
        index = index + 1  # 다음 index 접근
        # 같은 줄에 들어갈 자리가 있는 경우
        if words[index] <= W:
            penalty = 0         # penalty 초기화 (같은 라인에 추가)
            bl = bl + 1         # 공백 하나 추가
            penalty_cal(W, words, index, bl, penalty)
        # 자리가 없는 경우
        else:
            bl = 0              # 글자 사이 공백 초기화
            blink = W - words[index] - bl  # blink = 해당 줄에 남은 자리
            penalty = min(penalty, penalty_cal(W, words, index, bl, penalty))
    return penalty

print(len(words[0]))


# 페이지 폭, List, 접근 index, 공백, penalty
def penalty_cal2(W, words, index, bl, penalty):
    # 마지막 index 에 접근하면 끝나는 함수 호출
    if index == len(words) - 1:
        return 1000000

    blink = W - words[index] - bl  # blink = 해당 줄에 남은 자리
    W = blink - 1                  # W 를 blink -1 로 설정
    penalty = penalty + (blink)**3    # penalty 구하기
    # 다음 String 이 존재 하고
    if index != len(words[index])-1:
        index = index + 1  # 다음 index 접근
        # 같은 줄에 들어갈 자리가 있는 경우
        if words[index] <= W:
            penalty = penalty + (blink)**3         # penalty 초기화 (같은 라인에 추가)
            bl = bl + 1         # 공백 하나 추가
        # 자리가 없는 경우
        else:
            bl = 0              # 글자 사이 공백 초기화
            blink = W - words[index] - bl  # blink = 해당 줄에 남은 자리
            penalty = min(penalty, penalty_cal(W, words, index, bl, penalty))
    return penalty
