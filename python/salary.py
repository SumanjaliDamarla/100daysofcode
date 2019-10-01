T = int(input())
moves = []

def changeList(salaries):
    max_sal = max(salaries)
    pos = salaries.index(max_sal)
    for i in range(len(salaries)):
        if i != pos:
            salaries[i] = salaries[i] + 1
    return salaries

def getNumberOfMoves(salaries):
    number_of_moves = 0
    while(len(set(salaries)) > 1):
        salaries = changeList(salaries)
        number_of_moves = number_of_moves + 1
    return number_of_moves

for i in range(T):
    number_of_employees = int(input())
    salaries = list(map(int, input().split()))
    moves.append(getNumberOfMoves(salaries))

for count in moves:
    print(count)
