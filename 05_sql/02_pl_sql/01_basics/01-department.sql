declare
    dept_id department.department_id%type := 10;
    dept_name department.department_name%type := 'TESTING';
    loc_id department.location_id%type := 'CHN-102';
    
begin

    select max(department_id) into dept_id
    from department;
    
    dept_id := dept_id + 10;
    
    insert into department
    values (dept_id, dept_name, loc_id);

end;