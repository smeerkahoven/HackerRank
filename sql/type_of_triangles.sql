select 
    case when "A"+"B" <= "C" or "A"+"C" <= "B" or "C"+"B" <= "A" Then 'Not A Triangle' 
    else
        case when "A" ="B" and "A"="C"
            then 'Equilateral' 
            else 
                case when "A" ="B" or "A"="C"or "B"="C"
                then 'Isosceles' 
                else
                    case when "A" !="B" and "A"!="C" and "B"!="C" 
                    then 'Scalene'
                    end
            end
        end        
    end
from
triangles t ;


