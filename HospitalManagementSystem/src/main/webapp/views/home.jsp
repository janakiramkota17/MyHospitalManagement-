<%@page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('med.jpg'); /* Replace 'med.jpg' with the actual path to your background image */
            background-size: cover; /* Cover the entire background */
            background-repeat: no-repeat; /* Do not repeat the background image */
            background-attachment: fixed; /* Fix the background image in place */
        }
        .container {
            width: 100%;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            padding: 20px;
            box-sizing: border-box;
        }
        .logo img {
            max-width: 200px; /* Adjust the size of the logo */
            height: auto; /* Maintain aspect ratio */
            margin-bottom: 20px; /* Add space between logo and hospital name */
        }
        .heading {
            color: #fff;
            font-size: 3em;
            margin-bottom: 20px; /* Add space between hospital name and navigation options */
        }
        .navitems {
            display: flex;
            flex-direction: row;
            align-items: center;
        }
        .navitems a {
            color: #fff;
            text-decoration: none;
            padding: 10px 20px;
            margin: 5px;
            border: 2px solid #fff;
            border-radius: 20px;
            transition: all 0.3s ease;
        }
        .navitems a:hover {
            background-color: #fff;
            color: #000;
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="logo">
            <img src="hoslog.webp" alt="Logo"> <!-- Replace 'medlog.jpeg' with the actual path to your logo image -->
        </div>

        <div class="heading">
            AOUSHADHI HOSPITALS
        </div>

        <div class="navitems">
            <a href="/addPatient">REGISTER</a>
            <a href="/patient_details">PATIENT RECORDS</a>
            <a href="/docpresc">CONSULT OUR DOCTORS</a>
            <a href="/bill">PHARMACY</a>
        </div>
    </div>

</body>
</html>
