create table if not exists renderness(
document_object_code bigint not null,
document_object_name varchar(255) null,
document_object_desc varchar(255) null,
remarks varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint renderness_pk primary key(document_object_code));