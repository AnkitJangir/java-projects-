DataBase Name: travel
Tables : entry,seat,service,suggestion,user,vehicle


Create Query:
1).create table entry(eid int(10) primary key,ename varchar(45),epass varchar(45),eemail varchar(45));
2).create table seat(sid int(10) primary key,busno varchar(45),seatno varchar(45),seatstatus varchar(45));
3).create table service(sid int(10) primary key,sfrom varchar(45),sto varchar(45),sfare varchar(45),stime varchar(45),sstatus varchar(45),stype varchar(45));
4).create table suggestion(sid int(10) primary key,qname varchar(45),qsuggestion varchar(45));
5).create table user(uid int(10) primary key,uname varchar(45),uphoneno varchar(45),uage varchar(45),uemailid varchar(45),busid varchar(45),seatno varchar(45),uto varchar(45),ufrom varchar(45));
6).create table vehicle(vid int(10) primary key,vtype varchar(45),vowner varchar(45),vstatus varchar(45),vseat varchar(45));


Insert Query:
1).insert into entry(ename,epass,eemail)values(suman,dsd,dhfd@yahoo.com);
2).insert into seat(busno,seatno,seatstatus)values(1,1,f);
3).insert into service(sfrom,sto,sfare,stime,sstatus,stype)values(jaipur,ajmer,200,7:00Am,running,bus);
4).insert into suggestion(qname,qsuggestion)values(jaish,the facilities were awesome);
5).insert into user(uname,uphoneno,uage,uemailid,busid,seatno,uto,ufrom)values(ekta,454657,18,e@gmail.com,3,2,pilani,jaipur,);
6).insert into vehicle(vtype,vowner,vstatus,vseat)values(car,self,running,3,)

Database View:
entry table :
eid   ename   epass   eemail
1     suman   dsd     dhfd@yahoo.com

seat table :
sid   busno   seatno  seatstatus 
1     1       1       f

service table :
sid   sfrom   sto     sfare   stime   sstatus   stype
1     jaipur  ajmer   200     7:00Am  running   bus

suggestion table
sid   qname   qsuggestion
1     jaish   the facilities were awesome

user table
uid   uname   uphoneno  uage   uemailid     busid   seatno   uto     ufrom
1     ekta    454657    18     e@gmail.com  3       2        pilani  jaipur

vehicle table
vid   vtype   vowner    vstatus   vseat
1     car     self      running   3