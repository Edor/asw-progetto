#!/bin/bash

xterm -hold -e 'cd ../../../asw-progetto-master/S1 && gradle bootRun -Dorg.gradle.java.home=/usr/java/jdk1.8.0_121' & xterm -hold -e 'cd ../../../asw-progetto-master/S2 && gradle bootRun -Dorg.gradle.java.home=/usr/java/jdk1.8.0_121' & xterm -hold -e 'cd ../../../asw-progetto-master/S && gradle bootRun -Dorg.gradle.java.home=/usr/java/jdk1.8.0_121'


