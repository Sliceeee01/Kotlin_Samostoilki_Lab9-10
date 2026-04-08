fun main() {
    val employee = Employee("Богданов Иван Антонович", "Разработчик", 100000, 5)

    println(employee.getInfo())
    employee.setSalary(-50000)
    employee.setSalary(120000)

    employee.setYearsOfExperience(-3)
    employee.setYearsOfExperience(60)
    employee.setYearsOfExperience(8)
    println(employee.getInfo())
}