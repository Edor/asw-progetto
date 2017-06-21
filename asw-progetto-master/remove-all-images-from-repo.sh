#!/bin/bash

DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000
DOCKER_DAEMON=swarm.inf.uniroma3.it:2376

docker -H=${DOCKER_DAEMON} --tlsverify rmi ${DOCKER_REGISTRY}/eureka-9007
docker -H=${DOCKER_DAEMON} --tlsverify rmi ${DOCKER_REGISTRY}/s-9007
docker -H=${DOCKER_DAEMON} --tlsverify rmi ${DOCKER_REGISTRY}/s1-9007
docker -H=${DOCKER_DAEMON} --tlsverify rmi ${DOCKER_REGISTRY}/s2-9007
docker -H=${DOCKER_DAEMON} --tlsverify rmi ${DOCKER_REGISTRY}/zuul-9007
