#!/bin/sh

ROOT_PATH="$PWD"

LIB_PATH="$ROOT_PATH/data"
java -jar $LIB_PATH/SER502-Spring2022-Team37.jar $LIB_PATH/$1

echo "Run successful"
