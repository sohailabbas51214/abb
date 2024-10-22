document.getElementById('commentForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const comment = document.getElementById('comment').value;
    alert(`Comment submitted: ${comment}`);
    document.getElementById('comment').value = '';
});
