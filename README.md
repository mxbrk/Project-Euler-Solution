# Documentation
This repository is displaying the solutions from project euler (https://projecteuler.net/about)  
In order to use these solutions you need to do the following steps.  

## Prerequisites
### Is Java installed?
To run the Java version of the project euler solutions, it is necessary to have Java installed on your system.  
To check if a Java JDK (Java Development Kit) is installed, use this command. If a Java JDK is installed, you will see the respective version:
```
java -version 
```
### Installing Java JDK
If no version is displayed, you can install a Java JDK (in this case OpenJDK ) with these commands:  
for Linux (Debian based)
```
#update packages
sudo apt update

#installation itself
sudo apt install default-jdk

#check Java version
java -version 
```
for Linux (Fedora, RedHat, CentOS)
```
sudo dnf install java-latest-openjdk-devel
java -version 
```
for Windows, download the official OpenJDK from https://jdk.java.net/ and follow the instructions in the installation process.  

### Java IDE/ Shell
Using a Java IDE (Integrated Development Environment) is optional but recommended. All solutions written in Java can be executed without an IDE in the shell of your system.  
## Setup
### Clone this repository on local device
The following commands are valid for Linux,  Windows and macOS.  
```
git clone https://github.com/mxbrk/project-euler-solution.git
```
```
#necessary if you want to execute the solutions in the shell
cd project-euler-solution 
```
## Execute 
To run the solutions with an Java IDE follow the necessary steps of the respective application.  
If you want to test them quickly in the shell, follow these steps   
### Compile
First step is to compile the code
```
javac Problem1.java
```
### Runnig the solutions
To see the result of the solution, run the code an see the results with this command
```
java Problem1
```
## Suggestions for improvement
Since the project euler problems are also made to improve your own coding skills, let me know if I can improve my solutions. To do so, just open an issue :)
