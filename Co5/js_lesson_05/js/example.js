var list = document.getElementsByTagName('ul')[0];
var newItemLast = document.createElement('li');
var newTextLast = document.createTextNode('cream');
newItemLast.appendChild(newItemLast);
list.appendChild(newItemLast);

var newItemFirst = document.createElement('li');
var NewTextFirst = document.createTextNode('kale');
newItemFist.appendChild(newTextFirst);
list.insertBefore(newItemFirst, list.firstChild);
var listItems = document.querySelectorAll('li');
var i;
for(i = 0; i < ListItems.length; i++){
    listItems[i].className = 'cool';
}
var heading = document.querySelector('h2');

var headingText = heading.firstChild.modeValue;
var totalItems = listItems.length;
var newHeading = headingText = '<span>' + totalItems + '</span>'
heading.innerHTML= newHeading;
