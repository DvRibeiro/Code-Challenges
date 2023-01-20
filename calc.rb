resultado = " "

loop do
    puts resultado
    puts "   ______________________________________________"
    puts "  |Welcome to my calculator!                     |"
    puts "  |Select one option:                            |"
    puts "  |1- Calculate a basic operation                |"
    puts "  |2- Solve a quadratic equation                 |"
    puts "  |0- Sair                                       |"
    puts " "
    print " Your option: "
    option = gets.chomp.to_i

    if option == 1
        puts "Type the operation you wanna do: "
        operation = gets.chomp.split    
        
    num1 = operation[0].to_f
    op = operation[1]
    num2 = operation[2].to_f
    

        case op
            when "+"
            result = (num1 + num2) 
            when "-"
            result = (num1 - num2)
            when "*"
            result = (num1 * num2)
            when "/"
            result = (num1 / num2)
            end 
            resultado = "The result is #{result}"
    
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
            result = x1 , x2 
        end
        resultado = "The result is S = #{result}"
    else
        break
    end
    system ("cls")
    
end


