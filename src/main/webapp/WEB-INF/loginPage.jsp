<html>

<title>Welcome to Spring Boot</title>
<header>
    <script type="text/javascript">


    </script>

</header>
<body>
    <form id="loginFrm" action="/spring-security-poc/login" method="post">
        <table>
            <tr> Spring Boot Application </tr>
            <tr>
                <td>
                    Username
                </td>
                <td>
                    <input type="text" name="username" size="20"/>
                </td>
            </tr>
            <tr>
                <td>
                    Password
                </td>
                <td>
                    <input type="password" name="password" size="20"/>
                </td>
            </tr>
            <tr> <button type="submit" id="login_button">Submit</button> </tr>
        </table>
    </form>

</body>

</html>