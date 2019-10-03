T = int(input())
rainbow = list(range(1, 8))
isRainbow = []

def getIsRainbow(array, N):
    is_rainbow = True
    if (array[0] != 1) or (array[N//2] != 7 and array[N//2] != 7):
        is_rainbow = False
    for i in range(N//2 + 1):
        if (array[i] != array[N - i - 1]) or (array[i + 1] - array[i] > 1):
            is_rainbow = False
    return is_rainbow

for i in range(T):
    N = int(input())
    array = list(map(int, input().split()))
    isRainbow.append("yes") if getIsRainbow(array, N) else isRainbow.append("no")

for value in isRainbow:
    print(value)
