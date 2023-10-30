<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Select Subjects You Want</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Raleway', sans-serif;
            background: #34495E;
            color: #fff;
            display: flex;
            flex-direction: column; /* Change flex-direction to column */
            align-items: center; /* Center content vertically */
            min-height: 100vh;
            overflow: hidden;
        }

        .container {
            background: rgba(0, 0, 0, 0.6);
            border-radius: 10px;
            padding: 0px 20px 20px 20px;
            margin: 20px; /* Adjust margin to move the container down */
        }

        h2 {
            font-size: 36px;
            margin-bottom: 30px;
            text-align: left;
        }

        form {
            text-align: left;
            padding: 20px;
        }

        label {
            font-size: 18px;
            display: block;
            margin-bottom: 20px;
            text-align: left;
        }

        input[type="checkbox"] {
            margin-right: 10px;
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
        }

        input[type="submit"]:hover {
            background-color: #27ae60;
            transform: scale(1.1);
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="xer1">
            <h2>Choose Subjects:</h2>
            <label>
                <input type="checkbox" name="subjects" value="CN"> CN
            </label>
            <label>
                <input type="checkbox" name="subjects" value="OS"> OS
            </label>
            <label>
                <input type="checkbox" name="subjects" value="ST"> ST
            </label>
            <label>
                <input type="checkbox" name="subjects" value="SCAM"> SCAM
            </label>
            <label>
                <input type="checkbox" name="subjects" value="SPM"> SPM
            </label>
            <label>
                <input type="checkbox" name="subjects" value="REM"> REM
            </label>
            <label>
                <input type="checkbox" name="subjects" value="ISS"> ISS
            </label>
            <label>
                <input type="checkbox" name="subjects" value="SAD"> SAD
            </label>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
