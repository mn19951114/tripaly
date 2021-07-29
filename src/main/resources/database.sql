# create database triplay character set mb4;

drop table if exists user;
create table `user`(
  `user_id` int auto_increment primary key comment '用户id',
  `work_no` varchar(16) comment '工号',
  `name` varchar(32) comment '姓名',
  `email` varchar(32) comment '邮箱',
  `pwd` varchar(32) comment '密码',
  unique index (email) 
);
-- alter table user auto_increment=10000000;

drop table if exists activity;
create table `activity`(
  `activity_id` int auto_increment primary key comment '活动id',
  `creator_id` int comment '创建用户的id',
  `type` tinyint comment '活动类型',
  `name` varchar(32) comment '活动名称',
  `summary` varchar(128) comment '活动简介',
  `location` varchar(32) comment '活动地点',
  `create_time` datetime comment '创建时间',
  `start_time` datetime comment '开始时间',
  `end_time` datetime comment '结束时间',
  `expire_time` datetime comment '释放受邀锁定时间',
  `status` tinyint comment '活动状态',
  `participant_number` int comment '人数上限',
  `current_number` int comment '当前人数'
);

drop table if exists activity_user;
create table `activity_user`(
  `activity_user_id` int auto_increment primary key comment '活动用户关系对的id',
  `user_id` int comment '用户id',
  `activity_id` int comment '活动id',
  `invited_time` datetime comment '用户被邀请的时间',
  `join_time` datetime comment '用户加入的时间',
  `status` tinyint comment '当前这条记录的状态(被邀请中、待进行、进行中、已结束)',
  unique index (user_id, activity_id)
);

drop table if exists user_label;
create table `user_label`(
  `user_label_id` int auto_increment primary key comment '用户与其标签关系对的id',
  `user_id` int comment '用户id',
  `label_id` int comment '标签编号，所对应内容写在配置或者枚举中',
  unique index (user_id, label_id)
);

create table `label`(
	`lable_id` int auto_increment primary key comment '标签ID',
	`label_name` varchar(32) comment '标签名称',
	`label_type` int comment '标签大类'
);
