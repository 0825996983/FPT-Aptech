var originalNumber = 10,23456;
var msg = '<h2>3 decimal places </h2><p>' + originalNumber + '</p>';
msg += '<h2> 3 decimal places</h2><p>' + ariginalNumber.toFixed(3)+ '</p>';
msg += '<h2> 3 digits</h2><p>' + ariginalNumber.toPrecision(3)+ '</p>';
var el = document.getElementById('info');
el.innerHTML = msg;