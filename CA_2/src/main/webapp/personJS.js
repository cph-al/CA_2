$(document).ready(function ()
{
    addP();
    editP();
    deleteP();
});

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
                email: email}),
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
        var id = $("#editID").val();
        var fn = $("editFN").val();
        var ln = $("#editLN").val();
        var email = $("#editEmail").val();

        $.ajax({
            url: "http://localhost:8080/CA_2/api/person/edit/"+id,
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify({
                id: id,
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

function deleteP()
{
    $("#deleteP").click(function ()
    {
        var id = $("#deleteID").val();

        $.ajax({
            url: "http://localhost:8080/CA_2/api/person/delete/"+id,
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                id: id}),
            success: function () 
            {
                console.log("Person "+id+" was deleted");
            }
        });
    });
}