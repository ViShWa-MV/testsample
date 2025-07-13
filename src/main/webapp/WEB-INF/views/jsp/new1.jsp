<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>STUDENT MANAGEMENT SYSTEM</title>
   
</head>
<body>
<div id="nav-bar">
<h1>Student Management System</h1>
<div id="nav-items">
<button onclick="window.location.href='login'" class="nav-buttons">Logout</button>
<button onclick="window.location.href='signup'" class="nav-buttons">Signup</button>
<button onclick="window.location.href='home'" class="nav-buttons"> Back</button>
               
</div>

</div>
<div id="center">    
<h1>Insert Student Details</h1>
    <div id="outerdiv">
        <form action="/ui/update2" method="post">
        	<label>id</label>
        	<input name="rollno" class="input-field" required><br>
            <label>Name</label><br></br>
            <input name="name" class="input-field" required><br>
            <label>Father Name</label><br></br>
            <input name="fathername" class="input-field" required><br>
            <label>Mother Name</label><br></br>
            <input name="mothername" class="input-field" required><br>
            <label>Register Number</label><br></br>
            <input name="regno" class="input-field" required><br>
             <label>cgpa</label><br></br>
            <input name="cgpa" class="input-field" required><br>
            <label>Department</label><br></br>
            <input name="dept" class="input-field" required><br></br>
             <label>Address</label><br></br>
            <input name="address" class="input-field" required><br>
             <label>Phone Number</label><br></br>
            <input name="phonenumber" class="input-field" type="tel" pattern="[89][0-9]{9}" maxlength="10" minlength="10" required><br>

            <button id="log2" type="submit">Submit</button>
        </form>
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
        height: 120vh; /* Full viewport height */
        flex-direction: column;
    }

        h1 {
            color: #ff6600;
            font-size: 40px;
            text-align: center;
            padding: 20px;
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

        .input-field {
            width: 100%;
            height: 45px;
            border-radius: 7px;
            border: 1px solid #e6e6e6;
            padding: 10px;
            font-size: 15px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        #log2 {
            display: block;
            width: 100%;
            height: 45px;
            background-color: #ff6600;
            color: white;
            font-size: 20px;
            border-radius: 5px;
            border: none;
            cursor: pointer;
        }

        label {
            font-size: 18px;
            font-weight: bold;
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

        @media(max-width: 500px) {
            h1 {
                font-size: 30px;
                padding: 15px;
            }

            #outerdiv {
                padding: 20px;
            }
        }
    </style>
</html>
