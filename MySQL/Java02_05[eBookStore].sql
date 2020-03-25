create table khach_hang (
    id int auto_increment primary key,
    ten_kh varchar(255) not null ,
    dia_chi_giao_hang text not null ,
    so_dien_thoai varchar(50) not null
);
create table the_loai (
    id int auto_increment,
    loai_sach varchar(255) not null ,
    primary key (id)
);
create table tac_gia(
    id int auto_increment,
    ten_tg varchar(255) not null ,
    so_luoc_tg text,
    primary key (id)
);
create table nha_xuat_ban(
    id int auto_increment,
    ten_nxb varchar(255) not null ,
    dia_chi_nxb text not null ,
    primary key (id)
);
create table sach (
    id int,
    ten_sach varchar(50) not null ,
    nam_xuat_ban year,
    so_lan_xuat_ban int,
    gia decimal(12,0) not null check ( gia >= 0 ),
    so_luong int not null check ( so_luong >= 0 ),
    tl_id int not null references the_loai(id),
    tg_id int not null references tac_gia(id),
    nxb_id int not null references nha_xuat_ban(id),
    primary key (id)
);
create table don_hang (
    id int not null auto_increment primary key,
    trang_thai int not null,
    ngay_chot_don date not null ,
    ngay_nhan_hang date not null ,
    tong_tien decimal(12,0) check ( tong_tien >= 0),
    kh_id int not null references khach_hang(id)
);
create table don_hang_chi_tiet (
    sach_id int not null references sach(id),
    don_hang_id int not null references don_hang(id),
    so_luong int not null check ( so_luong >= 0 ),
    gia decimal(12,0) check ( gia >= 0 ),
    giam_gia tinyint check ( giam_gia >= 0 && giam_gia <=100 )
);

insert into nha_xuat_ban(ten_nxb,dia_chi_nxb) values ('Tri Thuc','53 Nguyen Du, Hai Ba Trung, Ha Noi');
insert into nha_xuat_ban(ten_nxb,dia_chi_nxb) values ('The gioi','03 Nguyen Trai, Thanh Xuan, Ha Noi');
insert into nha_xuat_ban(ten_nxb,dia_chi_nxb) values ('Kim Đong','43 Nguyen Hue, Ba Dinh, Ha Noi');
insert into nha_xuat_ban(ten_nxb,dia_chi_nxb) values ('Thanh nien','513 Nguyen Huu Tho, Dong Da, Ha Noi');

insert into tac_gia(ten_tg) values ('Eran Katz');
insert into tac_gia(ten_tg) values ('Nguyen Nhat Anh');
insert into tac_gia(ten_tg) values ('Arthur Conan Doyle');
insert into tac_gia(ten_tg) values ('stephen hawking');

insert into the_loai(loai_sach) values ('Khoa Hoc Xa Hoi');
insert into the_loai(loai_sach) values ('Hoi ky');
insert into the_loai(loai_sach) values ('Truyen');
insert into the_loai(loai_sach) values ('Tieu thuyet');

insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (1,'Tri tue Do Thai','2010',1,79000,100,1,1,1);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (2,'My Brief History','2013',1,179000,10,2,4,2);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (3,'Lo den','2016',1,70000,50,2,4,1);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (4,'The Grand Design','2010',1,109000,20,2,4,1);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (5,'Toi thay hoa vang tren co xanh','2010',1,179000,100,3,2,3);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (6,'Cho toi xin mot ve đi tuoi tho','2008',1,179000,100,3,2,3);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (7,'Toi là Beto','2010',1,179000,100,3,2,3);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (8,'Ngoi khoc tren cay','2013',1,179000,100,3,2,3);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (9,'The Adventures of Sherlock Holmes','2011',1,139000,100,4,3,4);
insert into sach(id,ten_sach,nam_xuat_ban,so_lan_xuat_ban,gia,so_luong,nxb_id,tg_id,tl_id)
     values (10,'Sherlock Holmes: the Complete Collection','2013',1,159000,100,4,3,4);

