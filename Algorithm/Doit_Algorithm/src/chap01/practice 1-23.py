# 오른쪽 아래가 직각인 이등변 삼각형으로 * 출력하기

print('오른쪽 아래가 직각인 이등변 삼각형을 출력합니다')
length = int(input("짧은 변의 길이를 입력하세요: "))

for i in range(1, length+1):
    # for _ in range(length-i):
    #     print(' ', end='')
    # for _ in range(i):
    #     print('*', end='')
    # print()

    print(f'{"*"*i:>{length}}') # 공백과 '*'을 일일히 반복문으로 출력하는 것보다 더 효율적이다
 