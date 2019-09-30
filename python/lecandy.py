#  https://www.codechef.com/problems/LECANDY

T = int(input())
is_happy = []

def zooIsHappy(available_candies):
    candies_needed = sum(list(map(int,input().split())))
    return "Yes" if available_candies >= candies_needed else "No"

for i in range(T):
    elephant_count, available_candies = map(int, input().split())
    is_happy.append(zooIsHappy(available_candies))

for element in is_happy:
    print(element)
