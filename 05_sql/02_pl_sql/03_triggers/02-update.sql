create or replace package emp_designation

as

procedure emp_details
(
    design in employee.designation%type,
    incentive in number
);

end emp_designation;
/


create or replace package body emp_designation
as

procedure emp_details
(
    design in employee.designation%type,
    incentive in number
)
as
    rec_count number := 0;
    
begin
    select count(*) into rec_count
    from employee
    where designation = design;
    
    update employee
    set salary = salary + incentive
    where designation = design;
    
    commit;
    
    dbms_output.put_line(rec_count || ' employee(s) are updated.');
end emp_details;

end emp_designation;
/