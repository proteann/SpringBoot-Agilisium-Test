# Basic Authentication using Spring Boot

Instruction to Import project into Eclipse,STS : 

1.Download the zip or clone the Git repository.
2.Unzip the zip file (if you downloaded one)
3.Open Eclipse and 
	File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
	Select the right project
4.Choose the Spring Boot Application file (search for @SpringBootApplication)
5.Right Click on the file and Run as Java Application
6.You are all Set


### Endpoints

1 . http://localhost:8080/product/{domain}/api/getproductdetails  - GET

	For a path variable {domain} shall have any values such as domain1 or domain2 .
	For authentication use the credentials given below
	  UserName : product
	  Password : product123
	  
	Once the url is triggered with the given credentials, will get the response as given below
	
Sample output:
[
    {
        "id": 101,
        "name": "aaaa",
        "domain": "domain1",
        "configDetails": "config1"
    },
    {
        "id": 103,
        "name": "cccc",
        "domain": "domain1",
        "configDetails": "config1"
    },
    {
        "id": 105,
        "name": "eeee",
        "domain": "domain1",
        "configDetails": "config1"
    }
]


2 . http://localhost:8080/config/{domain}/api/getconfigdetails - GET	

	For a path variable {domain} shall have any values such as domain1 or domain2 .
	For authentication use the credentials given below
	  UserName : config
	  Password : config123
	  
	Once the url is triggered with the given credentials, will get the response as given below
	
Sample output:
	[
    {
        "id": 102,
        "name": "bbbb",
        "domain": "domain2",
        "configDetails": "config2"
    },
    {
        "id": 104,
        "name": "dddd",
        "domain": "domain2",
        "configDetails": "config2"
    },
    {
        "id": 106,
        "name": "ffff",
        "domain": "domain2",
        "configDetails": "config2"
    }
]



