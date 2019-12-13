var R = false, A = false, P=false, T=false;//用于验证表单

/*
//智能填表
$(function(){
    $("#addressId").val(-1);
    var ops = $("#address");//下拉列表
    $.ajax({
        type:"POST",
        url:"address",
        dataType:"json",
        async:false,
        success:function(data){
            var addrs = data.addrs;
            appendOps(addrs);
            ops.change(function(){
                fillForm(addrs,$(this).val());
            });
        }
    });

    //动态增加下拉列表
    function appendOps(addrs){
        for(var i=0;i<addrs.length;i++){
            ops.append("<option value='"+i+"'>"+i+":"+addrs[i].full_address.substr(0,6)+"...</option>");
        }
    }

    //根据选项智能填表
    function fillForm(addrs,index){
        if(index==-1){
            $("#receiveName").val('');
            $("#fullAddress").val('');
            $("#postalCode").val('');
            $("#mobile").val('');
            $("#addressId").val(-1);
            return;
        }
        A=true;
        R=true;
        P=true;
        $("#nameValidMsg>span").html('');
        $("#addressValidMsg>span").html('');
        $("#receiveName").val(addrs[index].receive_name);
        $("#fullAddress").val(addrs[index].full_address);
        $("#postalCode").val(addrs[index].postal_code);
        $("#mobile").val(addrs[index].mobile);

        $("#addressId").val(addrs[index].id);

    }
});
*/

//表单验证
$(function(){
    //验证收件人姓名
    $("#receiveName").blur(function(){
        R = false;
        var val = $(this).val();
        var info = $("#nameValidMsg>span");
        info.text("");
        if(val == ""){
            info.text("收件人不能为空");
        }else{
            info.html("<img src='../images/ajax_ok.jpg' />");
            R = true;
        }
    });

    //验证详细地址
    $("#fullAddress").blur(function(){
        A = false;
        var val = $(this).val();
        var info = $("#addressValidMsg>span");
        info.text("");
        if(val == ""){
            info.text("收信地址不能为空");
        }else{
            info.html("<img src='../images/ajax_ok.jpg' />");
            A = true;
        }
    });

    //验证邮编
    $("#postalCode").blur(function(){
        P = false;
        var val = $(this).val();
        var info = $("#codeValidMsg>span");
        info.text("");
        if(val == ""){
            info.text("邮政编码不能为空");
        }else if (!val.match(/^[0-9]{6,6}$/)) {
            info.text("邮编格式不正确");
        }
        else{
            info.html("<img src='../images/ajax_ok.jpg' />");
            P = true;
        }
    });

    //验证电话号码
    $("#mobile").blur(function(){
        T = false;
        var val = $(this).val();
        var info = $("#mobileValidMsg>span");
        info.text("");
        if(val == ""){
            info.text("手机号码不能为空");
        }else if (val.length!=11) {
            info.text("手机号码格式不正确");}
        else{
            info.html("<img src='../images/ajax_ok.jpg />");
            T = true;
        }
    });

    //当地址和收件人正确填写后，才能点击提交
    $("#btnClientRegister").click(function(){
        if(A && R && P && T){
            return true;
        }else{
            return false;
        }
    });


});