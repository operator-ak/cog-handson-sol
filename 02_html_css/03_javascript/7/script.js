class Employee {
  constructor(name, designation, year_of_experience) {
    this.name = name;
    this.designation = designation;
    this.year_of_experience = year_of_experience;
  }
}

function createEmployee(name, designation, year_of_experience) {
  return new Employee(name, designation, year_of_experience);
}

function validateObject(employee) {
  return employee instanceof Employee;

}

function displayEmployee(name, designation, year_of_experience) {
  const employee = createEmployee(name, designation, year_of_experience);

  if (!validateObject(employee)) return;

  const _date = new Date();
  const yearOfJoining = _date.getFullYear() - employee.year_of_experience;

  const output = `${employee.name} is serving the position of ${employee.designation} since ${yearOfJoining}`;

  return "" + output;
}