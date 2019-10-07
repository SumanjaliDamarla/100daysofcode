T = int(input())
moves = []

def changeList(salaries):
    max_sal = max(salaries)
    min_sal = min(salaries)
    pos = salaries.index(max_sal)
    for i in range(len(salaries)):
        if i != pos:
            salaries[i] = salaries[i] + (max_sal - min_sal)
    return salaries, (max_sal - min_sal)

def getNumberOfMoves(salaries):
    number_of_moves = 0
    while(len(set(salaries)) > 1):
        salaries, increment = changeList(salaries)
        number_of_moves = number_of_moves + increment
    return number_of_moves

for i in range(T):
    number_of_employees = int(input())
    salaries = list(map(int, input().split()))
    moves.append(getNumberOfMoves(salaries))

for count in moves:
    print(count)
