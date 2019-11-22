
with x_tmp as (
    select level+1 value  from dual 
    connect by level <= 1000 
)

select  listagg (value,'&') within group (order by value) as value
from (

    select x_tmp.value, 1 id
    from x_tmp
    where not exists   (
        select 1 from x_tmp y_tmp
        where x_tmp.value > y_tmp.value  and remainder (x_tmp.value, y_tmp. value)= 0
    )
)A
;
