window.onload = function () {
    $(".connect p").eq(0).animate({"left": "0%"}, 600)
        .eq(1).animate({"left": "0%"}, 400);
};
//jquery.validate表单验证
$(document).ready(function () {
    let TL = 300;
    let pattern = /[0-9a-zA-Z_]+(\.[0-9a-zA-Z_]+)*@[0-9a-zA-Z_]+(\.[0-9a-zA-Z_]+)+/;
    let countdown = TL;

    function invokeSettime(obj) {
        settime(obj);

        function settime(obj) {
            if (countdown === 0) {
                $(obj).attr("disabled", false);
                $(obj).text("获取验证码");
                countdown = TL;
                return;
            }
            $(obj).attr("disabled", true);
            $(obj).text("" + countdown + " s 重新发送");
            countdown--;
            setTimeout(function () {
                    settime(obj)
                }
                , 1000);
        }
    }

    $("#verificationcode").click(function () {
        if ($("#registerForm").validate().element($(".email"))) {
            new invokeSettime(this);
        }
    });
    // $.validator.addMethod("myLoginVerify", function () {
    //     return false;
    // }, "用户名或密码不正确!");
//登陆表单验证
    $("#loginForm").validate({
        rules: {
            email: {
                required: true,//必填
                email: true
            },
            password: {
                required: true,
                rangelength: [6, 20]
            },
        },
        //错误信息提示
        messages: {
            email: {
                required: "必须填写邮箱",
                email: "请输入正确的邮箱格式"
            },
            password: {
                required: "必须填写密码",
                rangelength: "密码6到20位"
            }
        },
        // onkeyup: false,
        // onfocusout: false,
        submitHandler: function (form) {
            $.ajax({
                type: "POST",
                dataType: "text",
                url: "./api/user/login",
                data: {
                    email: $(".email").val(),
                    password: $(".password").val(),
                },
                success: function (result) {
                    if (result && result === 'true') {
                        // if (document.referrer === "http://localhost:8080/home.html")
                        //     $(location).attr('href', document.referrer);
                        // else if (document.referrer.indexOf("http://localhost:8080/myForum/article") !== -1) $(location).attr('href', document.referrer);
                         $(location).attr('href', "./purchase.html");

                    }
                    else {
                        $(".submitbtn").after("<label class='error'>用户名或密码错误!</label>");
                        setTimeout(function () {
                            $(".submitbtn").nextAll().remove();
                        }, 3000);
                    }
                },
                error: function () {
                    alert("error!");
                }
            });
        }


    });
//注册表单验证
    $("#registerForm").validate({
        rules: {
            email: {
                required: true,
                email: true,
                remote: {
                    url: "./api/user/register/isnotduplicate",
                    type: "post",
                    data: {
                        email: function () {
                            return $(".email").val();
                        }
                    }
                }
            },
            password: {
                required: true,
                minlength: 6,
                maxlength: 20,
            },
            confirm_password: {
                required: true,
                minlength: 3,
                equalTo: '.password'
            },
            veriinput: {
                required: true,
                minlength: 6,
                maxlength: 6
            }
        },
        //错误信息提示
        messages: {
            email: {
                required: "你还未输入邮箱地址",
                email: "请输入正确的email地址",
                remote: "邮箱不合法或已存在",
            },
            password: {
                required: "必须填写密码",
                minlength: "密码至少为6个字符",
                maxlength: "密码至多为20个字符",
            },
            confirm_password: {
                required: "请再次输入密码",
                minlength: "确认密码不能少于6个字符",
                equalTo: "两次输入密码不一致",//与另一个元素相同
            },
            veriinput: {
                required: "请输入验证码",
                minlength: "验证码为6位",
                maxlength: "验证码为6位"
            }
        },
        onkeyup: false,
        submitHandler: function (form) {
            let email = $(".email").val();
            let password = $(".password").val();

            $.ajax({
                type: "POST",
                dataType: "text",
                url: "./api/user/register/add/user",
                data: {
                    email: email,
                    password: password,
                    code: $(".veriinput").val(),
                },
                success: function (result) {
                    if (result && result === 'done') {
                        alert("注册成功！");
                        $.cookie('email', email);
                        $.cookie('password', password);
                        $(location).attr('href', 'login.html');
                    }
                    else if (result === 'wrongcode') {
                        alert("验证码错误！");
                    } else {
                        alert("注册失败！");
                    }
                },
                error: function () {
                    alert("error!");
                }
            });
        }
    });
    $(".getcode").click(function () {
        $.post("./api/user/register/request/code", {email: $(".email").val()});
    });
});
