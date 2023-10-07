<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Select Subjects You Want</title>
</head>
<body>
    <h2>Choose Subjects:</h2>
    <form action="xer1">
        <label>
            <input type="checkbox" name="subjects" value="CAO"> CAO
        </label><br>
        <label>
            <input type="checkbox" name="subjects" value="TOC"> TOC
        </label><br>
        <label>
            <input type="checkbox" name="subjects" value="DL"> DL
        </label><br>
        <label>
            <input type="checkbox" name="subjects" value="Java"> Java
        </label><br>
        <label>
            <input type="checkbox" name="subjects" value="Stats"> Stats
        </label><br>
        <label>
            <input type="checkbox" name="subjects" value="DBMS"> DBMS
        </label><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
