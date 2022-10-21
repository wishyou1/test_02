



/*create table `core_user` (
	`user_id` bigint (20),
	`user_name` varchar (192),
	`login_name` varchar (384),
	`password` varchar (96),
	`mobile` varchar (60),
	`email` varchar (150),
	`city` varchar (30),
	`join_time` datetime ,
	`last_login` datetime ,
	`user_status` varchar (3),
	`ct` datetime ,
	`ut` datetime ,
	`is_del` int (1),
	`version` bigint (20),
	`domain_id` varchar (300),
	`office_phone` varchar (765)
); 
insert into `core_user` (`user_id`, `user_name`, `login_name`, `password`, `mobile`, `email`, `city`, `join_time`, `last_login`, `user_status`, `ct`, `ut`, `is_del`, `version`, `domain_id`, `office_phone`) values('1','admin','admin','123456','13634322998','1542422412@qq.com','漳州1',NULL,'2022-03-24 09:44:32','N',NULL,'2022-03-24 09:44:32','0','1241','1234',NULL);
insert into `core_user` (`user_id`, `user_name`, `login_name`, `password`, `mobile`, `email`, `city`, `join_time`, `last_login`, `user_status`, `ct`, `ut`, `is_del`, `version`, `domain_id`, `office_phone`) values('2','gaomeng1','gaomeng1','123456','111221e',NULL,NULL,'2020-04-01 15:33:33','2021-04-20 09:57:04','N','2020-04-01 15:33:33','2021-04-20 09:57:04','0','111','1234',NULL);
*/
create table 'class'(
    'class_id' int (11),
    'class_name' char (100)
);
insert into 'class'('class_id','class_name') values ('3','三班');

create table 'student'(
                        'student_id' int (11),
                        'student_name' char (100)
);
insert into 'student'('student_id','student_name') values ('14','蒯');

create table 'contect_cs'(
                          'cs_id' int(11),
                          'class_id' int(11),
                          'student_id' int (11)
);
insert into 'contect_cs'('cs_id','class_id','student_id') values ('04','26','15') ;

create table 'teacher'(
                             'teacher_id' int(11),
                             'teacher_name' char(100)
);