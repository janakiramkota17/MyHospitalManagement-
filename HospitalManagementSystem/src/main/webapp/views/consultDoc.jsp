<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ConsultDoc</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            border: 2px solid #ccc;
            border-radius: 10px;
            background-color: #fff;
        }

        .doc {
            display: flex;
            justify-content: center;
            margin-bottom: 20px;
        }

        .doc table {
            border-collapse: collapse;
        }

        .doc table td {
            padding: 10px;
        }

        .tabs {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .tabs label {
            display: flex;
            align-items: center;
            margin-bottom: 10px;
        }

        .tabs input[type="checkbox"] {
            margin-right: 5px;
        }

        .tabs input[type="submit"] {
            background-color: blue;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .tabs input[type="submit"]:hover {
            background-color: #007bff;
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="/medicalList" enctype="application/x-www-form-urlencoded">
            <div class="doc">
                <table>
                    <tr>
                        <td>Enter your visiting id:</td>
                        <td><input type="text" name="visitingId"></td>
                    </tr>
                    <tr>
                        <td>Enter patient ID:</td>
                        <td><input type="text" name="patientId"></td>
                    </tr>
                    
                </table>
            </div>

            <div class="tabs">
                <%-- Dynamically generate checkboxes based on medicines available --%>
                <%-- Replace these with the actual medicines you have --%>
                <label><input type="checkbox" name="medicines" value="Dolo 650"> Dolo 650</label>
                <label><input type="checkbox" name="medicines" value="Paracetmol"> Paracetmol</label>
                <label><input type="checkbox" name="medicines" value="Andial"> Andial</label>
                <label><input type="checkbox" name="medicines" value="Benadryl"> Benadryl</label>
                <label><input type="checkbox" name="medicines" value="Citrizen"> Citrizen</label>
                <label><input type="checkbox" name="medicines" value="Vitamin A"> Vitamin A pills</label>
                <label><input type="checkbox" name="medicines" value="Vitamin B"> Vitamin B pills</label>
                <label><input type="checkbox" name="medicines" value="Vitamin C"> Vitamin C pills</label>

                <input type="submit" value="Print Invoice">
            </div>
        </form>
    </div>
</body>
</html>
