# 가로, 세로 길이가 정수이고 넓이가 araa인 직사각형에서 변의 길이 나열하기

area = int(input("직사각형의 넓이를 입력하세요: "))


# area의 루트값을 미리 구해서 계산, 밑의 방식보다 if 연산이 더 적다

# sqrt_area = int(area**0.5)
# for i in range(1, sqrt_area+1):
#     if area % i == 0:
#         print(f'{i} x {area//i}')

for i in range(1, area+1):
    if i*i > area:
        break
    if area % i:    # area % i ==0 일 때만 출력
        continue
    print(f'{i} x {area // i}')
