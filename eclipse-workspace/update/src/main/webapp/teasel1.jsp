<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Raleway', sans-serif;
            background: #34495E;
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            overflow: hidden;
        }

        .container {
            text-align: center;
            background: rgba(0, 0, 0, 0.6);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.5);
            width: 400px;
            margin: 0 auto;
        }

        form {
            margin-top: 20px;
            text-align: center;
        }

        input[type="text"] {
            padding: 10px;
            font-size: 18px;
            font-family: 'Raleway', sans-serif;
            background-color: #fff; /* Set the background color to white */
            border: none;
            border-radius: 5px;
            color: #000; /* Change text color to black */
            margin: 10px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            font-size: 18px;
            font-family: 'Raleway', sans-serif;
            background-color: #2ecc71;
            border: none;
            border-radius: 5px;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s ease, transform 0.3s ease;
            margin: 10px;
        }

        input[type="submit"]:hover {
            background-color: #27ae60;
            transform: scale(1.1);
        }
        h1 {
            font-size: 30px; /* Decreased the font size to 24px */
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="xer3">
            <h1>Enter the teachers you want separated by commas:</h1>
            <input type="text" name="teacher" multiple><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
