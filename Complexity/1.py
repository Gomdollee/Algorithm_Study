array = [3, 5, 1 , 2, 4]
summary = 0

for x in array:
    summary += x

print(summary)

for i in array:
    for j in array:
        temp = i * j
        print(temp)