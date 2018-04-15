PGDMP     )                    v            MantenimientoTPI    9.6.7    9.6.7 N    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �           1262    16403    MantenimientoTPI    DATABASE     �   CREATE DATABASE "MantenimientoTPI" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'es_SV.UTF-8' LC_CTYPE = 'es_SV.UTF-8';
 "   DROP DATABASE "MantenimientoTPI";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            �           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12393    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            �           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16501    asuetos    TABLE     _   CREATE TABLE asuetos (
    id_asueto integer NOT NULL,
    fecha date,
    descripcion text
);
    DROP TABLE public.asuetos;
       public         postgres    false    3            �            1259    16509 
   calendario    TABLE     �   CREATE TABLE calendario (
    id_calendario integer NOT NULL,
    fecha_inicio date,
    decripcion text,
    responsable text,
    telefono text,
    fecha_fin date,
    cantidad integer,
    id_asuetos integer
);
    DROP TABLE public.calendario;
       public         postgres    false    3            �            1259    16540    cargo    TABLE     y   CREATE TABLE cargo (
    id_cargo integer NOT NULL,
    cargo text,
    descripcion text,
    id_trabajadores integer
);
    DROP TABLE public.cargo;
       public         postgres    false    3            �            1259    16428    detalle_equipo    TABLE     �   CREATE TABLE detalle_equipo (
    id_detalle_equipo integer NOT NULL,
    dispositivo text,
    descripcion text,
    id_marca integer,
    id_modelo integer,
    id_equipo integer
);
 "   DROP TABLE public.detalle_equipo;
       public         postgres    false    3            �            1259    16571    detalle_mantenimiento    TABLE     �   CREATE TABLE detalle_mantenimiento (
    id_detalle_mantenimiento integer NOT NULL,
    "hardware/software" text,
    detalle_harware text,
    detalle_software text,
    id_orden_trabajo integer
);
 )   DROP TABLE public.detalle_mantenimiento;
       public         postgres    false    3            �            1259    16597    diagnostico    TABLE     �   CREATE TABLE diagnostico (
    id_diagnostico integer NOT NULL,
    diagnostico text,
    id_procedimiento integer,
    id_diagnostico_parte integer
);
    DROP TABLE public.diagnostico;
       public         postgres    false    3            �            1259    16467    diagnostico_parte    TABLE     v   CREATE TABLE diagnostico_parte (
    id_diagnostico_parte integer NOT NULL,
    parte text,
    observaciones text
);
 %   DROP TABLE public.diagnostico_parte;
       public         postgres    false    3            �            1259    16420    equipo    TABLE     Y   CREATE TABLE equipo (
    id_equipo integer NOT NULL,
    serie text,
    unidad text
);
    DROP TABLE public.equipo;
       public         postgres    false    3            �            1259    16615    estado_detalle_mantenimiento    TABLE     �   CREATE TABLE estado_detalle_mantenimiento (
    id_estado_detalle_mantenimiento integer NOT NULL,
    estado text,
    observaciones text,
    id_detalle_mantenimiento integer,
    id_procedimiento integer
);
 0   DROP TABLE public.estado_detalle_mantenimiento;
       public         postgres    false    3            �            1259    16404    marca    TABLE     \   CREATE TABLE marca (
    id_marca integer NOT NULL,
    marca text,
    descripcion text
);
    DROP TABLE public.marca;
       public         postgres    false    3            �            1259    16412    modelo    TABLE     _   CREATE TABLE modelo (
    id_modelo integer NOT NULL,
    modelo text,
    descripcion text
);
    DROP TABLE public.modelo;
       public         postgres    false    3            �            1259    16522    orden_trabajo    TABLE     �   CREATE TABLE orden_trabajo (
    id_orden_trabajo integer NOT NULL,
    fecha_inicio date,
    prioridad text,
    id_solicitud integer,
    id_calendario integer
);
 !   DROP TABLE public.orden_trabajo;
       public         postgres    false    3            �            1259    16553    orden_trabajo_por_trabajadores    TABLE     �   CREATE TABLE orden_trabajo_por_trabajadores (
    detalle text,
    id_trabajadores integer NOT NULL,
    id_orden_trabajo integer NOT NULL
);
 2   DROP TABLE public.orden_trabajo_por_trabajadores;
       public         postgres    false    3            �            1259    16451    pasos    TABLE     D   CREATE TABLE pasos (
    id_paso integer NOT NULL,
    paso text
);
    DROP TABLE public.pasos;
       public         postgres    false    3            �            1259    16584    procedimiento    TABLE     t   CREATE TABLE procedimiento (
    id_procedimiento integer NOT NULL,
    procedimiento text,
    id_pasos integer
);
 !   DROP TABLE public.procedimiento;
       public         postgres    false    3            �            1259    16483 	   solicitud    TABLE     �   CREATE TABLE solicitud (
    id_solicitud integer NOT NULL,
    fecha date,
    responsable text,
    email text,
    telefono text,
    descripcion text,
    id_equipo integer,
    id_tipo_mantenimiento integer
);
    DROP TABLE public.solicitud;
       public         postgres    false    3            �            1259    16475    tipo_mantenimiento    TABLE     �   CREATE TABLE tipo_mantenimiento (
    id_tipo_mantenimiento integer NOT NULL,
    tipo_mantenimiento text,
    observaciones text
);
 &   DROP TABLE public.tipo_mantenimiento;
       public         postgres    false    3            �            1259    16459    trabajadores    TABLE     x   CREATE TABLE trabajadores (
    id_trabajador integer NOT NULL,
    nombres text,
    apellidos text,
    email text
);
     DROP TABLE public.trabajadores;
       public         postgres    false    3            �          0    16501    asuetos 
   TABLE DATA               9   COPY asuetos (id_asueto, fecha, descripcion) FROM stdin;
    public       postgres    false    194   �a       �          0    16509 
   calendario 
   TABLE DATA               ~   COPY calendario (id_calendario, fecha_inicio, decripcion, responsable, telefono, fecha_fin, cantidad, id_asuetos) FROM stdin;
    public       postgres    false    195   �a       �          0    16540    cargo 
   TABLE DATA               G   COPY cargo (id_cargo, cargo, descripcion, id_trabajadores) FROM stdin;
    public       postgres    false    197   b       �          0    16428    detalle_equipo 
   TABLE DATA               n   COPY detalle_equipo (id_detalle_equipo, dispositivo, descripcion, id_marca, id_modelo, id_equipo) FROM stdin;
    public       postgres    false    188   b       �          0    16571    detalle_mantenimiento 
   TABLE DATA               �   COPY detalle_mantenimiento (id_detalle_mantenimiento, "hardware/software", detalle_harware, detalle_software, id_orden_trabajo) FROM stdin;
    public       postgres    false    199   ;b       �          0    16597    diagnostico 
   TABLE DATA               c   COPY diagnostico (id_diagnostico, diagnostico, id_procedimiento, id_diagnostico_parte) FROM stdin;
    public       postgres    false    201   Xb       �          0    16467    diagnostico_parte 
   TABLE DATA               P   COPY diagnostico_parte (id_diagnostico_parte, parte, observaciones) FROM stdin;
    public       postgres    false    191   ub       �          0    16420    equipo 
   TABLE DATA               3   COPY equipo (id_equipo, serie, unidad) FROM stdin;
    public       postgres    false    187   �b       �          0    16615    estado_detalle_mantenimiento 
   TABLE DATA               �   COPY estado_detalle_mantenimiento (id_estado_detalle_mantenimiento, estado, observaciones, id_detalle_mantenimiento, id_procedimiento) FROM stdin;
    public       postgres    false    202   �b       �          0    16404    marca 
   TABLE DATA               6   COPY marca (id_marca, marca, descripcion) FROM stdin;
    public       postgres    false    185   �b       �          0    16412    modelo 
   TABLE DATA               9   COPY modelo (id_modelo, modelo, descripcion) FROM stdin;
    public       postgres    false    186   �b       �          0    16522    orden_trabajo 
   TABLE DATA               h   COPY orden_trabajo (id_orden_trabajo, fecha_inicio, prioridad, id_solicitud, id_calendario) FROM stdin;
    public       postgres    false    196   c       �          0    16553    orden_trabajo_por_trabajadores 
   TABLE DATA               ]   COPY orden_trabajo_por_trabajadores (detalle, id_trabajadores, id_orden_trabajo) FROM stdin;
    public       postgres    false    198   #c       �          0    16451    pasos 
   TABLE DATA               '   COPY pasos (id_paso, paso) FROM stdin;
    public       postgres    false    189   @c       �          0    16584    procedimiento 
   TABLE DATA               K   COPY procedimiento (id_procedimiento, procedimiento, id_pasos) FROM stdin;
    public       postgres    false    200   ]c       �          0    16483 	   solicitud 
   TABLE DATA               ~   COPY solicitud (id_solicitud, fecha, responsable, email, telefono, descripcion, id_equipo, id_tipo_mantenimiento) FROM stdin;
    public       postgres    false    193   zc       �          0    16475    tipo_mantenimiento 
   TABLE DATA               _   COPY tipo_mantenimiento (id_tipo_mantenimiento, tipo_mantenimiento, observaciones) FROM stdin;
    public       postgres    false    192   �c       �          0    16459    trabajadores 
   TABLE DATA               I   COPY trabajadores (id_trabajador, nombres, apellidos, email) FROM stdin;
    public       postgres    false    190   �c       <           2606    17027    asuetos asuetos_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY asuetos
    ADD CONSTRAINT asuetos_pkey PRIMARY KEY (id_asueto);
 >   ALTER TABLE ONLY public.asuetos DROP CONSTRAINT asuetos_pkey;
       public         postgres    false    194    194            >           2606    17041    calendario calendario_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY calendario
    ADD CONSTRAINT calendario_pkey PRIMARY KEY (id_calendario);
 D   ALTER TABLE ONLY public.calendario DROP CONSTRAINT calendario_pkey;
       public         postgres    false    195    195            B           2606    16669    cargo cargo_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY cargo
    ADD CONSTRAINT cargo_pkey PRIMARY KEY (id_cargo);
 :   ALTER TABLE ONLY public.cargo DROP CONSTRAINT cargo_pkey;
       public         postgres    false    197    197            0           2606    16690 "   detalle_equipo detalle_equipo_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY detalle_equipo
    ADD CONSTRAINT detalle_equipo_pkey PRIMARY KEY (id_detalle_equipo);
 L   ALTER TABLE ONLY public.detalle_equipo DROP CONSTRAINT detalle_equipo_pkey;
       public         postgres    false    188    188            F           2606    17055 0   detalle_mantenimiento detalle_mantenimiento_pkey 
   CONSTRAINT     }   ALTER TABLE ONLY detalle_mantenimiento
    ADD CONSTRAINT detalle_mantenimiento_pkey PRIMARY KEY (id_detalle_mantenimiento);
 Z   ALTER TABLE ONLY public.detalle_mantenimiento DROP CONSTRAINT detalle_mantenimiento_pkey;
       public         postgres    false    199    199            6           2606    16774 (   diagnostico_parte diagnostico_parte_pkey 
   CONSTRAINT     q   ALTER TABLE ONLY diagnostico_parte
    ADD CONSTRAINT diagnostico_parte_pkey PRIMARY KEY (id_diagnostico_parte);
 R   ALTER TABLE ONLY public.diagnostico_parte DROP CONSTRAINT diagnostico_parte_pkey;
       public         postgres    false    191    191            J           2606    16635    diagnostico diagnostico_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY diagnostico
    ADD CONSTRAINT diagnostico_pkey PRIMARY KEY (id_diagnostico);
 F   ALTER TABLE ONLY public.diagnostico DROP CONSTRAINT diagnostico_pkey;
       public         postgres    false    201    201            .           2606    17069    equipo equipo_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY equipo
    ADD CONSTRAINT equipo_pkey PRIMARY KEY (id_equipo);
 <   ALTER TABLE ONLY public.equipo DROP CONSTRAINT equipo_pkey;
       public         postgres    false    187    187            L           2606    16792 >   estado_detalle_mantenimiento estado_detalle_mantenimiento_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY estado_detalle_mantenimiento
    ADD CONSTRAINT estado_detalle_mantenimiento_pkey PRIMARY KEY (id_estado_detalle_mantenimiento);
 h   ALTER TABLE ONLY public.estado_detalle_mantenimiento DROP CONSTRAINT estado_detalle_mantenimiento_pkey;
       public         postgres    false    202    202            *           2606    16825    marca marca_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY marca
    ADD CONSTRAINT marca_pkey PRIMARY KEY (id_marca);
 :   ALTER TABLE ONLY public.marca DROP CONSTRAINT marca_pkey;
       public         postgres    false    185    185            ,           2606    16839    modelo modelo_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY modelo
    ADD CONSTRAINT modelo_pkey PRIMARY KEY (id_modelo);
 <   ALTER TABLE ONLY public.modelo DROP CONSTRAINT modelo_pkey;
       public         postgres    false    186    186            @           2606    17088     orden_trabajo orden_trabajo_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY orden_trabajo
    ADD CONSTRAINT orden_trabajo_pkey PRIMARY KEY (id_orden_trabajo);
 J   ALTER TABLE ONLY public.orden_trabajo DROP CONSTRAINT orden_trabajo_pkey;
       public         postgres    false    196    196            D           2606    16894 B   orden_trabajo_por_trabajadores orden_trabajo_por_trabajadores_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY orden_trabajo_por_trabajadores
    ADD CONSTRAINT orden_trabajo_por_trabajadores_pkey PRIMARY KEY (id_trabajadores, id_orden_trabajo);
 l   ALTER TABLE ONLY public.orden_trabajo_por_trabajadores DROP CONSTRAINT orden_trabajo_por_trabajadores_pkey;
       public         postgres    false    198    198    198            2           2606    16922    pasos pasos_pkey 
   CONSTRAINT     L   ALTER TABLE ONLY pasos
    ADD CONSTRAINT pasos_pkey PRIMARY KEY (id_paso);
 :   ALTER TABLE ONLY public.pasos DROP CONSTRAINT pasos_pkey;
       public         postgres    false    189    189            H           2606    16936     procedimiento procedimiento_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY procedimiento
    ADD CONSTRAINT procedimiento_pkey PRIMARY KEY (id_procedimiento);
 J   ALTER TABLE ONLY public.procedimiento DROP CONSTRAINT procedimiento_pkey;
       public         postgres    false    200    200            :           2606    16955    solicitud solicitud_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY solicitud
    ADD CONSTRAINT solicitud_pkey PRIMARY KEY (id_solicitud);
 B   ALTER TABLE ONLY public.solicitud DROP CONSTRAINT solicitud_pkey;
       public         postgres    false    193    193            8           2606    16993 *   tipo_mantenimiento tipo_mantenimiento_pkey 
   CONSTRAINT     t   ALTER TABLE ONLY tipo_mantenimiento
    ADD CONSTRAINT tipo_mantenimiento_pkey PRIMARY KEY (id_tipo_mantenimiento);
 T   ALTER TABLE ONLY public.tipo_mantenimiento DROP CONSTRAINT tipo_mantenimiento_pkey;
       public         postgres    false    192    192            4           2606    17008    trabajadores trabajadores_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY trabajadores
    ADD CONSTRAINT trabajadores_pkey PRIMARY KEY (id_trabajador);
 H   ALTER TABLE ONLY public.trabajadores DROP CONSTRAINT trabajadores_pkey;
       public         postgres    false    190    190            R           2606    17028 %   calendario calendario_id_asuetos_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY calendario
    ADD CONSTRAINT calendario_id_asuetos_fkey FOREIGN KEY (id_asuetos) REFERENCES asuetos(id_asueto);
 O   ALTER TABLE ONLY public.calendario DROP CONSTRAINT calendario_id_asuetos_fkey;
       public       postgres    false    194    195    2108            U           2606    17009     cargo cargo_id_trabajadores_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY cargo
    ADD CONSTRAINT cargo_id_trabajadores_fkey FOREIGN KEY (id_trabajadores) REFERENCES trabajadores(id_trabajador);
 J   ALTER TABLE ONLY public.cargo DROP CONSTRAINT cargo_id_trabajadores_fkey;
       public       postgres    false    190    2100    197            O           2606    17070 ,   detalle_equipo detalle_equipo_id_equipo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY detalle_equipo
    ADD CONSTRAINT detalle_equipo_id_equipo_fkey FOREIGN KEY (id_equipo) REFERENCES equipo(id_equipo);
 V   ALTER TABLE ONLY public.detalle_equipo DROP CONSTRAINT detalle_equipo_id_equipo_fkey;
       public       postgres    false    187    188    2094            M           2606    16826 +   detalle_equipo detalle_equipo_id_marca_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY detalle_equipo
    ADD CONSTRAINT detalle_equipo_id_marca_fkey FOREIGN KEY (id_marca) REFERENCES marca(id_marca);
 U   ALTER TABLE ONLY public.detalle_equipo DROP CONSTRAINT detalle_equipo_id_marca_fkey;
       public       postgres    false    188    2090    185            N           2606    16840 ,   detalle_equipo detalle_equipo_id_modelo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY detalle_equipo
    ADD CONSTRAINT detalle_equipo_id_modelo_fkey FOREIGN KEY (id_modelo) REFERENCES modelo(id_modelo);
 V   ALTER TABLE ONLY public.detalle_equipo DROP CONSTRAINT detalle_equipo_id_modelo_fkey;
       public       postgres    false    186    2092    188            X           2606    17089 A   detalle_mantenimiento detalle_mantenimiento_id_orden_trabajo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY detalle_mantenimiento
    ADD CONSTRAINT detalle_mantenimiento_id_orden_trabajo_fkey FOREIGN KEY (id_orden_trabajo) REFERENCES orden_trabajo(id_orden_trabajo);
 k   ALTER TABLE ONLY public.detalle_mantenimiento DROP CONSTRAINT detalle_mantenimiento_id_orden_trabajo_fkey;
       public       postgres    false    2112    196    199            Z           2606    16775 1   diagnostico diagnostico_id_diagnostico_parte_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY diagnostico
    ADD CONSTRAINT diagnostico_id_diagnostico_parte_fkey FOREIGN KEY (id_diagnostico_parte) REFERENCES diagnostico_parte(id_diagnostico_parte);
 [   ALTER TABLE ONLY public.diagnostico DROP CONSTRAINT diagnostico_id_diagnostico_parte_fkey;
       public       postgres    false    191    2102    201            [           2606    16937 -   diagnostico diagnostico_id_procedimiento_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY diagnostico
    ADD CONSTRAINT diagnostico_id_procedimiento_fkey FOREIGN KEY (id_procedimiento) REFERENCES procedimiento(id_procedimiento);
 W   ALTER TABLE ONLY public.diagnostico DROP CONSTRAINT diagnostico_id_procedimiento_fkey;
       public       postgres    false    201    2120    200            ]           2606    17056 W   estado_detalle_mantenimiento estado_detalle_mantenimiento_id_detalle_mantenimiento_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY estado_detalle_mantenimiento
    ADD CONSTRAINT estado_detalle_mantenimiento_id_detalle_mantenimiento_fkey FOREIGN KEY (id_detalle_mantenimiento) REFERENCES detalle_mantenimiento(id_detalle_mantenimiento);
 �   ALTER TABLE ONLY public.estado_detalle_mantenimiento DROP CONSTRAINT estado_detalle_mantenimiento_id_detalle_mantenimiento_fkey;
       public       postgres    false    202    199    2118            \           2606    16942 O   estado_detalle_mantenimiento estado_detalle_mantenimiento_id_procedimiento_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY estado_detalle_mantenimiento
    ADD CONSTRAINT estado_detalle_mantenimiento_id_procedimiento_fkey FOREIGN KEY (id_procedimiento) REFERENCES procedimiento(id_procedimiento);
 y   ALTER TABLE ONLY public.estado_detalle_mantenimiento DROP CONSTRAINT estado_detalle_mantenimiento_id_procedimiento_fkey;
       public       postgres    false    200    2120    202            T           2606    17042 .   orden_trabajo orden_trabajo_id_calendario_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY orden_trabajo
    ADD CONSTRAINT orden_trabajo_id_calendario_fkey FOREIGN KEY (id_calendario) REFERENCES calendario(id_calendario);
 X   ALTER TABLE ONLY public.orden_trabajo DROP CONSTRAINT orden_trabajo_id_calendario_fkey;
       public       postgres    false    196    2110    195            S           2606    16956 -   orden_trabajo orden_trabajo_id_solicitud_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY orden_trabajo
    ADD CONSTRAINT orden_trabajo_id_solicitud_fkey FOREIGN KEY (id_solicitud) REFERENCES solicitud(id_solicitud);
 W   ALTER TABLE ONLY public.orden_trabajo DROP CONSTRAINT orden_trabajo_id_solicitud_fkey;
       public       postgres    false    193    2106    196            V           2606    17094 S   orden_trabajo_por_trabajadores orden_trabajo_por_trabajadores_id_orden_trabajo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY orden_trabajo_por_trabajadores
    ADD CONSTRAINT orden_trabajo_por_trabajadores_id_orden_trabajo_fkey FOREIGN KEY (id_orden_trabajo) REFERENCES orden_trabajo(id_orden_trabajo);
 }   ALTER TABLE ONLY public.orden_trabajo_por_trabajadores DROP CONSTRAINT orden_trabajo_por_trabajadores_id_orden_trabajo_fkey;
       public       postgres    false    2112    196    198            W           2606    17014 R   orden_trabajo_por_trabajadores orden_trabajo_por_trabajadores_id_trabajadores_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY orden_trabajo_por_trabajadores
    ADD CONSTRAINT orden_trabajo_por_trabajadores_id_trabajadores_fkey FOREIGN KEY (id_trabajadores) REFERENCES trabajadores(id_trabajador);
 |   ALTER TABLE ONLY public.orden_trabajo_por_trabajadores DROP CONSTRAINT orden_trabajo_por_trabajadores_id_trabajadores_fkey;
       public       postgres    false    190    198    2100            Y           2606    16923 )   procedimiento procedimiento_id_pasos_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY procedimiento
    ADD CONSTRAINT procedimiento_id_pasos_fkey FOREIGN KEY (id_pasos) REFERENCES pasos(id_paso);
 S   ALTER TABLE ONLY public.procedimiento DROP CONSTRAINT procedimiento_id_pasos_fkey;
       public       postgres    false    2098    189    200            Q           2606    17075 "   solicitud solicitud_id_equipo_fkey    FK CONSTRAINT     }   ALTER TABLE ONLY solicitud
    ADD CONSTRAINT solicitud_id_equipo_fkey FOREIGN KEY (id_equipo) REFERENCES equipo(id_equipo);
 L   ALTER TABLE ONLY public.solicitud DROP CONSTRAINT solicitud_id_equipo_fkey;
       public       postgres    false    2094    193    187            P           2606    16994 .   solicitud solicitud_id_tipo_mantenimiento_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY solicitud
    ADD CONSTRAINT solicitud_id_tipo_mantenimiento_fkey FOREIGN KEY (id_tipo_mantenimiento) REFERENCES tipo_mantenimiento(id_tipo_mantenimiento);
 X   ALTER TABLE ONLY public.solicitud DROP CONSTRAINT solicitud_id_tipo_mantenimiento_fkey;
       public       postgres    false    2104    192    193            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     