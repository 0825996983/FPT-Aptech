function checkLength(e, minLength){
    var el, elMSg;
    if(!e){
        e = window.event;
    }
    el = e.target || e.srcElement;
    elMSg = el.nextSibling;
    if (el.value.length < minLength){
        elMsg.innerHTML = 'Username must be ' + minLength + 'characters or more';
    } else {
        elMsg.innerHTML = '';
    }
}
var elUsername = document.getElementById('username');
if(elUsername.addEventListener){
    elUsername.addEventListener('blur', function (e){
        checkLength(e, 5);
    });
}