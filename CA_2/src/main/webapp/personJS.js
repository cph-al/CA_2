$(document).ready(function ()
{
    addP();
    editP();
    deleteP();
});

//function all()
//{
//    $("#newQ").click(function ()
//    {
//        $.getJSON("api/person/all", function (result)
//        {
//            $("#quote").text(result.quote);
//        });
//    });
//}

function addP()
{
    $("#addP").click(function ()
    {
        var fn = $("#newFN").val();
        var ln = $("#newLN").val();
        var email = $("#newEmail").val();

        $.ajax({
            url: "http://localhost:8080/CA_2/api/person/add",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                firstName: fn,
                lastName: ln,
                email: email, }),
            success: function ()
            {
                console.log("Added new person:" + fn + " " + ln + " " + email);
            }
        });
    });
}

function editP()
{
    $("#editP").click(function ()
    {
        var person = '{"firstName":"' + $("#editFN").val() + '","lastName": "' + $("#editLN").val() + '"}';
        var id = $("#id").val();
        console.log("Edited person with " + id + " (" + person + ")");

        $.ajax({
            url: "api/person/" + id,
            type: "PUT",
            data: person,
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            success: function () {}
        });
    });
}

function deleteP()
{
    $("#deleteP").click(function ()
    {
        var id = $("#id1").val();
        console.log("Quote " + id + " was deleted");

        $.ajax({
            url: "api/quote/" + id,
            type: "DELETE",
            data: id,
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            success: function () {}
        });
    });
}