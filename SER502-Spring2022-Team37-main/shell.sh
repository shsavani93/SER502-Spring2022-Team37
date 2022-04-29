#!/bin/sh

ROOT_PATH="$PWD"

LIB_PATH="$ROOT_PATH/libraries"

echo alias lax=\'java -jar $LIB_PATH/SER502-Spring2022-Team37.jar\' >> ~/.bashrc
echo export lax >> ~/.bashrc

echo
echo "Dependencies have been installed. Type ./filename.lax to run the script"
echo