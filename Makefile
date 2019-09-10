NAME := moatlang_pythonic
TAG := $(shell git log -1 --pretty=%h)
IMG := ${NAME}:${TAG}
LATEST := ${NAME}:latest
antlr4 := java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:${CLASSPATH}" org.antlr.v4.Tool

.PHONY: setup

setup: venv/bin/python requirements.txt
	ln pip.conf venv/
	venv/bin/pip install -r requirements.txt -e .

venv/bin/python:
	python -m virtualenv -p python3.7 --prompt "(metrics) " venv

antlr_build:
	$(antlr4) -Dlanguage=Python3 -visitor ./grammar/Moatlang.g4 -Werror -no-listener

docker_build:
	docker build -t ${IMG} .
	docker tag ${IMG} ${LATEST}

test: docker_build
	docker run --rm ${IMG} pytest -vrs -vv --ff moatlang_pythonic/tests

lint: docker_build
	docker run --rm ${IMG} pylint -E moatlang_pythonic
