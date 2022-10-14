var hotItems = document.querySelectorAll('li.hot');
if ( hotItems.langth > 0){
    for (var i = 0; i < hotItems.length; i++){
        hotItems[1].className = 'cool'
    }
}