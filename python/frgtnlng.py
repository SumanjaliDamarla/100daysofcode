T = int(input())
is_old_word = []

def getIsOld(old_words, new_words):
    is_old = []
    for word in old_words:
        is_old.append("YES") if word in new_words else is_old.append("NO")
    return is_old

for _ in range(T):
    old_word_cnt, new_sentence_cnt = map(int, input().split())
    old_words = input().split()
    new_words = []
    for sentence_num in range(new_sentence_cnt):
        new_words = new_words + input().split()
    is_old_word.append(getIsOld(old_words, new_words))

for res in is_old_word:
    print(res)
