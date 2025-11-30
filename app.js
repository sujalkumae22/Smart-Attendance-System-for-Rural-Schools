const API = "http://localhost:8080/api";
let students = [];

async function loadStudents() {
    let res = await fetch(`${API}/students`);
    students = await res.json();

    let html = "";
    students.forEach(s => {
        html += `
        <div class="student">
            <strong>${s.name}</strong> (${s.className}) 
            <br>
            <label>
                <input type="radio" name="s${s.id}" value="present"> Present
            </label>
            <label>
                <input type="radio" name="s${s.id}" value="absent"> Absent
            </label>
        </div>
        `;
    });

    document.getElementById("studentList").innerHTML = html;
    document.getElementById("saveBtn").style.display = "block";
}

async function saveAttendance() {
    let today = new Date().toISOString().split("T")[0];

    let attendance = students.map(s => {
        let status = document.querySelector(`input[name="s${s.id}"]:checked`);
        return {
            studentId: s.id,
            date: today,
            present: status && status.value === "present"
        };
    });

    let res = await fetch(`${API}/attendance`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(attendance)
    });

    let text = await res.text();
    alert(text);
}
