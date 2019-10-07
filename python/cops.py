HOUSES = 100
T = int(input())
safe_count = []

def getSafeCount(N, x, y, cops):
    danger_houses = []
    for house in cops:
        l_safe = 1 if house - (x * y) < 1 else house - (x * y)
        r_safe = HOUSES if house + (x * y) > HOUSES else house + (x * y)
        danger_houses = danger_houses + list(range(l_safe, r_safe + 1))
    return HOUSES - len(set(danger_houses))

for _ in range(T):
    N, x, y = map(int, input().split())
    cops = list(map(int, input().split()))
    safe_count.append(getSafeCount(N, x, y, cops))

for count in safe_count:
    print(count)
