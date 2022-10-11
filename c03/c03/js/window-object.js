var msg = ' <h2>browser window</h2><P>width: ' + window.innerWidth + '</P>';
msg += '<p>height: ' + window.innerHeight + '</p>';

msg += '<h2>history</h2><p>items:' + window.history.length + '</p>';

msg += '<h2>screen</h2><p>width:' + window.screen.length + '</p>';
msg += '<p> height:' + window.screen.height + '</p>';
var el = document.getElementById('info');
el.innerHTML = msg;
alert('Current page:' + window.location);