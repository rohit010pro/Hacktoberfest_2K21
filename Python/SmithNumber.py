import math
x = input("\nEnter the desired number: ")
n = int(x)
m = n
factors=[]

if n==0 or n==1:
    print("The given number has no prime factors and hence, IS NOT a Smith number!\n")

else:
    # function to determine prime number
    def Prime(n):
        for i in range(2,n):  
            if (n % i) == 0:  
                return False
            else:  
                continue
        return True

    if Prime(n):
        print("The given number is a prime number and hence, IS NOT a Smith number!\n")

    else:
        sum, total = 0, 0
        for i in range(len(x)):  # To calculate sum of digits 
            sum += m % 10
            m //= 10

        while n % 2 == 0:   # n is even
            factors.append(2)
            n = n / 2
        for i in range(3,int(math.sqrt(n))+1,2):    # n is odd
            while n % i == 0:
                factors.append(int(i))
                n = int(n / i)           
        if n > 2:   #n is prime
            factors.append(int(n))

        for elem in factors:
            if len(str(elem))>1:
                for i in range(len(str(elem))): 
                    total+=elem%10
                    elem//=10
            else:
                total+=elem
    # Final Output display
        print("The prime factors of the number are:",factors )
        print("The sum of its digits is:",sum)
        print("The sum of the digits of its prime factors is:",total)
        
        if sum == total:
            print("Hence, it IS a Smith number!\n")
        else:
            print("Hence, it IS NOT a Smith number!\n")
