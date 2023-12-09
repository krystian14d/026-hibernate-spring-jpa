-- ok. 7,5s
select ol1_0.order_header_id,
       ol1_0.id,
       ol1_0.created_date,
       ol1_0.last_modified_date,
       p1_0.id,
       p1_0.created_date,
       p1_0.description,
       p1_0.last_modified_date,
       p1_0.product_status,
       ol1_0.quantity_ordered
from order_line ol1_0
         left join product p1_0 on p1_0.id = ol1_0.product_id
where ol1_0.order_header_id = ?;


-- @Fetch(FetchMode.SUBSELECT) - 5,5s
select ol1_0.order_header_id,
       ol1_0.id,
       ol1_0.created_date,
       ol1_0.last_modified_date,
       p1_0.id,
       p1_0.created_date,
       p1_0.description,
       p1_0.last_modified_date,
       p1_0.product_status,
       ol1_0.quantity_ordered
from order_line ol1_0
         left join product p1_0 on p1_0.id = ol1_0.product_id
where ol1_0.order_header_id in (select oh1_0.id from order_header oh1_0 where oh1_0.customer_id = ?);

-- @Fetch(FetchMode.JOIN) - 8,2s
select ol1_0.order_header_id,
       ol1_0.id,
       ol1_0.created_date,
       ol1_0.last_modified_date,
       p1_0.id,
       p1_0.created_date,
       p1_0.description,
       p1_0.last_modified_date,
       p1_0.product_status,
       ol1_0.quantity_ordered
from order_line ol1_0
         left join product p1_0 on p1_0.id = ol1_0.product_id
where ol1_0.order_header_id = ?;

-- @Fetch(FetchMode.SELECT) - 7,8s
select ol1_0.order_header_id,
       ol1_0.id,
       ol1_0.created_date,
       ol1_0.last_modified_date,
       p1_0.id,
       p1_0.created_date,
       p1_0.description,
       p1_0.last_modified_date,
       p1_0.product_status,
       ol1_0.quantity_ordered
from order_line ol1_0
         left join product p1_0 on p1_0.id = ol1_0.product_id
where ol1_0.order_header_id = ?

-- @Fetch(FetchMode.SUBSELECT) - na orderLines
-- @Fetch(FetchMode.SELECT) + usunięte mappedBy na OrderApproval - 1,3s
select oh1_0.id,
       oh1_0.bill_to_address,
       oh1_0.bill_to_city,
       oh1_0.bill_to_state,
       oh1_0.bill_to_zip_code,
       oh1_0.created_date,
       oh1_0.customer_id,
       oh1_0.last_modified_date,
       oh1_0.order_approval_id,
       oh1_0.order_status,
       oh1_0.shipping_address,
       oh1_0.shipping_city,
       oh1_0.shipping_state,
       oh1_0.shipping_zip_code
from order_header oh1_0
where oh1_0.customer_id = ?

-- @Fetch(FetchMode.SUBSELECT) - na orderLines
-- @Fetch(FetchMode.SELECT) + bez usuniętego mappedBy na OrderApproval - 5,6s
select oa1_0.id,
       oa1_0.approved_by,
       oa1_0.created_date,
       oa1_0.last_modified_date,
       oh1_0.id,
       oh1_0.bill_to_address,
       oh1_0.bill_to_city,
       oh1_0.bill_to_state,
       oh1_0.bill_to_zip_code,
       oh1_0.created_date,
       oh1_0.customer_id,
       oh1_0.last_modified_date,
       oh1_0.order_status,
       oh1_0.shipping_address,
       oh1_0.shipping_city,
       oh1_0.shipping_state,
       oh1_0.shipping_zip_code
from order_approval oa1_0
         left join order_header oh1_0 on oh1_0.id = oa1_0.order_header_id
where oa1_0.order_header_id = ?



