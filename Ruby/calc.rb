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
        print "Digite a operação que deseja realizar: "
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
            resultado = "O resultado é #{result_operation1}"
    
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
            result_quadratica = x1 , x2 
        end
        resultado = "O resultado é S = #{result_quadratica}"
    else
        break
    end
    system ("cls")
    
end


