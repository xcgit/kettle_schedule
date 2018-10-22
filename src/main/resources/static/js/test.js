

$("#test").click(

    function () {
        debugger;
        var path = $("#p1").val();
        debugger;
        alert($("#p1").val());
        $.ajax({
            type: "post",
            url: "../ceshi",
            data: {"path": path},
            success: function (data) {
                //alert(data);
            }

        })
    }
);





