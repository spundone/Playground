main = do 
   putStrLn "Enter value of int a:"
   var1 <- getLine
   putStrLn "Enter value of int b:"
   var2 <- getLine
   putStrLn "The addition of the two numbers is:" 
   print(read var1 + read var2)