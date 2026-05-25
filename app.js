const students = [
    {
        name: "Rahul Kumar",
        roll: "101",
        status: "Present"
    },
    {
        name: "Priya Singh",
        roll: "102",
        status: "Absent"
    },
    {
        name: "Aman Verma",
        roll: "103",
        status: "Present"
    }
];

function loadStudents() {

    const studentList =
        document.getElementById("studentList");

    studentList.innerHTML = "";

    students.forEach(student => {

        const card = document.createElement("div");

        card.classList.add("student-card");

        card.innerHTML = `
            <h3>${student.name}</h3>

            <p>
                Roll No: ${student.roll}
            </p>

            <p class="${
                student.status === "Present"
                ? "present"
                : "absent"
            }">

                ${student.status}

            </p>
        `;

        studentList.appendChild(card);
    });
}
