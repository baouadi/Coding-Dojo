var count = 3;
var countElement = document.querySelector(".likes");

function addLikes() {
    count++;
    countElement.innerText = count + " like(s)";
}
