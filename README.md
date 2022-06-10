# Facebook Basic Functionalities


* [Prerequisites](#prerequisites)
* [Main Dependencies](#main-dependencies)
* [Clone and run project using Eclipse](#clone-and-run-project-using-eclipse)
* [Project Structure and Descriptions](#project-structure-and-descriptions)
* [UI constraints](#ui-constraint)
* [Challenges](#challenges)

## Prerequisites
1. **Eclipse IDE**: Eclipse IDE for Java developers can be used to open this maven project 

## Main Dependencies
1. Java
2. Selenium 3.0
3. Maven
4. TestNG
5. log4j 2


#### Dependency links from maven repository used in pom.xml
```
	<dependency>
    		<groupId>org.seleniumhq.selenium</groupId>
    		<artifactId>selenium-java</artifactId>
    		<version>3.0.0</version>
	</dependency>
```

```
	<dependency>
    		<groupId>io.github.bonigarcia</groupId>
    		<artifactId>webdrivermanager</artifactId>
    		<version>5.2.0</version>
	</dependency>
```
```
	<dependency>
    		<groupId>org.testng</groupId>
    		<artifactId>testng</artifactId>
    		<version>7.6.0</version>
    		<scope>test</scope>
	</dependency>
	
```
```
	<dependency>
    		<groupId>org.apache.logging.log4j</groupId>
    		<artifactId>log4j-core</artifactId>
    		<version>2.17.2</version>
	</dependency>
	
```
```
	<dependency>
    		<groupId>org.apache.logging.log4j</groupId>
    		<artifactId>log4j-api</artifactId>
    		<version>2.17.2</version>
	</dependency>
	
```

## Clone and Run Project using Eclipse:
1. Clone the repository link:
```
https://github.com/paramipersonal/facebook-selenium-java-testng.git
```
2. Open Eclipse IDE
3. Click on File
4. Go to Import
5. Navigate to Import from Git ,using smart Import
6. Clone the github repository.
7. Eclipse will fetch the master branch, keep clicking on Next button until project is imported.


## Project Structure and Descriptions
This is a simple project that uses Selenium 3, Java, TestNG to perform the below actions : 
1. Launch Facebook
2. Login to Facebook Using your choice of email id and password
3. Post a status "Hello World"
4. Verify the posted status. 

### Files
There are three packages under the [source/test/java](https://github.com/paramipersonal/facebook-selenium-java-testng/tree/master/src/test/java) directory:
* [Package: page_objects](#files-inside-page-objects-directory)
* [Package: test_scenarios](#files-inside-the-test_scenarios-directory)
* [Package: resources](#files-inside-the-resources-directory)


#### Files inside **page-objects** directory
| Class Name            | Test                                                                                                                                     |
|-----------------------|------------------------------------------------------------------------------------------------------------------------------------------|
| BasePage.java        | Contains driver and explicitWait opject declarations and a method common to all the Pages.|        
| FacebookHomePage.java | Contains variables and methods to locate various web elements in the Facebook Home Page                                                    
| FacebookLoginLogoutPage.java        | Contains variables and methods to locate various web elements in the Facebook Login Logout Page.   

#### Files inside the **test_scenarios** directory
| Class Name            | Test                                                                                                                                     |
|-----------------------|------------------------------------------------------------------------------------------------------------------------------------------|
| FacebookBasicTestSpec.java        | Contains the test cases that needs to be implemented like login,post a status, verify status.|           

#### Files inside the **resources** directory
| Class Name            | Test                                                                                                                                     |
|-----------------------|------------------------------------------------------------------------------------------------------------------------------------------|
| Messages.java        | Java class containing the resource bundles for string externalization.|           
| messages.properties | Contains the configurable string inputs like, URL to launch, email ID, password, status text etc                                      

## UI Constraint
It has been observed that various facebook profile had various navigation patterns involved.
I observed a couple of facebook profiles, in the same machine, same browser and found two different UI navigation patterns.Using a different type of UI might change the tests in minor ways.Here I have used the below UI type to write the tests.

![Image1](https://github.com/paramipersonal/facebook-selenium-java-testng/blob/master/images/UI_test1.PNG)

## Challenges
Since most of the css selectors were created dynamically, finding locators and selecting the proper locators to find the web elements 
was the primary challenge. 
