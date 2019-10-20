import pandas as pd
def printFormat(s):
    print("------------------------------------------")
    print(s)
    print("------------------------------------------")

df = pd.DataFrame({
    'id':[1,2,2],
    'cost':[4,5,3],
    'letters':[['a','b'],['a','b'],['a','b']]
})
printFormat("df")
print(df)
printFormat("df.sum()")
print(df.sum())
printFormat("df.groupby('id')")
print(df.groupby('id'))
printFormat("df.groupby('id').agg('sum')")
print(df.groupby('id').agg('sum'))
printFormat("df.groupby('id').agg(pd.Series.sum)")
print(df.groupby('id').agg(pd.Series.sum))
printFormat("df.set_index('cost')")
print(df.set_index('cost'))
printFormat("df.set_index('cost').reset_index(level = 0, drop = False)")
print(df.set_index('cost').reset_index(level=0, drop=False))
