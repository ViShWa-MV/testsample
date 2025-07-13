<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.springdatabase.StudentEntity" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
    
          
       
    <style>
        body {
            margin: 0;
            padding: 0;
            background-color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
          
        }

        h1 {
            font-size: 40px;
            text-align: center;
            padding: 20px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }

        table {
            font-family: Arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
             white-space: nowrap;
            
            
        }
       th:nth-child(9),
      td:nth-child(9) {
      white-space: normal;   
      max-width: 200px;     
     word-wrap: break-word;
       }
    th:nth-child(1),
th:nth-child(2),
th:nth-child(3),
th:nth-child(8),
td:nth-child(1),
td:nth-child(2),
td:nth-child(3),
td:nth-child(8) {
    border: 1px solid #dddddd;
    text-align: center;
    padding: 8px;
    white-space: nowrap;
}

       
       
       
        .outdiv {
            width: 900px;
            padding: 30px;
        }
          
.logo{
	color:white;
}

 #nav-bar{
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: space-between;
        background-color: #ffe0cc;
        padding: 5px 15px 5px 10px;
       
        width:100%;
    }
    .nav-buttons{
        width: 80px;
        height: 35px;
        display: block;
        background-color: #ff6600;
        color: white;
        font-size: 20px;
        border-radius: 5px;
        border: none;
        cursor: pointer;
    }
    #nav-items
    {
        display: flex;
        flex-direction: row;
        gap: 20px;
    }
    </style>
</head>
<body>

	<div id="nav-bar">
<h1>Student Management System</h1>
<div id="nav-items">
<button onclick="window.location.href='login'" class="nav-buttons">Logout</button>
<button onclick="window.location.href='signup'" class="nav-buttons">Signup</button>

               
</div>

</div>
    <h2>Student Details</h2>

    <div class="outdiv" >
       <table>
            <tr>
                <th>Unique Id</th>
                <th>Register Number</th>
                <th>Name</th>
                <th>Department</th>
                <th>Father Name</th>
                <th>Mother Name</th>
                <th>Phone Number</th>
                <th>CGPA</th>
                <th>Address</th>
            </tr>

            <%
            List<StudentEntity> students = (List<StudentEntity>) request.getAttribute("students");
                            if (students != null && !students.isEmpty()) {
                                for (StudentEntity student : students) {
            %>
                        <tr>
                            <td><%= student.getRollno() %></td>
                            <td><%= student.getRegno() %></td>
                            <td><%= student.getName() %></td>
                            <td><%= student.getDept() %></td>
                            <td><%= student.getFathername() %></td>
                            <td><%= student.getMothername() %></td>
                            <td><%= student.getPhonenumber() %></td>
                            <td><%= student.getCgpa() %></td>
                            <td ><%= student.getAddress() %></td>
                        </tr>  
            <%
                    }
                } else {
            %>
                    <tr><td colspan="4">No students found.</td></tr>
            <%
                }
            %>
        </table>
    </div>
      <div class="nav-items">
            	<button onclick="window.location.href='home'" class="nav-buttons"> Back</button>
             
            </div>
</body>
</html>
