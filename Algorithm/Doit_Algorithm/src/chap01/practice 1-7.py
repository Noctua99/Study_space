# 1부터 n까지 정수의 합 구하기 1(while 문)

# def sumN(num):
#     return int((num+1)*(num/2))
# 가우스 덧셈을 활용하여 숫자가 커질수록 더 효율적이다


print("1부터 n까지 정수의 합을 구합니다.")
n = int(input("n값을 입력하세요: "))

sum = 0
for i in range(1, n+1):
    sum = sum+i

print(f'1부터 5까지 정수의 합은 {sum}입니다.')