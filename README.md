# SER502-Spring2022-Team37
System built on- **Mac OS Big Sur Version 11.6** 
Tools Used- 
* [ANTLR 4.10.1](https://www.antlr.org/)
* [IntelliJ Idea Community 2020.1](https://www.jetbrains.com/idea/) 
* ANTLR IntelliJ Plugin

# Jar Files required
* [ANTLR 4.10.1](https://www.antlr.org/download/antlr-4.10.1-complete.jar)
* Project JAR File (Present in /data directory)
 
# Test file names
* basic_arithmetic.lax 
* basic_if.lax 
* for_loop.lax
* for_range.lax 
* ternary_operator.lax 
* while_check.lax 

# How to run (Ubuntu/Mac/Windows)

#####  Give permissions to shell script file to run it
```
chmod 777 shell.sh
```

##### Give permissions to read text files
``` 
cd data/
chmod 777 *.lax
```

##### Compile test files
Go to directory with shell.sh file in it.
```
./shell.sh testfileName.lax
```

## Instructions on how to build jar (Not necessary since jar is present in /data directory)
1. Go to File
2. Click Project Structure
3. Click on Artifacts
4. Press + -> Jar -> from module dependencies
5. Click the dropdown and select the Main.java Class and click OK
6. Go to Build
7. Click Build Artificats -> Click Build

**Your jar file is ready**

# YouTube Video
https://www.youtube.com/watch?v=RRZ9qwqs89g
