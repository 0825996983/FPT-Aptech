var score = 75;
var msg = '';
function congrotulate(){
    msg += 'Congratulations!';

}
if (score >= 50){
    congrotulate();
    msg += 'Proceed to the next round';

}
 var el = document.getElementById('answer');
el.innerHTML = msg;
