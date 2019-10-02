T = int(input())
rainbow = list(range(1, 8))
isRainbow = []
def getIsRainbow(array):
    is_rainbow = False
    if array[::-1] == array and sorted(list(set(array))) == rainbow:
        print(array)
        is_rainbow = True
    return is_rainbow

for i in range(T):
    N = int(input())
    array = list(map(int, input().split()))
    isRainbow.append("yes") if getIsRainbow(array) else isRainbow.append("no")

for value in isRainbow:
    print(value)
