declare

begin
    update department
    set location_id = 'HQ-BLR-101'
    where location_id like 'HQ%';
end;