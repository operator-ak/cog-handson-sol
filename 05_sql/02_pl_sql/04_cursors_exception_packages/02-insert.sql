create or replace procedure check_age_eligibility
(
    v_id in employee.empid%type,
    v_name in employee.empname%type,
    v_age in employee.age%type
)
as
    v_age_exception exception;
    
begin
    if v_age < 18 then
        raise v_age_exception;
    end if;
    
    insert into employee
    values (v_id, v_name, v_age);
    
    dbms_output.put_line('Age valid - Record inserted');
        
exception
    when v_age_exception then
        dbms_output.put_line('Age invalid - Record not inserted');

end check_age_eligibility;
/