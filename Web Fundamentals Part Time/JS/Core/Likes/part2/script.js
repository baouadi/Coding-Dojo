var postLikes = [9, 12, 9];

        function addLikes(postIndex) {
            postLikes[postIndex]++;
            var likeElement = document.querySelectorAll(".likes")[postIndex];
            likeElement.innerText = postLikes[postIndex] + " like(s)";
        }