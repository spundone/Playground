main = do 
   putStrLn "Enter value of int a:"
   var1 <- getLine
   putStrLn "Enter value of int b:"
   var2 <- getLine
   putStrLn "The addition of the two numbers is:" 
   print(read var1 + read var2)
   putStrLn "The subtraction of the two numbers is:"
   print(read var1 - read var2)
   putStrLn "The multiplication of the two numbers is:"
   print(read var1 * read var2)
   putStrLn "The division of the two numbers is:"
   print(read var1/read var2)
   putStrLn "The multiplication of the first number with the negative of second number is:"
   print(read var1*(-read var2))
   