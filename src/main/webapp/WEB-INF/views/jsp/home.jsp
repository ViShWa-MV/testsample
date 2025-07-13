<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>home-page</title>
</head>

<body>

<div id="nav-bar">
<h1>Student Management System</h1>
<div id="nav-items">
<button onclick="window.location.href='login'" class="nav-buttons">Logout</button>
<button onclick="window.location.href='signup'" class="nav-buttons">Signup</button>
<button onclick="window.location.href='login'" class="nav-buttons"> Back</button>
               
</div>

</div>
<div id="center">
    <h1 style="text-align:center;">Respective Operations</h1>
<div id="outerdiv">
<div class="button-split">
<form action="/li/logined" method="post">
<button id="insertbutton" class="content-buttons">Insert Students </button></form>
<form action="/ui/deletelist" method="post">
<button id="deletebutton" class="content-buttons" type="submit">Delete Student</button></div></form>
<br></br>
<div class="button-split">
<form action="/ui/submittedlist" method="post">
<button id="viewbutton" class="content-buttons" type="submit">View DataBase Entries</button></form>
<form action="/ui/update" method="post">
<button id="updatebutton" class="content-buttons" type="submit">Update Student Entries</button>
</form></div>

</div>
<br></br>
<br></br>
<div id="outerdiv1">
<h2 style="text-align:center;">about us</h2>
<p>Welcome to the Student Management System, a user-friendly web application designed to simplify the management of student information within educational institutions.

This project is built using Spring Boot, JSP, and MySQL, with a focus on providing a clean and responsive user interface. It offers features like:<br></br>

*Student Registration<br></br>

*Login Authentication<br></br>

*Insert, Update, View, and Delete Student Records<br></br>

*Search by Roll Number<br></br>



Our system streamlines administrative tasks by offering a centralized platform to manage student data efficiently. It supports real-time database operations and ensures data integrity with robust backend validation.

This application is ideal for schools, colleges, or training centers looking to digitize and modernize their student management processes.</p>
</div>
</div>
</body>
<style>
    #center {
        margin: 0;
        padding: 0;
        background-color: white;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 110vh; /* Full viewport height */
        flex-direction: column;
    }


    #outerdiv {
        width: 90%;
        max-width: 500px;
        background-color: #ffe0cc;
        border-radius: 30px;
        padding: 30px;
        opacity: 0.9;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        display: flex;
        flex-direction: column;
    }
     #outerdiv1{
        width: 90%;
        background-color: #ffe0cc;
        border-radius: 30px;
        padding: 30px;
        opacity: 0.9;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        display: flex;
        flex-direction: column;
    }
    

  

    .content-buttons {
        display: block;
        width: 200px;
        height: 45px;
        background-color: #ff6600;
        color: white;
        font-size: 20px;
        border-radius: 5px;
        border: none;
        cursor: pointer;
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
    .button-split
    {
        display: flex; flex-direction: row; gap:80px;

    }
    @media(max-width: 500px;)
     {
        /* h1 {
            font-size: 30px;
            padding: 15px;
        }
*/
        #outerdiv {
            padding: 20px;
        }
    }
    </style>
</html>