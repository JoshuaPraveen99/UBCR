
use providerdb;
drop table if exists registration;
create table registration(
p_ID INT AUTO_INCREMENT not null primary key,
p_NAME VARCHAR(30) not null,
EMAIL VARCHAR(30) not null,
Contact Double not null,
Address varchar(30) not null,
p_Image mediumblob ,
carType varchar(10) not null,
carModel varchar(10) not null,
regNum varchar(15) not null,
car_Image mediumblob,
lisence_num varchar(15) not null,
lisence_Image mediumblob,
rc_num varchar(15) not null,
rc_Photo mediumblob,
username varchar(30) not null,
password varchar(30) not null);
insert into registration values(
1000, 'Joshua', 'joshuapraveen99@gmail.com' , 8925371868,'Vandalur', load_file("C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\Profile pic.jpg"),
'suv','HondaCity','TN 24 A 0001',load_file("C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\Profile pic.jpg"),'TN18KM24255',
load_file("C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\Profile pic.jpg"),'133HKD456FH25',load_file("C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\Profile pic.jpg"),'joshua33','poster');
commit;