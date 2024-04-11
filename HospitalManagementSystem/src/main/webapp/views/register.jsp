<%@page language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>REGISTER</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .heading {
            text-align: center;
            color: #007bff;
            margin-bottom: 30px;
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="date"],
        input[type="submit"] {
            width: calc(100% - 10px);
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-top: 5px;
        }
        input[type="radio"] {
            margin-right: 5px;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .radio-group {
            display: flex;
            align-items: center;
        }
        .radio-group input[type="radio"] {
            margin-right: 5px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="heading">
        <h1>REGISTER HERE!!</h1>
    </div>
    <form action="/register" method="post">
        <div class="form-group">
            <label for="visitingId">Visiting ID:</label>
            <input type="text" name="visitingId" id="visitingId" required>
        </div>
        <div class="form-group">
            <label for="patientId">Patient ID:</label>
            <input type="text" name="patientId" id="patientId" required>
        </div>
        <div class="form-group">
            <label for="patientName">Name:</label>
            <input type="text" name="patientName" id="patientName" required>
        </div>
        <div class="form-group">
            <label for="age">Age:</label>
            <input type="text" name="age" id="age" required>
        </div>
        <div class="form-group">
            <label>Gender:</label>
            <div class="radio-group">
                <input type="radio" name="gender" value="Male" id="male"><label for="male">Male</label>
                <input type="radio" name="gender" value="Female" id="female"><label for="female">Female</label>
            </div>
        </div>
        <div class="form-group">
            <label for="mobile">Mobile:</label>
            <input type="text" name="mobile" id="mobile" required>
        </div>
        <div class="form-group">
            <label for="regDateTime">Visiting Date:</label>
            <input type="date" name="regDateTime" id="regDateTime" required>
        </div>
        <div class="form-group">
            <input type="submit" value="Register">
        </div>
    </form>
</div>
</body>
</html>