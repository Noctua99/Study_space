# 세 정수를 입력받아 중앙값 구하기 1

def med3(a, b, c):
    if a >= b:
        if b >= c:
            return b
        elif c >= a:
            return a
        else:
            return c
    elif a > c:
        return a
    elif b > c:
        return c
    else:
        return b


# def med3(a, b, c):
# 비교하는 과정이 중복되서 위의 방식보다 효율적이지 않다
#     if(b >= a and c <= a) or (b <= a and c >= a):
#         return a
#     elif(a > b and c < b) or (a < b and c > b):
#         return b
#     return c


print(f'med3(3, 2, 1) = {med3(3, 2, 1)}')
print(f'med3(3, 2, 2) = {med3(3, 2, 2)}')
print(f'med3(3, 1, 2) = {med3(3, 1, 2)}')
print(f'med3(3, 2, 3) = {med3(3, 2, 3)}')
print(f'med3(2, 1, 3) = {med3(2, 1, 3)}')
print(f'med3(3, 3, 2) = {med3(3, 3, 2)}')
print(f'med3(3, 3, 3) = {med3(3, 3, 3)}')
print(f'med3(2, 2, 3) = {med3(2, 2, 3)}')
print(f'med3(2, 3, 1) = {med3(2, 3, 1)}')
print(f'med3(2, 3, 2) = {med3(2, 3, 2)}')
print(f'med3(1, 3, 2) = {med3(1, 3, 2)}')
print(f'med3(2, 3, 3) = {med3(2, 3, 3)}')
print(f'med3(1, 2, 3) = {med3(1, 2, 3)}')
