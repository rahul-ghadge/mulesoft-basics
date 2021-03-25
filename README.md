# mulesoft-basics
Basic demo application on Mulesoft Basics. 


## How to import?
		 1. Download/Clone mulesoft-basic repository from git
         2. Open Anypoint Studio
         3. File -> Import... -> Anypoint Studio -> Anypoint Studio project from File system -> Next
         4. Select any one of sub-project (01-hello-world, 02-...) under `Project root`
         5. Finish 



## Modules

- 01-hello-world
	- Exposed GET API `http://localhost:8001/hello-world` which will return `Hello world`
	- Used feature 
		- Http Listner - Expose API endpoint on port
		- Logger - print log 
		- Set Payload - set payload data in string format

- 02-consume-rest-api
	- Exposed GET API `http://localhost:8002/employees` which will request external REST API and consume the response from `https://spring-boot-h2-crud.herokuapp.com/employees` 
	- Used feature 
		- Http Listner - Expose API endpoint on port
		- Logger - print log 
		- Http Request - Consume external REST API hosted on server

- 03-cron-scheduler
	- Cron is enabled which will run after *3 seconds* with fixed frequency and print logger string  
	- Used feature 
		- Scheduler - which will run after 3 seconds
		- Logger - print log 

- 04-consume-soap-api

- 05-flows

- 06-vm-connector-pubsub

- 07-file-operations

- 08-for-each-iteration

- 09-choice-router

- 10-batch-processing

- 11-error-handling

- 12-cloud-deploy

- 13-mysql-db-operations

- 14-email-sender
