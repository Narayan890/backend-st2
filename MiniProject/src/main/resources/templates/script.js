function checkEmail() {
    var email = document.getElementById("email").value;
    var mailformat = /^[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)$/;
    if (email.match(mailformat)) {
        document.getElementById("email-res").innerHTML = " ";
        return true;
    } else {
        document.getElementById("email-res").innerHTML = "You have entered an invalid email address!";
        document.details_form.Email.focus();
        return false;
    }

}


function checkLen() {
    var num = document.getElementById("mobile").value;
    if (num.length == 10) {
        document.getElementById("num-res").innerHTML = "";
        return true;
    } else {
        document.details_form.mobile.focus();
        document.getElementById("num-res").innerHTML = "Mobile Number must be 10 digit"
        return false;
    }

}


document.getElementById('form').addEventListener("submit", function(e) {
    e.preventDefault();
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var mob = document.getElementById('mobile').value;
    var table = document.getElementById("myTable");
    if (name === "" || mobile === "" || email === "") {
        alert("Field not be empty");
    } else if (name != "" && mobile != "" && email != "") {

        table.style.display = "block";
        var row = table.insertRow(1);

        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);

        var delete_btn = document.createElement("BUTTON");
        delete_btn.innerHTML = "DELETE";
        delete_btn.setAttribute("class", "delete-btn");
        cell1.innerHTML = name;
        cell2.innerHTML = mob;
        cell3.innerHTML = email;
        cell3.appendChild(delete_btn);
    }
})