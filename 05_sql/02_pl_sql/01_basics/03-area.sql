declare
    rad circle.radius%type := 3;
    ar circle.area%type := 0;
    
begin
    for rad in 3..7
    loop
        ar := 3.14 * rad * rad;
        
        insert into circle(radius, area)
        values (rad, ar);
    end loop;
end;
/