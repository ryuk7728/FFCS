<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
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

        a {
            text-decoration: none;
        }

        h1 {
            font-size: 36px;
            margin-bottom: 20px;
        }

        button {
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

        button:hover {
            background-color: #27ae60;
            transform: scale(1.1);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Select preferred option:</h1>
        <a href="xer2?tea=1">
            <button>Specific Teachers</button>
        </a>
        <a href="xer2?tea=2">
            <button>See Options</button>
        </a>
    </div>
</body>
</html>
