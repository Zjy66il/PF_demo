$(function () {
    var N = false, P = false,R = false;
    $("#btnClientRegister").click(function () {
        if (N && R && P) {
            return true;
        } else {
            return false;
        }

    })
    /*
    注册界面AJAX
    检测用户名是否合法，是否已被注册
     */
    $("#txtuserName").blur(function () {
        N = false;
        var val = $(this).val();
        var info = $("#name\\.info");
        info.html("");

        if (val == "") {
            info.text("用户名不能为空");
        } else {
            info.text("正在检测")
            $.post(
                    "registVali!valiName",
                    {'user.username':val},
                    function(data){
                        if(data.flag){
                            info.html("该用户名可用");
                            N = true;
                        }else{
                            info.text("用户名已存在");
                        }
                    }
                );

            }
    });

    /*
    检测重复密码是否一致
     */
    $("#txtPassword").blur(function () {
        P = false;
        var val = $(this).val();
        var info = $("#password\\.info");
        info.html("");

        if (val == "") {
            info.text("密码不能为空");
        }else if(!val.match(/^[a-zA-Z0-9]{6,20}/)){
            info.text("密码格式不正确");
        }else {
            P = true;

        }
    })

    $("#txtRepeatPass").blur(function () {
        R = false;
        var val = $(this).val();
        var info = $("#repassword\\.info");
        info.html("");

        if (val == "") {
            info.text("验证密码不能为空");
        }else if(val != $("#txtPassword").val()){
            info.text("两次密码输入不一致");
        }else {
            R = true;

        }
    })
});