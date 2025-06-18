name = "rhythm" #This is a variable that is set equal to a string

print("Hello my name is " + name) # this concatanates two strings, the variable name and the hello my name is

age1 = 14 #setting an int variable
age2 = 23
ages = age1 + age2 # adding the two int variables together

print("Me and my brothers ages add up to " + str(ages)) #Stating what the variable mean and making sure to 
#concatanate correctly

money1 = 20.34 #making a float variable
money2 = 50.71
money = money2 - money1 #subtracting the float variables
rounded = round(money, 2) #rounding it to the tenths place because it is money

print("I took some of my brother's money, he started out with $50.71 and I took $20.34, so now he has " + str(rounded) + " dollars") #concatanating and printing out what the variable mean

print("I then gave him back $20 so now he has " + str(round(rounded+20, 2)) + " dollars") #adding a float and an int together and rounding it to the tenths place because it is representing money


