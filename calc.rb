resultado = " "

loop do
    puts resultado
    puts "   ______________________________________________"
    puts "  |Seja bem vindo a calculadora de otário!       |"
    puts "  |Seleciona o que deseja fazer:                 |"
    puts "  |1- Calcular o resultado de uma operação básica|"
    puts "  |2- Resolver uma equação quadrática            |"
    puts "  |0- Sair                                       |"
    puts " "
    print " Sua opção: "
    option = gets.chomp.to_i

    if option == 1
        puts "Digite a operação que deseja realizar: "
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
            resultado = "O resultado é #{result}"
    
    elsif option == 2
        puts "Digite a sua equação: "
        print "a= "
        a = gets.chomp.to_f
        print "b= "
        b = gets.chomp.to_f
        print "c= "
        c = gets.chomp.to_f

        delta = ((b * b) - 4 * a * c)
        
        if(delta < 0)
            print "Não existem raízes reais"
        else 
            x1 = (-b + Math.sqrt(delta)) / (2*a)
            x2 = (-b - Math.sqrt(delta)) / (2*a)
            result = x1 , x2 
        end
        resultado = "O resultado é S = #{result}"
    else
        break
    end
    system ("cls")
    
end


