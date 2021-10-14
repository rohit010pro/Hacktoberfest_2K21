print("Welcome to python calculator\n")

option = int(input("1.Addition\n2.Substraction\n3.Divition\n4.Multiplication\n\nSelect one : "))

num1 = float(input("Enter first number : "))
num2 = float(input("Enter second number : "))

if option == 1:
	print(num1 + num2)
elif option == 2:
	print(num1 - num2)
elif option == 3:
	print(num1 / num2)
elif option == 4:
	print(num1 * num2)
else:
	print("invalid! Try again.")
