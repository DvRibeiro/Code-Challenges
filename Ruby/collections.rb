#multiply an array by 2 using two different methods.
array = [1, 2, 3, 4]

loop do
    puts "   _____________________________________________________________"
    puts "  |                   Choose one option:                        |"
    puts "  |1- Multiply the array by two without changing the original   |"
    puts "  |2- Multiply the array by two changing the original           |"

    print " Your option: "
    option = gets.chomp.to_i

    if option == 1
        puts "\n Multiplying each object and creating a new array with the results."

        new_array = array.map do |x|
        x * 2
        end

        puts "\n Original Array " 
        puts " #{array}"

        puts "\n New array"
        puts " #{new_array}"


    elsif option == 2
        puts "\n Multiplying each object and changing the results in the original array."
    
        new_array = array.map! do |x|
        x * 2
        end

        puts "\n Original Array (changed by using the 'map!' command insted of just 'map')" 
        puts " #{array}"

        puts "\n New array"
        puts " #{new_array}"
    else 
        break
    end
    system ("cls")

end
