# [재귀] Palindrome 검사

def palindrome(s, left, right):
	if len(s) < 2:
		return True
	return s[left] == s[right] and palindrome(s[1:-1], left, right-2)


# 문자열을 읽어 모두 소문자로 변경
s = input().lower()
# 공백 문자는 모두 제거
s = "".join(s.split())

result = palindrome(s, 0, len(s)-1)
print(result)