#aulas = {'Aula 1 ' => 'liberada', 'Aula 2 ' =>  'liberada', 'Aula 3 ' => 'liberada', 'Aula 4 ' => 'liberada', 'Aula 5 ' =>  'em breve'}
 
#aulas.each do |key, value|
# puts "#{key} #{value}"
#end

array = [1, 2, 3, 4]
puts "   _____________________________________________________________"
puts "  |Seleciona o que deseja fazer:                                |"
puts "  |1- Multiplicar cada objeto por 2 sem alterar o array original|"
puts "  |2- Multiplicar cada objeto por 2 alterarando o array original|"

print ": "
option = gets.chomp.to_i

if option == 1
    puts "\n Multiplicando cada objeto por 2 sem alterar array original kk"

    new_array = array.map do |x|
        x * 2
    end

    puts "\n Array original" 
    puts " #{array}"

    puts "\n Novo array"
    puts " #{new_array}"


else option == 2
    new_array = array.map! do |x|
        x * 2
    end

    puts "\n Array original (alterado por conta do 'map!')" 
    puts " #{array}"

    puts "\n Novo array"
    puts " #{new_array}"
end