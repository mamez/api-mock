#!/bin/bash

kill -9 $(ps -ef | pgrep -f "java")

./mvnw clean

./mvnw exec:exec@npm-watch quarkus:dev

