<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
            width: 500px; /* Adjust the width as needed */
            margin: 0 auto; /* Center the container horizontally */
        }
        h1 {
            font-size: 36px;
            margin-bottom: 20px;
        }

        .button-container {
            display: flex;
            justify-content: center;
        }

        .button-container a {
            text-decoration: none;
        }

        .button-container button {
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

        .button-container button:hover {
            background-color: #27ae60;
            transform: scale(1.1);
        }
    </style>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
</head>
<body>
    <div class="container">
        <h1>Select preferred option:</h1>
        <div class="button-container">
            <a href="xer4?ts=1">
                <button>Apply Time Constraint</button>
            </a>
            <a href="xer4?ts=2">
                <button>Neglect Time Constraint</button>
            </a>
        </div>
    </div>
</body>
</html>
