#!/bin/zsh

export GITHUB_USER=moreira-ks
export GITHUB_PASS=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
cd ./hr-eureka-server 
 mvn spring-boot:run &
 sleep 10 &&
cd ../hr-config-server 
 mvn spring-boot:run &
 sleep 10 &&
cd ../hr-worker/ 
 mvn spring-boot:run & 
 sleep 10 &&
cd ../hr-payroll/ 
 mvn spring-boot:run &
  sleep 10 &&
cd ../hr-api-gateway-zuul/ 
 mvn spring-boot:run & 
  sleep 10

wait


