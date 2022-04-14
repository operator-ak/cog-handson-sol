create or replace trigger employee_after_update
after insert
    on employee
    for each row
    
begin
    dbms_output.put_line('NEW EMPLOYEE DETAILS INSERTED');
    
end;