<html>
    <head>
        <title>springboot获取json数据</title>
    </head>
    <body>
        <table border="1px" cellpadding="10px" cellspacing="1px" align="center">
            <tr>
                <th>id</th>
                <th>用户名</th>
                <th>密码</th>
                <th>姓名</th>
            </tr>
            <#list all as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.name}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>