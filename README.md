# Automation_Challenge

Hi Team, Please read the following Instructions below and you will be able to run it.

How to pull Project from Github to eclipse

Go to Eclipse Upper Left Corner, Click on File then you're able to see a dropdown, 
click on Import, and a new window will appear.
Then click on Git folder when extended you will be able to see (Project from git) 
and Select it Then Click on next, again another window will appear and select clone URL.
In displayed URL Window Enter the flowing URL 
(https://github.com/SPavelMehedi/Automation_Challenge.git) And hit next, 
select next again and then finish. 

When installation is finished, you have to do maven life cycle 
a. Maven Clean 
b. Maven Install
c. Maven Update 

When maven update is completed then under project, you're able to see Sanity.xml file, 
right click on xml file and run as a TestNG then it will run.
When it is done, you're able to see under project, Extend Reports folder under the folder
you will see html report. 

Requirements to Run Project.
Java, Maven, TestNG,Log 4J
This is a simple project that would allow anyone to get up and running with Java, Maven, Selenium and TestNG. 
It also explains how to execute a simple test that will assert the title of a page.
Currently the project has one test that will navigate to (https://viewmyconsult.com/login.php) and 
verify the title is matching.


Before pull-up project from Git-Hub, it will need to be installed some prerequisite tools in the local machine.
 Step 1: Download JDK
 Goto Java SE download site @ http://www.oracle.com/technetwork/java/javase/downloads/index.html.
 Under "Java Platform, Standard Edition" ⇒ "Java SE 1.8.{x}", where {x} denotes a fast running security-update number ⇒ Click the "Oracle JDK" "Download" button.
 Under "Java SE Development Kit 1.8.{x}" ⇒ Check "Accept License Agreement".
 Choose the JDK for your operating system, i.e., "Windows". Download the "exe" installer (e.g., "jdk-1.8.{x}_windows-x64_bin.exe" -      about 150MB).
 


Step 2: Include JDK's "bin" Directory in the PATH
 Windows' Command Prompt (CMD) searches the current directory and the directories listed in the PATH environment variable 
 (or system      variable) for executable programs. 
 JDK's programs (such as Java compiler "javac.exe" and Java runtime "java.exe") 
 reside in the          sub-directory "bin" of the JDK installed directory. You need to include JDK's "bin" in the PATH to run the JDK programs.
 To edit the PATH environment variable in Windows 10:
 Launch "Control Panel" ⇒ (Optional) "System and Security" ⇒ "System" ⇒ Click "Advanced system settings" on the left pane.
 Switch to "Advanced" tab ⇒ Click "Environment Variables" button.
 Under "System Variables" (the bottom pane), scroll down to select variable "Path" ⇒ Click "Edit...".
 

Step 3: Verify the JDK Installation
 Launch a CMD via one of the following means:
 Click "Search" button ⇒ Enter "cmd" ⇒ Choose "Command Prompt", or
 Right-click "Start" button ⇒ run... ⇒ enter "cmd", or
 Click "Start" button ⇒ Windows System ⇒ Command Prompt
 
 // Display the JDK version
 javac -version
 javac 1.8.1

 // Display the JRE version
 java -version
 java version "1.8.0" 2018-10-16 LTS
 Java(TM) SE Runtime Environment 18.9
 Java HotSpot(TM) 64-Bit Server VM 18.9, mixed mode).



 #. Download the Eclipse Installer
 Download Eclipse Installer from http://www.eclipse.org/downloads.
 
 Start the Eclipse Installer executable
 For Windows users, after the Eclipse Installer executable has finished downloading it should be available in your download              
 directory. Start the Eclipse Installer executable. You may get a security warning to run this file. If the Eclipse Foundation is        
 the Publisher, you are good to select Run.
 

 Select your installation folder
 Specify the folder where you want Eclipse to be installed. The default folder will be in your User directory.
 
 Launch Eclipse
 Once the installation is complete you can now launch Eclipse. The Eclipse Installer has done it's work. Happy coding.

Maven dependencies:
Maven dependencies contains key references to libraries that a Maven project needs to execute. 
The pom.xml in the root of a Maven project file stores the dependencies for a project.


How to Run the Project from eclipes:

From Eclipse
Import this project into Eclipse
Right click the project, then select Run as Maven Clean, Maven Install then the tests will start running.
Following the above steps executes the configurations found in the testing.xml file by default.
From the Command Line
Navigate to the location of project then execute mvn clean then mvn install/test.
Also I placed all the browsers under the project Driver folder:
So you’re able to run Chrome browser, 
IE browser, Microsoft Edge, 
Gecko Driver which is an extension of Firefox Driver and Headless browser. 
By default it runs on Chrome Browser 
but if we want to run with another browser so we have to go inside project
src/main/java folder extend virtualfacility.config.copy then open the file under and change the browser name. 
Expected output Report:
After successfully running testcases you will be able to see On the Project ExendReports Folder.  
Steps verify With Assertions, if it fails Any test cases display Report with screen shot.


Special Notes:
Ensure Chrome Browser Latest Version,
Also I placed all the browsers under the project Driver folder:
 So you’re able to run Chrome browser, 
 Microsoft Edge, 
 Gecko Driver which is an extension of Firefox Driver,


If you want to see all the log files:
 Under the project I have a folder with the file log which under there is all log files.
 I’m also using Selenium Page Factory concept for all elements store as an object repository, 
 Utility package for all common utility, Extend Reports for Generate Reports with Screen Shots, 
 and TestNG XML file for running test cases. 

