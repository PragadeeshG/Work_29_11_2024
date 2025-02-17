create table if not exists metadata_renderness(
document_object_code bigint not null,
system_code bigint null,
metadata_code bigint null,
x_reference varchar(255) null,
json_data varchar(255) null,
metadata_name varchar(255) null,
workflow_id varchar(255) null,
remarks varchar(255) null,
description varchar(255) null,
availability bigint null,
is_active char null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint metadata_renderness_pk primary key(document_object_code));