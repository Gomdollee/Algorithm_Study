array = [3, 5, 1 , 2, 4]
summary = 0

for x in array:
    summary += x

print(summary)

for i in array:
    for j in array:
        temp = i * j
        print(temp)


# Big-O 표기법
def sum_list(nums):
    total = 0  # O(1) 한개임
    for num in nums: # O(N) N만큼
        total += num
    return total #  O(1) 다시 한개