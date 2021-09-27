# *를 n개 출력하되 w개마다 줄바꿈하기 2

print("*를 출력합니다")
n = int(input("몇 개를 출력할까요?: "))
w = int(input("몇 개마다 줄바꿈할까요?: "))

line = n//w
rest = n % w

for _ in range(line):
    print('*'*w)

if rest:
    print('*'*rest)
