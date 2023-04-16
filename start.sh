#!/bin/bash

sudo apt-get update
sudo apt-get install docker.io
sudo docker build -t dio-api .
sudo docker run -dp 8080:8080 dio-api
sudo docker ps

