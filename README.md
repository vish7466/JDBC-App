# JDBC API

The **JDBC (Java Database Connectivity)** API is a standard provided by **SUNMS** to interact with relational databases in Java applications.

## Overview
- **JDBC API** enables Java programs to communicate with databases.
- **SUNMS** provides a `rt.jar` file that is included during JDK installation, allowing developers to use JDBC.
- To use JDBC in a Java program, you need the following packages:
  - `java.sql.*`
  - `javax.sql.*`
- **API** refers to a set of rules and guidelines containing interfaces. Database vendors provide implementations for these interfaces.

## Key Points
- **DB-Vendor Implementation**:
  - Database vendors offer implementations for the API's abstract methods.
  - These implementations are released as **jars** for developers to use.
- Depending on the database in use, you need to include the appropriate **jar file** provided by the database vendor.

---

## Steps to Interact with a Database (SUNMS Guidelines)

1. **Load and Register the Driver**  
   Load the database driver class to initialize the connection.  
   
2. **Establish the Connection**  
   Connect to the database using the driver.  

3. **Create a Statement**  
   Use one of the following to send queries to the database:
   - `Statement`
   - `PreparedStatement`
   - `CallableStatement`  

4. **Execute the Query**  
   Use methods to execute database operations:
   - For SELECT queries:
     ```java
     public ResultSet executeQuery(String sqlQuery) throws SQLException
     ```
   - For non-SELECT queries (e.g., INSERT, UPDATE, DELETE):
     ```java
     public int executeUpdate(String sqlNonSelectQuery) throws SQLException
     ```

5. **Process the Result**  
   Handle the results returned by the query (e.g., `ResultSet` for SELECT).  

6. **Close the Resources**  
   Free up database and connection resources.  

7. **Handle SQLExceptions**  
   Manage exceptions that occur during database interactions.

---

This guide provides the foundational steps and concepts for working with the **JDBC API** in Java applications.
