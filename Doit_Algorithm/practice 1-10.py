# a부터 b까지 정수의 합 구하기 1

print("a부터 b까지 정수의 합을 구합니다")
a = int(input("정수 a를 입력하세요: "))
b = int(input("정수 b를 입력하세요: "))

if a > b:
    a, b = b, a

# a부터 b까지 합을 가우스의 덧셈을 이용해 계산하고 나머지 것들은 result 문자열에 한번에 더해서 출력하였다

# sum = (a+b)*(b-a+1)//2
# result = str(a)
# for i in range(a+1, b+1):
#     result = result+' + '+str(i)
# print(f'{result} = {sum}')

sum = 0
for i in range(a, b+1):
    if i < b:
        print(f'{i} + ', end='')
    else:
        print(f'{i} = {sum}')
    sum += i
