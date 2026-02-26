-- Last updated: 2/26/2026, 9:53:23 AM
# Write your MySQL query statement below
select product_id,year as first_year, quantity, price
from Sales
where(product_id, year) in (select  product_id, min(year) from Sales group by product_id)