---------------------------------------------------------
Author: Segopotso Makhutja                              
Due Date: 23 April 2019                                 
CSC3002F: OS Assignment 2 (Part I)                      
---------------------------------------------------------

### Instructions
    - extract the zip file
    - navigate to the project root directory

### Contents
    - Barrier.java : implementation class of a simple barrier using semaphores
    - BThread.java : implementation class of barrier threads
    - BarrierTest.java: Main driver class of the program
    - Makefile : to compile and run the default Test
    - READMe.txt : READMe file containing instructions
    - .git : regularly updated local git repo

### Compile
    - to compile, make sure you are in the root directory then on the terminal type `make`
    - `make` will build or compile all the required files

### Run
    - make sure you are in the root directory of the project
    - type `make def`
    - `make def` will run the default test which is to test with the default case
    - the default case is barrier size of 5 and number of threads is 5

### Test
    - to test the program with different values
    - type `make run ARGS="<size of barrier> <number of threads>"` in the command line
    - remove the angle brackets.
    - e.g make run ARGS ="4 5"

### Additional Notes
    - to clean the working environment run `make clean`
    - `make clean` will remove all the .class files in the project
    - no assumptions have been made, the program runs as the assignment brief requires. 