select city,length_city from (
    select a.*, rownum r from 
    (
        select length(city) length_city,city 
        from station order by length_city , city 
    )a
) 
where r in (1,(select count(*) from station));
