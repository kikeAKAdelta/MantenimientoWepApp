#!/bin/bash
docker stop postgresman
docker stop payaramicroman

docker rm postgresman
docker rm payaramicroman

docker rmi postgrestpi
docker rmi paymitpi

mvn clean install


#google-chrome  http://localhost:8080/MantenimientoTPI-web/
docker-compose up

