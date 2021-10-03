# 세 정수를 입력받아 최댓값 구하기

a, b, c = map(int, input("세 정수를 입력해주세요: ").split())

max = a
if b > max:
    max = b
if c > max:
    max = c
print(f'최댓값은 {max}입니다.')