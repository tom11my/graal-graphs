def sum(array)
    sum = 0
    array.each do |number|
      sum += number
    end
    return sum 
  end 
p sum([5, 10, 20])
