var saying = 'Home sweet home';
var msg = '<h2> length</h2><p>' + saying.length + '<p/>';
msg += '<h2> uppeecase </h2><p>'+ saying.toUpperCase() + '</p>';

msg += '<h2> lowercase</h2><p>'+ saying.toUpperCase() + '</p>';
msg += '<h2> chracter index: 12</h2><p>'+ saying.charAt(12) + '</p>';
msg += '<h2> first ee </h2><p>'+ saying.indexOf('ee') + '</p>';
msg += '<h2> last e </h2><p>'+ saying.lastIndexOf('e') + '</p>';
msg += '<h2> character index: 8-14</h2><p>'+ saying.substring(8, 14) + '</p>';
msg += '<h2>replace</h2><p>'+ saying.replace( 'me', 'w') + '</p>';
var el = document.getElementById( 'info');
el.innerHTML = msg;
