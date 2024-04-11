<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Employee Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            width: 80%;
            margin-top: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }
        h1 {
            margin-top: 0;
            margin-bottom: 20px;
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            border-bottom: 1px solid #ccc;
            text-align: center;
        }
        th {
            background-color: #007bff;
            color: #fff;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: lightcyan;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>All Employee Details</h1>
        <table>
            <tr>
                <th>VISITING ID</th>
                <th>PATIENT ID</th>
                <th>PATIENT NAME</th>
                <th>AGE</th>
                <th>GENDER</th>
                <th>MOBILE</th>
                <th>REGISTRATION DATE</th>
            </tr>

            <c:forEach var="patient" items="${patient}">
                <tr>
                    <td>${patient.visitingId}</td>
                    <td>${patient.patientId}</td>
                    <td>${patient.patientName}</td>
                    <td>${patient.age}</td>
                    <td>${patient.gender}</td>
                    <td>${patient.mobile}</td>
                    <td>${patient.regDateTime}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>