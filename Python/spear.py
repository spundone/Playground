# Import scientific python library .stats 
import scipy.stats 

# Two lists of x and y 
x = [1,2,3,4,5] 
y = [5,4,3,2,1] 

# Print spearman ranking
print(scipy.stats.spearmanr(x, y)[0]) 


#install scipy using pip install scipy beforehand...