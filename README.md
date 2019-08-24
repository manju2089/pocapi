# poc

##  This application is used to plot graph with data from h2 database using d3 js.

* **A. Prerequisites**
   * 1. Windows/Linux based operating system
   * 2. Java 1.8 
   * 3. Maven must be installed in the system to build and run the applicationRequest
   * 4. Tomcat is not mandatory since spring boot takes care of it
* **B. Getting Started**
   * 1. Import the application in any Editor (Intellij)

   * 2. Open the command prompt and navigate to the main project directory.
          ` cd /poc-api`

* **C. Deploy the applicationRequest in internal container **
    * 1. Run the command "mvn clean install" in base folder of the applicationRequest(ie, in /poc-api).
    * 2. Then run the command 'mvn spring-boot:run'
    * 3. Access the applicationRequest by hitting the url to land on the game test page
http://localhost:8080/generateReport?username=manju&password=manju
    * Username and password are configurable in application.properties


















