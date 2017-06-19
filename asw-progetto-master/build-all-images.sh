#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka-9007 ./eureka 
docker build --rm -t ${DOCKER_REGISTRY}/S-9007 ./S
docker build --rm -t ${DOCKER_REGISTRY}/S1-9007 ./S1
docker build --rm -t ${DOCKER_REGISTRY}/S2-9007 ./S2
docker build --rm -t ${DOCKER_REGISTRY}/zuul-9007 ./ZuulApplication





