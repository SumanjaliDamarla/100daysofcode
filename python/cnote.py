UNLUCKY = "UnluckyChef"
LUCKY = "LuckyChef"

T = int(input())
chefLuck = []

def decideLuck(pages_left, pages_needed, budget, books_in_shop):
    chef = UNLUCKY
    if pages_needed <= pages_left:
        chef = LUCKY
    for i in range(books_in_shop):
        number_of_pages, cost = map(int, input().split())
        if pages_needed - pages_left <= number_of_pages and cost <= budget:
            chef = LUCKY
    return chef

for i in range(T):
    pages_needed, pages_left, budget, books_in_shop = map(int, input().split())
    chefLuck.append(decideLuck(pages_left, pages_needed, budget, books_in_shop))
for value in chefLuck:
    print(value)
