
const apiUrl = 'http://localhost:8081/student/fetch-all';

document.addEventListener('DOMContentLoaded', function() {
    const callApiButton = document.getElementById('callApiButton');
    callApiButton.addEventListener('click', function() {
        fetch(apiUrl) // Replace with your API endpoint
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.text();
            })
            .then(data => {
                const jsonData = JSON.parse(data);
                console.log(jsonData);
                populateTable(jsonData);
            })
            .catch(error => {
                console.error('There was a problem with the fetch operation:', error);
            });
    });
});


function populateTable(data){
    const table = document.getElementById("data-table");
    const tbody = table.querySelector("tbody");
    tbody.innerHTML = "";
    data.forEach(item => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td>${item.rollNumber}</td>
            <td>${item.name}</td>
            <td>${item.marksObtainedTenth}</td>
            <td>${item.marksObtainedTwelve}</td>
        `;
        tbody.appendChild(row);
    });
}


const form = document.getElementById('myForm');

form.addEventListener('submit', async (e) => {
    e.preventDefault();

    const rollNumber = document.getElementById('rollNumber').value;
    
    console.log(rollNumber);

    const deleteUrl = 'http://localhost:8081/student/delete/' + rollNumber;

    const response = await fetch(deleteUrl, {
        method: 'DELETE',
    });
});
