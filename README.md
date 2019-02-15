
# Restaurant_Review-Sysytem-MVC
A Play2 framework based java web application

This is a Restaurant Review System where customer rate the restaurant and owner can create a restaurant.

## How to run

Start mysql server and edit the conf file under ...\RestaurantReview\conf\application.conf

-enter database name
-enter mysql admin name
-enter mysql password 

To successfully run the application, system needs two things.

1. SBT to run Play2 framework.
2. MySql server.

In the application.conf file present in conf folder, please change default.username and default.password of MySql server according to your mySQL server credentials. The default.url points to the database schema it is connected to.


To insert some default data into the database you can run https://github.com/hitennirmal/Restaurant_Review-Sysytem-MVC/blob/master/SQL/sql%20queries.txt file. Though it is not needed to have default values. The application is developed in a way that there is no dependency on default data.


Just run the following command via sbt and it will automatically download all the play dependencies.

- sbt update
- sbt compile
- sbt run

Initially, it will take 10-15 minutes to download all the resources needed.
Once the project is started to go to the web browser and type localhost:9000

Follow the below given flow to go through the application.

1. Create Owner 
2. Login as Owner.
(Note: Use the same credentials used in Registration)
3. Create Restaurnt.
4. Create a Customer. 
5. Register as Customer. 
6. Login as Customer.
(Note: Use the same credentials used in Registration)
7. Search Restaurnt based on pincode
8. Rate Restaurnat
9. Review Restaurant
