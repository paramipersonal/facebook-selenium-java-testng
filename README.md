# Facebook Basic Functionalities
## Dependencies

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
* [Package: resources](#names-of-various-files-and-describe)


#### Files inside **page-objects** directory
#### Files inside the **test_scenarios** directory
#### Files inside the **resources** directory



#### Names of various files and describe

#### Files inside **page_objects** directory

| Class Name            | Test                                                                                                                                     |
|-----------------------|------------------------------------------------------------------------------------------------------------------------------------------|
| BasePage.scala        | Contains driver and explicitWait opject declarations and a method common to all the Pages.|        
| FacebookHomePage.scala | Contains variables and methods to locate various web elements in the Facebook Home Page                                                    
| FacebookLoginLogoutPage.scala        | Contains variables and methods to locate various web elements in the Facebook Login Logout Page.                                                                    |        

#### Put images of ui type
It has been observed that various facebook profile had various navigation patterns involved.
I observed a couple of facebook profiles, in the same machine, same browser and found two different UI navigation patterns.Here I have used the below UI type to write the tests. Using a different type of UI might change the tests in minor ways.

**Used UI Type** :
![Image1](https://github.com/paramipersonal/facebook-selenium-java-testng/blob/master/images/UI_test1.PNG)

## Challenges
## Checkpoints briefs