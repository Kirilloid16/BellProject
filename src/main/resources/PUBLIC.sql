CREATE TABLE IF NOT EXISTS public."Organization"
(
    id integer GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    name character(30) COLLATE pg_catalog."default",
    fullname character(30) COLLATE pg_catalog."default",
    inn character(12) COLLATE pg_catalog."default",
    kpp character(9) COLLATE pg_catalog."default",
    address character(40) COLLATE pg_catalog."default",
    phone character(12) COLLATE pg_catalog."default",
    "isActive" character(12) COLLATE pg_catalog."default",
    CONSTRAINT "Organization_pkey" PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public."Office"
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    "orgId" integer,
    name character(30) COLLATE pg_catalog."default",
    address character(30) COLLATE pg_catalog."default",
    "isActive" character(30) COLLATE pg_catalog."default",
    CONSTRAINT "Office_pkey" PRIMARY KEY (id),
    CONSTRAINT "orgId" FOREIGN KEY ("orgId")
        REFERENCES public."Organization" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE IF NOT EXISTS public."documentType"
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    "docName" character(30) COLLATE pg_catalog."default",
    "docCode" character(30) COLLATE pg_catalog."default",
    CONSTRAINT "documentType_pkey" PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.countries
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    "citizenShipName" character(30) COLLATE pg_catalog."default",
    "citizenShipCode" character(30) COLLATE pg_catalog."default",
    CONSTRAINT countries_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public."User"
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    "OffId" bigint,
    "firstName" character(30) COLLATE pg_catalog."default",
    "lastName" character(30) COLLATE pg_catalog."default",
    "middleName" character(30) COLLATE pg_catalog."default",
    "position" character(30) COLLATE pg_catalog."default",
    phone character(30) COLLATE pg_catalog."default",
    "docId" integer,
    "countryId" integer,
    CONSTRAINT "User_pkey" PRIMARY KEY (id),
    CONSTRAINT "OffId" FOREIGN KEY ("OffId")
        REFERENCES public."Office" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT "countryId" FOREIGN KEY ("countryId")
        REFERENCES public.countries (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
CREATE TABLE IF NOT EXISTS public."userDocument"
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    "userId" integer,
    "docTypeId" integer,
    "docNumber" character(30) COLLATE pg_catalog."default",
    "docDate" character(30) COLLATE pg_catalog."default",
    CONSTRAINT "userDocument_pkey" PRIMARY KEY (id),
    CONSTRAINT "docTypeId" FOREIGN KEY ("docTypeId")
        REFERENCES public."documentType" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT "userId" FOREIGN KEY ("userId")
        REFERENCES public."User" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION

);



