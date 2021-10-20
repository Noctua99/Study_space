# +와-를 번갈아 출력하기 2

print('+와 -를 번갈아 출력합니다')
n = int(input("몇 개를 출력할까요?: "))


# 책에 나와 있는 방법

# for _ in range(n//2):
#     print('+-', end='')
# if n % 2:
#     print('+', end='')
# print()


# for문을 제거하고 if 문 판단 한번으로 풀 수 있다

if n % 2 == 0:
    print("+-"*(n//2))
else:
    print("+-"*(n//2)+'+')
