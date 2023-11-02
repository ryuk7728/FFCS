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

        select {
            padding: 5px; /* Increased padding */
            font-size: 15px; /* Increased font size */
            font-family: 'Raleway', sans-serif;
            background-color: #fff;
            border: none;
            border-radius: 5px;
            color: #000;
            margin: 10px;
        }

        input[type="number"] {
            padding: 10px; /* Increased padding */
            font-size: 15px; /* Increased font size */
            font-family: 'Raleway', sans-serif;
            background-color: #fff;
            border: none;
            border-radius: 5px;
            color: #000;
            margin: 10px;
        }

        input[type="submit"] {
            padding: 10px 20px; /* Increased padding */
            font-size: 20px; /* Increased font size */
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
            font-size: 30px;
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="xer3" id="teacherForm">
            <h1>Enter the number of teachers:</h1>
            <input type="number" id="teacherCount" name="teacherCount" min="1">
            <button type="button" id="generateDropdowns">Enter</button>
            <div id="teacherDropdowns"></div>
            <input type="submit" value="Submit">
        </form>
    </div>

<script>
    // Define an array of teacher names
    var teacherNames = [
        "Sumathy S SPM",
        "Kamalakannan SAD",
        "Kamalakannan ST",
        "Senthil Kumar U SAD",
        "Sureka S SAD",
        "Sree Dharinya SAD",
        "Sree Dharinya REM",
        "Felicita S A M SCAM",
        "Mangayarkarasi R ISS",
        "Rajesh Kaluri ST",
        "Senthil Kumar M ST",
        "Thilagavathi M REM",
        "Sweta Bhattacharya REM",
        "Karthikeyan P REM",
        "Vijayan E REM",
        "Chemmalar Selvi G REM",
        "Prasanna M ST",
        "Iyapparaja M ST",
        "Arivuselvan ST",
        "Arivuselvan OS",
        "Vinoth Kumar V ST",
        "Asis Kumar Tripathy OS",
        "Kumar P J OS",
        "Senthil Kumar P OS",
        "Harshita Patel OS",
        "Sivashankari R OS",
        "Angu Lakshmi M OS",
        "Thandeeswaran R CN",
        "Rahamathunnisa U CN",
        "Vani M P CN",
        "Navaneethan C CN",
        "Priya M CN",
        "Anbarasa Kumar A CN"
    ];

    document.getElementById('generateDropdowns').addEventListener('click', function () {
        var teacherCount = document.getElementById('teacherCount').value;
        var dropdownsContainer = document.getElementById('teacherDropdowns');
        dropdownsContainer.innerHTML = '';

        for (var i = 0; i < teacherCount; i++) {
            var dropdown = document.createElement('select');
            dropdown.name = 'teacher' + (i + 1);

            // Add teacher name options
            <!-- Inside your JavaScript code where you create the dropdown options -->
for (var j = 0; j < teacherNames.length; j++) {
    var option = document.createElement('option');
    option.value = teacherNames[j]; // Set the value to the teacher name
    option.text = teacherNames[j];
    dropdown.appendChild(option);
}


            dropdownsContainer.appendChild(dropdown);
        }
    });
</script>
</body>
</html>
