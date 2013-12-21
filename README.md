LogToDatabaseMapper
===============================================================================================

*Web application that transfer log file format to mongo database

*It also add the logs to mongoDB or Mysql database.

*It use apache camel with the aggregator to add batch records to the database. 

===============================================================================================


SQL To create the MYSQL Table:


CREATE TABLE activity
( 
id int PRIMARY KEY NOT NULL PRIMARY KEY AUTO_INCREMENT, 
serverOrClient varchar(100), 
timestampVal timestamp, 
webContainerOrThreadName varchar(100), 
userID varchar(100), 
browserName varchar(100), 
browserVersion varchar(100), 
requestURL varchar(200), 
userAction varchar(100), 
currentTabForClientOnly varchar(100), 
editMode varchar(100), 
metricClass varchar(100), 
policyId varchar(100), 
policyNumber varchar(100), 
sessionId varchar(100), 
elapsedTimeServerOnly varchar(100), 
submitTime varchar(100), 
loadTime varchar(100), 
readyTime varchar(100), 
totalTime varchar(100) 
) ; 
