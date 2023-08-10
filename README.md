IF you want to run this project locally you can do certien few steps:
1-set a new connection in dbVisuallizer with the same name of the database that use it in the project - username=root & password=root.
 or it will created when you run the project because It is mentioned thier in application.properties file: "createDatabaseIfNotExist=true"
2- Then simply run the project and go to check it on the browser http://localhost:8080.

To run this project on Docker you can easily clone the project & run the Docker on the port 8080 for the UI and 
it will open in the browser.