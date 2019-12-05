function validateForm() {
    const messagePar = document.getElementById("message");
    
    const formInputs = document.forms[0].elements;
    
    let fNameInput = formInputs[0];
    
    if (fNameInput.value.length > 5) {
        messagePar.innerText = "Name length more than 5"
        return false;
    }
    
    if (formInputs[1].value.length > 5) {
        return false;
    }
    
    return true;
}
function sendToEmail(){
alert('На почту' + + 'отправлено письмо счастья')
}
function validateForm2() {
    const messagePar = document.getElementById("message");
    
    const form = document.forms[0];
    const formInputs = document.forms[0].elements;
    
    let fNameInput = formInputs[0];
    
    if (fNameInput.value.length > 5) {
        messagePar.innerText = "Name length more than 5"
    }
    else {
        form.submit();
    }
}
