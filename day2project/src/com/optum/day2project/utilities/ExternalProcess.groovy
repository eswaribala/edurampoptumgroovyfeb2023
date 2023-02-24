package com.optum.day2project.utilities

def process = "cmd /c dir/s *.groovy > list.txt".execute()
println "${process.text}"