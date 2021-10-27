print("Welcome to python calculator\n")


#Taking input from the user.
num1 = float(input("Enter first number : "))
num2 = float(input("Enter second number : "))

while True:	
	#Knowing the choice from user about the operation to be performed.
	option = int(input("1. Addition\n2. Substraction\n3. Divition\n4. Multiplication\n5. Exit\nSelect one : "))


	#Performing operations based on what user needs.
	if option == 1:
		print(num1 + num2)
	elif option == 2:
		print(num1 - num2)
	elif option == 3:
		print(num1 / num2)
	elif option == 4:
		print(num1 * num2)
	elif option == 5:
		break
	else:
		print("invalid! Try again.")
