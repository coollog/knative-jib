#!/bin/bash

# Reapplies the jib-maven BuildTemplate and restarts the Build
kubectl apply -f jib-maven.yaml && kubectl delete build jib-maven-build && kubectl apply -f jib-build.yaml && ./logs jib-maven-build
