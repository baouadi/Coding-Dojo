console.log("page loaded...");

var name = 'Todd E';
var changeElement = document.querySelector(".changeE");

function change() {

    changeElement.innerText = name;
}

function removeSpan() {
    var rightElement = document.querySelector('.card-list');

    if (rightElement) {
        rightElement.remove();
    }
}
function removeSpan2() {
    var rightElement = document.querySelector('.card-list-item');

    if (rightElement) {
        rightElement.remove();
    }
}
