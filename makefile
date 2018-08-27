SHELL := /bin/bash

build-app:
	./gradlew clean build

build-docker-image:
	docker build -t challenge-mutant .

run-app-image:
	docker run -d -p 9000:8080 challenge-mutant
