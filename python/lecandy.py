#  https://www.codechef.com/problems/LECANDY

T = int(input())
is_happy = []

def candiesForEachElephant():
    return list(map(int, input().split()))

def zooIsHappy(available_candies):
    required_candies = sum(candiesForEachElephant())
    return available_candies >= required_candies

for i in range(T):
    elephant_count, available_candies = map(int, input().split())
    is_happy.append("Yes") if zooIsHappy(available_candies) else is_happy.append("No")

for element in is_happy:
    print(element)
