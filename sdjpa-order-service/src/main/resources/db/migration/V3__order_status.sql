alter table order_header
    add column order_status ENUM('NEW', 'IN_PROCESS', 'COMPLETE');