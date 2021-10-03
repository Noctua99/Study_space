# 왼쪽 아래가 직각인 이등변 삼각형으로 * 출력하기

print('왼쪽 아래가 직각인 이등변 삼각형을 출력합니다')
length = int(input("짧은 변의 길이를 입력하세요: "))

for i in range(1, length+1):
    # for j in range(i):
    #     print('*', end='')
    # print()
    print('*'*i) # '*'을 반복문을 이용해서 일일히 출력하는 것보다 왼쪽의 방법이 더 직관적이고 빠르다