insert into khach_hang(ten_kh,dia_chi_giao_hang,so_dien_thoai) values ('Nguyen Van An','111 Nguyen Trai, Thanh Xuan, Ha Noi',987654321);
insert into khach_hang(ten_kh,dia_chi_giao_hang,so_dien_thoai) values ('le loi','111 Nguyen du, dong da, Ha Noi',123456789);

insert into don_hang(ngay_chot_don,ngay_nhan_hang,trang_thai,kh_id) values ('2019-01-18','2020-01-20',5,1);
insert into don_hang(ngay_chot_don,ngay_nhan_hang,trang_thai,kh_id) values ('2020-01-20','2020-01-22',3,2);
insert into don_hang(ngay_chot_don,ngay_nhan_hang,trang_thai,kh_id) values ('2019-01-25','2020-01-29',1,2);
insert into don_hang(ngay_chot_don,ngay_nhan_hang,trang_thai,kh_id) values ('2019-01-25','2020-01-29',4,1);
insert into don_hang(ngay_chot_don,ngay_nhan_hang,trang_thai,kh_id) values ('2019-01-25','2020-01-29',2,1);
insert into don_hang(ngay_chot_don,ngay_nhan_hang,trang_thai,kh_id) values ('2019-01-25','2020-01-29',0,2);

insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (1,1,2,10);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (2,1,1,0);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (5,1,1,20);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (8,1,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (10,2,2,15);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (9,2,3,30);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (3,2,1,10);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (4,2,1,10);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (6,2,1,10);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (3,3,2,10);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (4,3,4,0);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (7,3,3,20);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (1,3,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (2,4,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (3,4,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (4,4,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (5,5,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (5,5,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (6,5,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (7,5,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (8,5,2,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (9,6,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (10,6,1,5);
insert into don_hang_chi_tiet(sach_id, don_hang_id, so_luong, giam_gia) values (4,6,1,5);
update don_hang_chi_tiet,sach
     set don_hang_chi_tiet.gia = sach.gia * don_hang_chi_tiet.so_luong - sach.gia * don_hang_chi_tiet.so_luong*giam_gia/100
     where don_hang_chi_tiet.sach_id = sach.id;
update don_hang_chi_tiet,don_hang
    set tong_tien = (select sum(gia) from don_hang_chi_tiet where don_hang.id = don_hang_chi_tiet.don_hang_id)
    where don_hang.id = don_hang_chi_tiet.don_hang_id;

------2------

select * from sach order by nam_xuat_ban desc limit 3;
select sach.*,sum(don_hang_chi_tiet.so_luong) as da_ban from sach,don_hang_chi_tiet
where don_hang_id in (select id from don_hang where trang_thai = 5) and id=sach_id
group by don_hang_chi_tiet.sach_id order by da_ban desc limit 5;

create procedure SP_Tim_TL (in ls varchar(255))
select * from sach where tl_id = (select id from the_loai where loai_sach like ls);
call SP_Tim_TL('tieu thuyet');

create procedure SP_Tim_TG (in tg varchar(255))
select * from sach where tg_id = (select id from tac_gia where ten_tg like tg);
call SP_Tim_TG('nguyen nhat anh');

create procedure SP_Tim_ID (in id_sach int)
select * from sach where id = id_sach;
call SP_Tim_ID(2);

------3------

select don_hang.* from don_hang where trang_thai = 1;
select kh_id,don_hang.* from don_hang,khach_hang where kh_id = khach_hang.id order by kh_id asc;
select id,trang_thai from don_hang order by id asc;
create procedure SP_HienThi_ID (in id_dh int)
select * from don_hang where id = id_dh;
call SP_HienThi_ID(2);
select don_hang.* from don_hang where trang_thai = 2;
select don_hang.* from don_hang where trang_thai = 3;
select don_hang.* from don_hang where trang_thai = 4;
select don_hang.* from don_hang where trang_thai = 5;
select don_hang.* from don_hang where trang_thai = 0;

