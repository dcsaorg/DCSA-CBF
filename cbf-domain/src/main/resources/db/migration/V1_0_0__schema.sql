CREATE extension if NOT EXISTS "uuid-ossp";

CREATE TABLE carrier (
    id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    carrier_name varchar(100),
    smdg_code varchar(3) NULL,
    nmfta_code varchar(4) NULL
);
CREATE TABLE vessel (
    id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    vessel_imo_number varchar(7) NULL UNIQUE,
    vessel_name varchar(35) NULL,
    vessel_flag char(2) NULL,
    vessel_call_sign varchar(10) NULL,
    vessel_operator_carrier_id uuid NULL REFERENCES carrier (id),
    is_dummy boolean NOT NULL default false
);


CREATE TABLE location (
    id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    location_name varchar(100) NULL,
    latitude varchar(10) NULL,
    longitude varchar(11) NULL,
    un_location_code char(5) NULL
);

CREATE TABLE un_location (
    un_location_code char(5) PRIMARY KEY,
    un_location_name varchar(100) NULL,
    location_code char(3) NULL
);

CREATE TABLE facility (
    id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    facility_name varchar(100) NULL,
    un_location_code varchar(5) NULL,
    facility_bic_code varchar(4) NULL,
    facility_smdg_code varchar(6) NULL,
    location_id uuid NULL
);

CREATE TABLE forecast (
    id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    port_visit_reference varchar(50) NULL,
    transport_call_reference varchar(100) NULL,
    carrier_import_voyage_number varchar(50) NULL,
    carrier_export_voyage_number varchar(50) NULL,
    universal_import_voyage_reference varchar(5) NULL,
    universal_export_voyage_reference varchar(5) Null,
    location_id uuid NULL REFERENCES location(id),
    vessel_id uuid NULL REFERENCES vessel(id)
);


CREATE TABLE partner_identity(
    id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    code_list_provider varchar(10) NULL,
    code varchar(4) NULL,
    agreement_type_code varchar(4) NULL);

-- Add foreign key constraints after all tables have been created
ALTER TABLE location
    ADD CONSTRAINT fk_location_un_location
    FOREIGN KEY (un_location_code)
    REFERENCES un_location (un_location_code);

ALTER TABLE facility
    ADD CONSTRAINT fk_facility_un_location
    FOREIGN KEY (un_location_code)
    REFERENCES un_location (un_location_code);

ALTER TABLE facility
    ADD CONSTRAINT fk_facility_location
    FOREIGN KEY (location_id)
    REFERENCES location (id);








