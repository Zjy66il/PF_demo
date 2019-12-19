$(function(){
    $(".desc").next("a").click(function(){
        var desc = $(this).siblings('.desc').val();
        $(this).attr('href',
            $(this).attr('href')+desc);
        return true;
    });

});