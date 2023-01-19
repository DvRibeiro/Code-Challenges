#This problem involves finding the number of integers with a value greater than 5. 
#In Ruby speak, you could put it like this: Given an array, count how many items are greater than 5.

array = [17, 7, 3, 6, 10, 1]

count = 0 
for number in array
    if number > 5
        count += 1
    end
end
puts " "
puts "There are #{count} items greater than 5."
puts " "