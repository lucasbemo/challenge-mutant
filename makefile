SHELL := /bin/bash

build-app:
	./gradlew clean build

run-app:
	./gradlew bootRun -Dspring.profiles.active=local


build-app-image:
	docker build -t challenge-mutant .

run-app-docker:
	docker run -d -p 9000:8080 challenge-mutant

run-database:
	docker-compose up -d challenge-mutant-database

run-full:
	docker-compose up -d

get-started:
	make build-app
	docker-compose up -d
