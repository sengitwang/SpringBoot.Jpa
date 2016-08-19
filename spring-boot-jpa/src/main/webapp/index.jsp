<html charset="utf-8">
<head>
    <title>第一个JSP程序</title>

    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>


<input type="text" name="name" id="username"></br>

<input type="text" name="name" id="age"></br>


<button id="btn_submit">提交</button>


<script>
    $(function () {
        $("#btn_submit").click(function () {
            $.ajax({
                url: "http://localhost:8010/user/saveUser",
                type: 'post',
                data: JSON.stringify(getData()),
                dataType: 'json',
                contentType: "application/json",
                success: function (datas) {
                    alert(datas);
                }
            });
        });
    });

    function getData() {
        var json = {
            "name": $("#username").val(),
            "age": $("#age").val()
        };
        return json;
    }
</script>

</body>
</html>