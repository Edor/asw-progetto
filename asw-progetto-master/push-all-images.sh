#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-9007
docker push ${DOCKER_REGISTRY}/s-9007
docker push ${DOCKER_REGISTRY}/s1-9007
docker push ${DOCKER_REGISTRY}/s2-9007
docker push ${DOCKER_REGISTRY}/zuul-9007




