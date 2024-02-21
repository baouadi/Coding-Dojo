function removeBox() {
    var rightElement = document.querySelector('.right');

    if (rightElement) {
        rightElement.remove();
    }
}


function changeButtonText() {
    var loginButton = document.querySelector('.btn');
    if (loginButton) {
        loginButton.textContent = 'Logout';
    }
}

var likeButton = document.querySelector('.like-button');
if (likeButton) {
    likeButton.addEventListener('click', function () {
        alert('Ninja was liked');
    });
}