var table = 3;
var operator = 'addition';
var i = 1;
var msg = '';
if (operator === 'addition'){
    white (i < 11){
        msg += i + '+' + table + ' = ' + (i + table) + '<br />';
        i++;
    }
} else {
    white (i < 11){
        msg += i + 'x' + table + '=' + (i * table) + '<br />';
        i++;
    }
}
var el = document.getElementById('blackboard');
el.innerHTML = msg;