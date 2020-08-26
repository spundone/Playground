# Import scientific python library .stats 
import scipy.stats 

# Two lists of x and y 
x = [36,56,20,42,33,44,50,15,60] 
y = [50,35,70,58,75,60,45,80,38] 

# Print spearman ranking
print(scipy.stats.spearmanr(x, y)[0]) 


#install scipy using pip install scipy beforehand...