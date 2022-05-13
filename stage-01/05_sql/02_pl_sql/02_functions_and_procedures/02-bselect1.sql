create or replace procedure select_city
(
    user_id in number,
    city_details out varchar
)
as
begin
    select city into city_details
    from contact
    where id = user_id;
    
    if city_details = 'Bangalore' or city_details = 'Chennai'
    then
        city_details := 'User is from ' || city_details;
    else
        city_details := 'User is from other cities';
    end if;
    
end select_city;
/