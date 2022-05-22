numbers = list(input("1,2,3,4,5: ").split(", "))
sum = 0

for number in numbers:
  sum += int(number)

print(sum)