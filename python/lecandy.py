#  https://www.codechef.com/problems/LECANDY

T = int(input())
is_happy = []

def getListElements():
    return list(map(int, input().split()))

def zooIsHappy(available_candies):
    required_candies = sum(getListElements())
    return "Yes" if available_candies >= required_candies else "No"

for i in range(T):
    elephant_count, available_candies = map(int, input().split())
    is_happy.append(zooIsHappy(available_candies))

for element in is_happy:
    print(element)
