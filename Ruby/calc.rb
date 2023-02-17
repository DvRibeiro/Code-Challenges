result = " "

loop do
    puts result
    puts "   ______________________________________________"
    puts "  |Welcome to my calculator!                     |"
    puts "  |Select one option:                            |"
    puts "  |1- Calculate a basic operation                |"
    puts "  |2- Solve a quadratic equation                 |"
    puts "  |0- Exit                                       |"
    puts " "
    print " Your option: "
    option = gets.chomp.to_i

    if option == 1
        print "Type the operation you wanna do: "
        operation1 = gets.chomp.split    
        
    num1 = operation1[0].to_f
    op = operation1[1]
    num2 = operation1[2].to_f
    

        case op
            when "+"
            result_operation1 = (num1 + num2) 
            when "-"
            result_operation1 = (num1 - num2)
            when "*"
            result_operation1 = (num1 * num2)
            when "/"
            result_operation1 = (num1 / num2)
            end 
            result = "The result is #{result_operation1}"
    
    elsif option == 2
        puts "Type your equation: "
        print "a= "
        a = gets.chomp.to_f
        print "b= "
        b = gets.chomp.to_f
        print "c= "
        c = gets.chomp.to_f

        delta = ((b * b) - 4 * a * c)
        
        if(delta < 0)
            print "Do not exist real roots."
        else 
            x1 = (-b + Math.sqrt(delta)) / (2*a)
            x2 = (-b - Math.sqrt(delta)) / (2*a)
            result_operation2 = x1 , x2 
        end
        result = "The result is S = #{result_operation2}"
    else
        break
    end
    system ("cls")
    
end


