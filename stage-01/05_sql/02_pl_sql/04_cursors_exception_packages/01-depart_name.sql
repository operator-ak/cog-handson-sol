set serveroutput on

declare
    cursor c is 
    select *
    from department
    order by department_name;
    
    rec department%rowtype;
begin
    dbms_output.put_line('Department Names are : ');
    
    open c;
    
    loop
    fetch c into rec;
    
    exit when c%notfound;
    
    dbms_output.put_line(rec.department_name);
    
    end loop;
    
    close c;
end;
