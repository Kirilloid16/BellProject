-- Table: public.organization

-- DROP TABLE IF EXISTS public.organization;

CREATE TABLE IF NOT EXISTS public.organization
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    name character varying(100) COLLATE pg_catalog."default",
    full_name character(100) COLLATE pg_catalog."default",
    inn character(100) COLLATE pg_catalog."default",
    kpp character(100) COLLATE pg_catalog."default",
    address character(100) COLLATE pg_catalog."default",
    phone character(100) COLLATE pg_catalog."default",
    active character(100) COLLATE pg_catalog."default",
    CONSTRAINT "Organization_pkey" PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.organization
    OWNER to postgres;

-- Table: public.office

-- DROP TABLE IF EXISTS public.office;

CREATE TABLE IF NOT EXISTS public.office
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    org_id integer,
    name character(100) COLLATE pg_catalog."default",
    address character(100) COLLATE pg_catalog."default",
    phone character(100) COLLATE pg_catalog."default",
    isactive character(100) COLLATE pg_catalog."default",
    CONSTRAINT office_pkey PRIMARY KEY (id),
    CONSTRAINT org_id FOREIGN KEY (org_id)
        REFERENCES public.organization (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.office
    OWNER to postgres;

-- Table: public.country

-- DROP TABLE IF EXISTS public.country;

CREATE TABLE IF NOT EXISTS public.country
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    name character(100) COLLATE pg_catalog."default",
    code character(100) COLLATE pg_catalog."default",
    CONSTRAINT country_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.country
    OWNER to postgres;

-- Table: public.document_type

-- DROP TABLE IF EXISTS public.document_type;

CREATE TABLE IF NOT EXISTS public.document_type
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    doc_code character(100) COLLATE pg_catalog."default",
    doc_name character(100) COLLATE pg_catalog."default",
    CONSTRAINT "documentType_pkey" PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.document_type
    OWNER to postgres;

-- Table: public.user_document

-- DROP TABLE IF EXISTS public.user_document;

CREATE TABLE IF NOT EXISTS public.user_document
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    doc_type_id integer,
    doc_number character(100) COLLATE pg_catalog."default",
    doc_date character(100) COLLATE pg_catalog."default",
    CONSTRAINT "userDocument_pkey" PRIMARY KEY (id),
    CONSTRAINT doc_type_id FOREIGN KEY (doc_type_id)
        REFERENCES public.document_type (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION

)

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.user_document
    OWNER to postgres;

-- Table: public.user

-- DROP TABLE IF EXISTS public."user";

CREATE TABLE IF NOT EXISTS public."user"
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    office_id integer,
    first_name character(100) COLLATE pg_catalog."default",
    last_name character(100) COLLATE pg_catalog."default",
    middle_name character(100) COLLATE pg_catalog."default",
    "position" character(100) COLLATE pg_catalog."default",
    phone character(100) COLLATE pg_catalog."default",
    doc_id integer,
    country_id integer,
    CONSTRAINT user_pkey PRIMARY KEY (id),
    CONSTRAINT country FOREIGN KEY (country_id)
        REFERENCES public.country (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT doc_id FOREIGN KEY (doc_id)
        REFERENCES public.user_document (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT office_id FOREIGN KEY (office_id)
        REFERENCES public.office (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."user"
    OWNER to postgres;