create or replace procedure insert_credit
(
    credit_id in number,
    credit_card_number in varchar,
    credit_card_expire in varchar,
    holder_name in varchar,
    card_type in varchar
)
as
begin 
    insert into credit_card
    values (credit_id, credit_card_number, credit_card_expire, holder_name, card_type);
    
    commit;

end insert_credit;
/