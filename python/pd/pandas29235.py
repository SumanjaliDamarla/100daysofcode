import pandas as pd

import matplotlib.pyplot as plt

df = pd.DataFrame({
    'width': [0.7, 0.2, 0.15, 0.2, 1.1],
    'length': [1.5, 0.5, 1.2, 0.9, 3]
    }, index= ['pig', 'rabbit', 'duck', 'chicken', 'horse'])

# Whether or not `column` is passed the order is still reordered to alphabetical.
df.hist(column=['width','length'])
plt.show()
