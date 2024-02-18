This Contact Management System Application consists of mainly the following 4 methods:

1. POST Method
2. GET Method
3. PUT Method
4. DELETE Method

Using these APIs, we can manipulate user data stored in the database. 
The database is user_table in this case which can be accessed through the H2 Console (http://localhost:8080/h2-console). 
The username is sa and password is sa1234

1. POST Method:

This method is used to submit data to be processed by a web server. It is commonly used for creating new resources on the server.

The endpoint for POST method is http://localhost:8080/api/v1/users

The JSON format for POST method is as follows
{
  "userName" : "Rohaan",
  "userPhoneNumber" : "123456789",
  "userEmailAddress" : "rohaan@gmail.com"
}

The user details are entered with the following parameters in the JSON body. After executing the POST method, the changes are reflected in the database.


2. GET Method:

This method is used to retrieve data from a web server. It is commonly used to retrieve information from a resource on the server.

The endpoint for GET method is http://localhost:8080/api/v1/users/{id}

After executing the GET method, the user details of the id mentioned are displayed.


3. PUT Method:

This method is used to update an existing resource on the server. It is commonly used to update data that has already been created.

The endpoint for PUT method is http://localhost:8080/api/v1/users/{id}

The JSON format for POST method is as follows
{
  "userName" : "Rohaan",
  "userPhoneNumber" : "987654321", 
  "userEmailAddress" : "rohaan@gmail.com"
}

The data to be updated is mentioned in the JSON body. After executing the POST method, the changes are reflected in the database.


4. DELETE Method:

This method is used to delete a resource from the server. It is commonly used to remove data that is no longer needed.

The endpoint for PUT method is http://localhost:8080/api/v1/users/{id}

After executing the DELETE method, the user details of the id mentioned in the endpoint are deleted in the database.













