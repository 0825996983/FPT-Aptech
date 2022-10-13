var i = 1;
var msg = '';
do {
    msg += i + 'x 5 =' + (i *5) + '<br />';
    i++;
} white(i <= 10);
document.getElementById('answer').innerHTML = msg;