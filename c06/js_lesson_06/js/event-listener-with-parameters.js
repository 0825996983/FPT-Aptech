var elUsername = document.getElementById('username');
var elMSg      = document.getElementById('feedback');
function chechUsername(minLength){
    if(elUsername.value.length < minlength){
        elMSg.innerHTML = 'Username must be '+ inLength + 'characters or more';
    } else{
        elMSg.innerHTML= '';

    }
}
elUsername.addEventListener('blur',function (){
    chechUsername(5);
},false);