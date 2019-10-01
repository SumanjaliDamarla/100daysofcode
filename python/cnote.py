T = int(input())
for i in range(T):
    pages_left, pages_needed, amount, number_of_books = map(int, input().split())
    book_details = []
    for j in range(number_of_books):
        book_details.append(list(map(int, input().split())))
    
