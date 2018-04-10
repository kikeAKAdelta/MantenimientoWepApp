-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.9.0
-- PostgreSQL version: 9.6
-- Project Site: pgmodeler.com.br
-- Model Author: ---


-- Database creation must be done outside an multicommand file.
-- These commands were put in this file only for convenience.
-- -- object: mantenimiento | type: DATABASE --
-- -- DROP DATABASE IF EXISTS mantenimiento;
-- CREATE DATABASE mantenimiento
-- ;
-- -- ddl-end --
-- 

-- object: public.unidad | type: TABLE --
-- DROP TABLE IF EXISTS public.unidad CASCADE;
CREATE TABLE public.unidad(
	id_unidad serial NOT NULL,
	nombre_unidad varchar(100),
	CONSTRAINT unidad_pk PRIMARY KEY (id_unidad)

);
-- ddl-end --
ALTER TABLE public.unidad OWNER TO postgres;
-- ddl-end --

-- object: public.equipo | type: TABLE --
-- DROP TABLE IF EXISTS public.equipo CASCADE;
CREATE TABLE public.equipo(
	id_equipo serial NOT NULL,
	id_unidad integer,
	numero_inventario integer,
	descripcion varchar(100),
	CONSTRAINT "Equipo_pk" PRIMARY KEY (id_equipo)

);
-- ddl-end --
ALTER TABLE public.equipo OWNER TO postgres;
-- ddl-end --

-- object: public.calendario | type: TABLE --
-- DROP TABLE IF EXISTS public.calendario CASCADE;
CREATE TABLE public.calendario(
	id_calendario serial NOT NULL,
	fecha date,
	descripcion varchar(500),
	CONSTRAINT calendario_pk PRIMARY KEY (id_calendario)

);
-- ddl-end --
ALTER TABLE public.calendario OWNER TO postgres;
-- ddl-end --

-- object: public.responsable | type: TABLE --
-- DROP TABLE IF EXISTS public.responsable CASCADE;
CREATE TABLE public.responsable(
	id_responsable serial NOT NULL,
	identificador integer,
	docente boolean,
	CONSTRAINT responsable_pk PRIMARY KEY (id_responsable)

);
-- ddl-end --
ALTER TABLE public.responsable OWNER TO postgres;
-- ddl-end --

-- object: public.parte | type: TABLE --
-- DROP TABLE IF EXISTS public.parte CASCADE;
CREATE TABLE public.parte(
	id_parte serial NOT NULL,
	id_equipo integer,
	id_unidad integer,
	numero_inventario integer,
	marca varchar(100),
	modelo varchar(100),
	descripcion varchar(500),
	CONSTRAINT parte_pk PRIMARY KEY (id_parte)

);
-- ddl-end --
ALTER TABLE public.parte OWNER TO postgres;
-- ddl-end --

-- object: public.prioridad | type: TABLE --
-- DROP TABLE IF EXISTS public.prioridad CASCADE;
CREATE TABLE public.prioridad(
	id_prioridad serial NOT NULL,
	descripcion varchar(100),
	CONSTRAINT prioridad_pk PRIMARY KEY (id_prioridad)

);
-- ddl-end --
ALTER TABLE public.prioridad OWNER TO postgres;
-- ddl-end --

-- object: public.pasos | type: TABLE --
-- DROP TABLE IF EXISTS public.pasos CASCADE;
CREATE TABLE public.pasos(
	id_pasos serial NOT NULL,
	descripcion varchar(100),
	CONSTRAINT pasos_pk PRIMARY KEY (id_pasos)

);
-- ddl-end --
ALTER TABLE public.pasos OWNER TO postgres;
-- ddl-end --

-- object: public.diagnostico | type: TABLE --
-- DROP TABLE IF EXISTS public.diagnostico CASCADE;
CREATE TABLE public.diagnostico(
	id_diagnostico serial NOT NULL,
	descripcion varchar(100),
	CONSTRAINT diagnostico_pk PRIMARY KEY (id_diagnostico)

);
-- ddl-end --
ALTER TABLE public.diagnostico OWNER TO postgres;
-- ddl-end --

-- object: public.diagnostico_parte | type: TABLE --
-- DROP TABLE IF EXISTS public.diagnostico_parte CASCADE;
CREATE TABLE public.diagnostico_parte(
	id_diagnostico integer NOT NULL,
	id_parte integer NOT NULL,
	descripcion varchar(100),
	CONSTRAINT diagnostico_parte_pk PRIMARY KEY (id_diagnostico,id_parte)

);
-- ddl-end --
ALTER TABLE public.diagnostico_parte OWNER TO postgres;
-- ddl-end --

