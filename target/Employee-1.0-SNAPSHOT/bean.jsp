<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Staff Bean Information - Final</title>
</head>
<body>

    <h1>Staff Bean Information</h1>
    
    <jsp:useBean id="staff" class="person.bean.Staff" scope="request" />
    
    <jsp:setProperty name="staff" property="*" />
    
    <h2>Submitted Staff Details:</h2>
    
    <p>
        <strong>First Name:</strong> 
        <jsp:getProperty name="staff" property="firstname" />
    </p>
    
    <p>
        <strong>Last Name:</strong> 
        <jsp:getProperty name="staff" property="lastname" />
    </p>
    
    <p>
        <strong>Age:</strong> 
        <jsp:getProperty name="staff" property="age" />
    </p>

    <hr>
    
    <p>
        <strong>Full Name:</strong> 
        <jsp:getProperty name="staff" property="fullName" />
    </p>
    
    <p>
        <strong>Age Category:</strong> 
        <jsp:getProperty name="staff" property="ageCategory" />
    </p>

</body>
</html>