//fun main() {
//    val employee = Employee("Богданов Иван Антонович", "Разработчик", 100000, 5)
//
//    println(employee.getInfo())
//    employee.setSalary(-50000)
//    employee.setSalary(120000)
//
//    employee.setYearsOfExperience(-3)
//    employee.setYearsOfExperience(60)
//    employee.setYearsOfExperience(8)
//    println(employee.getInfo())
//}

//fun testDataClass() {
//    val task1 = Task("Исправить баг", "Исправить ошибку в авторизации", Priority.HIGH)
//    val task2 = Task("Исправить баг", "Исправить ошибку в авторизации", Priority.HIGH)
//    val task3 = Task("Написать тесты", "Написать unit-тесты для модуля", Priority.MEDIUM, true)
//
//    println("1. Демонстрация equals():")
//    println("   task1 == task2: ${task1 == task2}")  // true
//    println("   task1 == task3: ${task1 == task3}")  // false
//
//    println("   task1 hashCode: ${task1.hashCode()}")
//    println("   task2 hashCode: ${task2.hashCode()}")
//    println("   task3 hashCode: ${task3.hashCode()}")
//
//    println("   $task1")
//    println("   $task3")
//
//    val task1HighPriority = task1.copy(priority = Priority.HIGH)
//    val task1Completed = task1.copy(isCompleted = true)
//    println("   Оригинал: $task1")
//    println("   Копия с изменением приоритета: $task1HighPriority")
//    println("   Копия с отметкой о выполнении: $task1Completed")
//}
fun testDepartments() {
    println("\n=== Демонстрация абстрактных классов ===\n")

    val devDept = DevelopmentDepartment()
    val testDept = TestingDepartment()

    devDept.printDepartmentGoal()
    testDept.printDepartmentGoal()
}