#!/bin/bash

# Compile
echo "Compiling Health Clinic App..."
javac -cp "gcr-codebase/lib/mysql-connector-j-8.3.0.jar" -sourcepath gcr-codebase gcr-codebase/com/healthclinic/HealthClinicApp.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful. Starting application..."
    echo "------------------------------------------------"
    # Run
    java -cp "gcr-codebase:gcr-codebase/lib/mysql-connector-j-8.3.0.jar" com.healthclinic.HealthClinicApp
else
    echo "Compilation failed. Please fix errors before running."
fi
