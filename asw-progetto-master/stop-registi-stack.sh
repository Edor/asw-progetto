#!/bin/bash

echo 'Removing sentence application as a stack' 

source "docker.env"

docker -H=swarm.inf.uniroma3.it:2376 --tlsverify stack rm registi-9007
