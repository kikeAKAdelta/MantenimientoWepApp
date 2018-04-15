FROM postgres:latest

ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=admin
ENV POSTGRES_DB=MantenimientoTPI

ADD mantenimiento.sql /docker-entrypoint-initdb.d/mantenimiento.sql 

