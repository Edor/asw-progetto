#!/bin/bash

xterm -hold -e 'cd ../../../asw-progetto-master/S1 && gradle bootRun' & xterm -hold -e 'cd ../../../asw-progetto-master/S2 && gradle bootRun' & xterm -hold -e 'cd ../../../asw-progetto-master/S && gradle bootRun'


