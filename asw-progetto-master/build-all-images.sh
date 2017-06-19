#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka-9007 ./eureka
docker build --rm -t ${DOCKER_REGISTRY}/s-9007 ./S
docker build --rm -t ${DOCKER_REGISTRY}/s1-9007 ./S1
docker build --rm -t ${DOCKER_REGISTRY}/s2-9007 ./S2
docker build --rm -t ${DOCKER_REGISTRY}/zuul-9007 ./ZuulApplication
