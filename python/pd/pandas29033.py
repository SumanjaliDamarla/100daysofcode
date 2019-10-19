import pandas as pd
df = pd.DataFrame({
    'id':[1,2,2],
    'cost':[5,5,5],
    'letters':[['a','b'],['a','b'],['a','b']]
})
print(df)
print("------------------------------------------")
print("df.sum()")
print("------------------------------------------")
print(df.sum())
print("------------------------------------------")
print("df.groupby('id')")
print("------------------------------------------")
print(df.groupby('id'))
print("------------------------------------------")
print("df.groupby('id').agg('sum')")
print("------------------------------------------")
print(df.groupby('id').agg('sum'))
print("------------------------------------------")
print("df.groupby('id').agg(pd.Series.sum)")
print("------------------------------------------")
print(df.groupby('id').agg(pd.Series.sum))
