
<!DOCTYPE html>
<html>

<head>
    <title>Class Start Time</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Raleway', sans-serif;
            background: #34495E;
            color: #fff;
            display: flex;
            flex-direction: column;
            align-items: center;
            min-height: 100vh;
            overflow-y: auto; /* Allow scrolling on the entire page */
        }

        .container {
            background: rgba(0, 0, 0, 0.6);
            border-radius: 10px;
            padding: 20px;
            margin: 20px;
            width: 400px;
        }

        h1 {
            font-size: 32px;
            text-align: center; /* Center text horizontally */
        }

        h3 {
            font-size: 24px;
            margin: 20px 0; /* Add spacing between h3 elements */
        }

        label {
            font-size: 18px;
            display: block;
            margin-bottom: 10px;
            text-align: left;
        }

        input[type="radio"] {
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
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
</head>

<body>
    <div class="container">
        <form action="xer6">
            <h1>Select your preferred end time:</h1>

            <h3>Monday</h3>
            <label>
                <input type="radio" name="classEndTimeMonday" value="1"> 3:40
            </label><br>
            <label>
                <input type="radio" name="classEndTimeMonday" value="2"> 5:30
            </label><br>
            <label>
                <input type="radio" name="classEndTimeMonday" value="3"> 7:20
            </label><br>
            <label>
                <input type="radio" name="classEndTimeMonday" value="4"> No evening
            </label><br>

            <h3>Tuesday</h3>
            <label>
                <input type="radio" name="classEndTimeTuesday" value="1"> 3:40
            </label><br>
            <label>
                <input type="radio" name="classEndTimeTuesday" value="2"> 5:30
            </label><br>
            <label>
                <input type="radio" name="classEndTimeTuesday" value="3"> 7:20
            </label><br>
            <label>
                <input type="radio" name="classEndTimeTuesday" value="4"> No evening
            </label><br>

            <h3>Wednesday</h3>
            <label>
                <input type="radio" name="classEndTimeWednesday" value="1"> 3:40
            </label><br>
            <label>
                <input type="radio" name="classEndTimeWednesday" value="2"> 5:30
            </label><br>
            <label>
                <input type="radio" name="classEndTimeWednesday" value="3"> 7:20
            </label><br>
            <label>
                <input type="radio" name="classEndTimeWednesday" value="4"> No evening
            </label><br>

            <h3>Thursday</h3>
            <label>
                <input type="radio" name="classEndTimeThursday" value="1"> 3:40
            </label><br>
            <label>
                <input type="radio" name="classEndTimeThursday" value="2"> 5:30
            </label><br>
            <label>
                <input type="radio" name="classEndTimeThursday" value="3"> 7:20
            </label><br>
            <label>
                <input type="radio" name="classEndTimeThursday" value="4"> No evening
            </label><br>

            <h3>Friday</h3>
            <label>
                <input type="radio" name="classEndTimeFriday" value="1"> 3:40
            </label><br>
            <label>
                <input type="radio" name="classEndTimeFriday" value="2"> 5:30
            </label><br>
            <label>
                <input type="radio" name="classEndTimeFriday" value="3"> 7:20
            </label><br>
            <label>
                <input type="radio" name="classEndTimeFriday" value="4"> No evening
            </label><br>

            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>
