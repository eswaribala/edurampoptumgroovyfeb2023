package com.optum.insurance.utilities

import java.time.LocalTime

def timeRange = LocalTime.now() .. LocalTime.now().plusMinutes(20)

for (LocalTime x in timeRange)
    println "Time = ${x}"