-- object: public.estado | type: TABLE --
-- DROP TABLE IF EXISTS public.estado CASCADE;
CREATE TABLE public.estado(
	id_estado serial NOT NULL,
	id_procedimiento integer,
	descripcion varchar(100),
	CONSTRAINT estado_pk PRIMARY KEY (id_estado)

);
-- ddl-end --
ALTER TABLE public.estado OWNER TO postgres;
-- ddl-end --

-- object: public.procedimiento | type: TABLE --
-- DROP TABLE IF EXISTS public.procedimiento CASCADE;
CREATE TABLE public.procedimiento(
	id_procedimiento serial NOT NULL,
	id_diagnostico integer,
	descripcion varchar(100),
	CONSTRAINT procedimiento_pk PRIMARY KEY (id_procedimiento)

);
-- ddl-end --
ALTER TABLE public.procedimiento OWNER TO postgres;
-- ddl-end --

-- object: public.excepcion_calendario | type: TABLE --
-- DROP TABLE IF EXISTS public.excepcion_calendario CASCADE;
CREATE TABLE public.excepcion_calendario(
	id_excepcion serial NOT NULL,
	fecha date,
	CONSTRAINT excepcion_calendario_pk PRIMARY KEY (id_excepcion)

);
-- ddl-end --
ALTER TABLE public.excepcion_calendario OWNER TO postgres;
-- ddl-end --

-- object: public.pasos_procedimiento | type: TABLE --
-- DROP TABLE IF EXISTS public.pasos_procedimiento CASCADE;
CREATE TABLE public.pasos_procedimiento(
	id_pasos integer NOT NULL,
	id_procedimiento integer NOT NULL,
	CONSTRAINT pasos_procedimiento_pk PRIMARY KEY (id_pasos,id_procedimiento)

);
-- ddl-end --
ALTER TABLE public.pasos_procedimiento OWNER TO postgres;
-- ddl-end --

-- object: public.subtipo_mtto | type: TABLE --
-- DROP TABLE IF EXISTS public.subtipo_mtto CASCADE;
CREATE TABLE public.subtipo_mtto(
	idsubtipo_mtto serial NOT NULL,
	id_tipomtto integer NOT NULL,
	descripcion varchar(100),
	CONSTRAINT subtipo_mtto_pk PRIMARY KEY (idsubtipo_mtto,id_tipomtto)

);
-- ddl-end --
ALTER TABLE public.subtipo_mtto OWNER TO postgres;
-- ddl-end --

-- object: public.tipomtto | type: TABLE --
-- DROP TABLE IF EXISTS public.tipomtto CASCADE;
CREATE TABLE public.tipomtto(
	id_tipomtto serial NOT NULL,
	descripcion varchar(100),
	CONSTRAINT tipomtto_pk PRIMARY KEY (id_tipomtto)

);
-- ddl-end --
ALTER TABLE public.tipomtto OWNER TO postgres;
-- ddl-end --

-- object: public.solicitud | type: TABLE --
-- DROP TABLE IF EXISTS public.solicitud CASCADE;
CREATE TABLE public.solicitud(
	id_solicitud serial NOT NULL,
	id_unidad integer,
	solicitante varchar(100),
	descripcion varchar(100),
	fecha date,
	CONSTRAINT solicitud_pk PRIMARY KEY (id_solicitud)

);
-- ddl-end --
ALTER TABLE public.solicitud OWNER TO postgres;
-- ddl-end --

-- object: public.mtto_detalle | type: TABLE --
-- DROP TABLE IF EXISTS public.mtto_detalle CASCADE;
CREATE TABLE public.mtto_detalle(
	id_parte integer,
	id_estado integer,
	id_responsable integer,
	id_mtto_detalle serial NOT NULL,
	CONSTRAINT mtto_detalle_pk PRIMARY KEY (id_mtto_detalle)

);
-- ddl-end --
ALTER TABLE public.mtto_detalle OWNER TO postgres;
-- ddl-end --

-- object: public.orden_trabajo | type: TABLE --
-- DROP TABLE IF EXISTS public.orden_trabajo CASCADE;
CREATE TABLE public.orden_trabajo(
	id_orden_trabajo serial NOT NULL,
	id_solicitud integer,
	id_calendario integer,
	id_prioridad integer,
	id_tipomtto integer,
	descripcion varchar(100),
	CONSTRAINT orden_trabajo_pk PRIMARY KEY (id_orden_trabajo)

);
-- ddl-end --
ALTER TABLE public.orden_trabajo OWNER TO postgres;
-- ddl-end --

