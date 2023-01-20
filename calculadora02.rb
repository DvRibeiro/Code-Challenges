
#————————— SEGUNDA VERSÃO ————————————
resultado = " "

loop do
    puts resultado
    puts "Seja muito bem vindo a calculadora de fracassado!"
    puts "Seleciona a opção que deseja: "
    puts "1- Calcular o resultado de uma operação básica"
    puts "0- Sair"
    print option = "Opção: "
    option = gets.chomp.to_i

    if option == 1
        print "Digite o primeiro valor: "
        number01 = gets.chomp.to_f
        print "Digite o segundo valor: "
        number02 = gets.chomp.to_f
        puts "Qual operação quer realizar?: "
        puts "1- Adição"
        puts "2- Subtração"
        puts "3- Multiplicação"
        puts "4- Divisão"
        print operator = "Opção: "
        operator = gets.chomp.to_i
            case operator
            when 1
            result = number01 + number02
            when 2
            result = number01 - number02
            when 3
            result = number01 * number02
            when 4
            result = number01 / number02
            end
            resultado = "O resultado é #{result}"
    else
        break
    end
    system ("cls")
end




        
        
    