package com.optum.day1project.utilities

class OptumEmployee {
  String name;
  String dept;

  public OptumEmployee(String name, String dept) {
      this.name = name;
      this.dept = dept;
  }

  @Override
  public String toString() {
      return "Employee{" +
              "name='" + name + '\'' +
              ", dept='" + dept + '\'' +
              '}';
  }
}
//without safety operator
/*
void displayEmployeeNameLength(OptumEmployee emp) {
	printf "employee: %s, name: %s, name length: %s%n",
			emp, emp.name, emp.name.length()
}


displayEmployeeNameLength(new OptumEmployee("Sara", "Admin"))
displayEmployeeNameLength(null);
displayEmployeeNameLength(new OptumEmployee(null, null))
*/
//with safety operator
void displayEmployeeNameLength(OptumEmployee emp) {
	printf "employee: %s, name: %s, name length:: %s%n",
			emp, emp?.name, emp?.name?.length()
}

displayEmployeeNameLength(new OptumEmployee("Sara", "Admin"))
displayEmployeeNameLength(null);
displayEmployeeNameLength(new OptumEmployee(null, null))