-- object: public.detalle_orden_trabajo | type: TABLE --
-- DROP TABLE IF EXISTS public.detalle_orden_trabajo CASCADE;
CREATE TABLE public.detalle_orden_trabajo(
	id_mtto_detalle integer,
	id_orden_trabajo integer,
	id_detalle_orden_trabajo serial NOT NULL,
	CONSTRAINT detalle_orden_trabajo_pk PRIMARY KEY (id_detalle_orden_trabajo)

);
-- ddl-end --
ALTER TABLE public.detalle_orden_trabajo OWNER TO postgres;
-- ddl-end --

-- object: public.estado_detalle_orden_trabajo | type: TABLE --
-- DROP TABLE IF EXISTS public.estado_detalle_orden_trabajo CASCADE;
CREATE TABLE public.estado_detalle_orden_trabajo(
	id_estado integer NOT NULL,
	id_detalle_orden_trabajo integer NOT NULL,
	CONSTRAINT estado_detalle_orden_trabajo_pk PRIMARY KEY (id_estado,id_detalle_orden_trabajo)

);
-- ddl-end --
ALTER TABLE public.estado_detalle_orden_trabajo OWNER TO postgres;
-- ddl-end --

-- object: fk_unidad | type: CONSTRAINT --
-- ALTER TABLE public.equipo DROP CONSTRAINT IF EXISTS fk_unidad CASCADE;
ALTER TABLE public.equipo ADD CONSTRAINT fk_unidad FOREIGN KEY (id_unidad)
REFERENCES public.unidad (id_unidad) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_unidad | type: CONSTRAINT --
-- ALTER TABLE public.parte DROP CONSTRAINT IF EXISTS fk_unidad CASCADE;
ALTER TABLE public.parte ADD CONSTRAINT fk_unidad FOREIGN KEY (id_unidad)
REFERENCES public.unidad (id_unidad) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_equipo | type: CONSTRAINT --
-- ALTER TABLE public.parte DROP CONSTRAINT IF EXISTS fk_equipo CASCADE;
ALTER TABLE public.parte ADD CONSTRAINT fk_equipo FOREIGN KEY (id_equipo)
REFERENCES public.equipo (id_equipo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_diagnostico | type: CONSTRAINT --
-- ALTER TABLE public.diagnostico_parte DROP CONSTRAINT IF EXISTS fk_diagnostico CASCADE;
ALTER TABLE public.diagnostico_parte ADD CONSTRAINT fk_diagnostico FOREIGN KEY (id_diagnostico)
REFERENCES public.diagnostico (id_diagnostico) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_parte | type: CONSTRAINT --
-- ALTER TABLE public.diagnostico_parte DROP CONSTRAINT IF EXISTS fk_parte CASCADE;
ALTER TABLE public.diagnostico_parte ADD CONSTRAINT fk_parte FOREIGN KEY (id_parte)
REFERENCES public.parte (id_parte) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_procedimiento | type: CONSTRAINT --
-- ALTER TABLE public.estado DROP CONSTRAINT IF EXISTS fk_procedimiento CASCADE;
ALTER TABLE public.estado ADD CONSTRAINT fk_procedimiento FOREIGN KEY (id_procedimiento)
REFERENCES public.procedimiento (id_procedimiento) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_diagnostico | type: CONSTRAINT --
-- ALTER TABLE public.procedimiento DROP CONSTRAINT IF EXISTS fk_diagnostico CASCADE;
ALTER TABLE public.procedimiento ADD CONSTRAINT fk_diagnostico FOREIGN KEY (id_diagnostico)
REFERENCES public.diagnostico (id_diagnostico) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_pasos | type: CONSTRAINT --
-- ALTER TABLE public.pasos_procedimiento DROP CONSTRAINT IF EXISTS fk_pasos CASCADE;
ALTER TABLE public.pasos_procedimiento ADD CONSTRAINT fk_pasos FOREIGN KEY (id_pasos)
REFERENCES public.pasos (id_pasos) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_procedimieno | type: CONSTRAINT --
-- ALTER TABLE public.pasos_procedimiento DROP CONSTRAINT IF EXISTS fk_procedimieno CASCADE;
ALTER TABLE public.pasos_procedimiento ADD CONSTRAINT fk_procedimieno FOREIGN KEY (id_procedimiento)
REFERENCES public.procedimiento (id_procedimiento) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_tipommto | type: CONSTRAINT --
-- ALTER TABLE public.subtipo_mtto DROP CONSTRAINT IF EXISTS fk_tipommto CASCADE;
ALTER TABLE public.subtipo_mtto ADD CONSTRAINT fk_tipommto FOREIGN KEY (id_tipomtto)
REFERENCES public.tipomtto (id_tipomtto) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_unidad | type: CONSTRAINT --
-- ALTER TABLE public.solicitud DROP CONSTRAINT IF EXISTS fk_unidad CASCADE;
ALTER TABLE public.solicitud ADD CONSTRAINT fk_unidad FOREIGN KEY (id_unidad)
REFERENCES public.unidad (id_unidad) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_parte | type: CONSTRAINT --
-- ALTER TABLE public.mtto_detalle DROP CONSTRAINT IF EXISTS fk_parte CASCADE;
ALTER TABLE public.mtto_detalle ADD CONSTRAINT fk_parte FOREIGN KEY (id_parte)
REFERENCES public.parte (id_parte) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_estado | type: CONSTRAINT --
-- ALTER TABLE public.mtto_detalle DROP CONSTRAINT IF EXISTS fk_estado CASCADE;
ALTER TABLE public.mtto_detalle ADD CONSTRAINT fk_estado FOREIGN KEY (id_estado)
REFERENCES public.estado (id_estado) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_responsable | type: CONSTRAINT --
-- ALTER TABLE public.mtto_detalle DROP CONSTRAINT IF EXISTS fk_responsable CASCADE;
ALTER TABLE public.mtto_detalle ADD CONSTRAINT fk_responsable FOREIGN KEY (id_responsable)
REFERENCES public.responsable (id_responsable) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_prioridad | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo DROP CONSTRAINT IF EXISTS fk_prioridad CASCADE;
ALTER TABLE public.orden_trabajo ADD CONSTRAINT fk_prioridad FOREIGN KEY (id_prioridad)
REFERENCES public.prioridad (id_prioridad) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_solicitud | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo DROP CONSTRAINT IF EXISTS fk_solicitud CASCADE;
ALTER TABLE public.orden_trabajo ADD CONSTRAINT fk_solicitud FOREIGN KEY (id_solicitud)
REFERENCES public.solicitud (id_solicitud) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_calendario | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo DROP CONSTRAINT IF EXISTS fk_calendario CASCADE;
ALTER TABLE public.orden_trabajo ADD CONSTRAINT fk_calendario FOREIGN KEY (id_calendario)
REFERENCES public.calendario (id_calendario) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_tipomtto | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo DROP CONSTRAINT IF EXISTS fk_tipomtto CASCADE;
ALTER TABLE public.orden_trabajo ADD CONSTRAINT fk_tipomtto FOREIGN KEY (id_tipomtto)
REFERENCES public.tipomtto (id_tipomtto) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_mtto_detalle | type: CONSTRAINT --
-- ALTER TABLE public.detalle_orden_trabajo DROP CONSTRAINT IF EXISTS fk_mtto_detalle CASCADE;
ALTER TABLE public.detalle_orden_trabajo ADD CONSTRAINT fk_mtto_detalle FOREIGN KEY (id_mtto_detalle)
REFERENCES public.mtto_detalle (id_mtto_detalle) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_orden_trabajo | type: CONSTRAINT --
-- ALTER TABLE public.detalle_orden_trabajo DROP CONSTRAINT IF EXISTS fk_orden_trabajo CASCADE;
ALTER TABLE public.detalle_orden_trabajo ADD CONSTRAINT fk_orden_trabajo FOREIGN KEY (id_orden_trabajo)
REFERENCES public.orden_trabajo (id_orden_trabajo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_estado | type: CONSTRAINT --
-- ALTER TABLE public.estado_detalle_orden_trabajo DROP CONSTRAINT IF EXISTS fk_estado CASCADE;
ALTER TABLE public.estado_detalle_orden_trabajo ADD CONSTRAINT fk_estado FOREIGN KEY (id_estado)
REFERENCES public.estado (id_estado) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_detalle_orde_trabajo | type: CONSTRAINT --
-- ALTER TABLE public.estado_detalle_orden_trabajo DROP CONSTRAINT IF EXISTS fk_detalle_orde_trabajo CASCADE;
ALTER TABLE public.estado_detalle_orden_trabajo ADD CONSTRAINT fk_detalle_orde_trabajo FOREIGN KEY (id_detalle_orden_trabajo)
REFERENCES public.detalle_orden_trabajo (id_detalle_orden_trabajo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --


