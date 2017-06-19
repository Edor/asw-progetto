#!/bin/bash

gradle build -b eureka/build.gradle 
gradle build -b S/build.gradle 
gradle build -b S1/build.gradle 
gradle build -b S2/build.gradle 
gradle build -b ZuulApplication/build.gradle 




