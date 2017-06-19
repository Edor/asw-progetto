#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-9007
docker push ${DOCKER_REGISTRY}/S-9007
docker push ${DOCKER_REGISTRY}/S1-9007
docker push ${DOCKER_REGISTRY}/S2-9007
docker push ${DOCKER_REGISTRY}/zuul-9007




