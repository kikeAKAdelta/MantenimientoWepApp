FROM postgres:latest

ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=1234
ENV POSTGRES_DB=mantenimiento

ADD mantenimiento.sql /docker-entrypoint-initdb.d/mantenimiento.sql 

