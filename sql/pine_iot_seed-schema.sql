drop database if exists pine_iot_seed;
drop user 'pine-iot-seed'@'127.0.0.1';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database pine_iot_seed default character set utf8mb4 collate utf8mb4_unicode_ci;
use pine_iot_seed;
create user 'pine-iot-seed'@'127.0.0.1' identified by 'pine-iot-seed123456';
grant all privileges on pine_iot_seed.* to 'pine-iot-seed'@'127.0.0.1';
create user 'pine-iot-seed'@'%' identified by 'pine-iot-seed123456';
grant all privileges on pine_iot_seed.* to 'pine-iot-seed'@'%';
flush privileges;