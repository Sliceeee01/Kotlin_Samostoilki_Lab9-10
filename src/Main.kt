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
//fun testDepartments() {
//    println("\n=== Демонстрация абстрактных классов ===\n")
//
//    val devDept = DevelopmentDepartment()
//    val testDept = TestingDepartment()
//
//    devDept.printDepartmentGoal()
//    testDept.printDepartmentGoal()
//}
//fun main() {
//    val reports: List<ReportGenerator> = listOf(
//        Employee("Мещеряков Тимофей", "Разработчик", 100000, 5),
//        Employee("Богданов ИВАН", "Красавелла", 8000000, 30),
//        DevDepartment(),
//        TestDepartment()
//    )
//
//    for (report in reports) {
//        println(report.generateReport())
//    }
//}
fun main() {
    // Создаем сотрудника
    val employee = Employee("Сидоров Алексей", "Разработчик", 120000, 4)

    // Создаем задачи
    val task1 = Task("Исправить баг", "Починить кнопку входа", Priority.HIGH)
    val task2 = Task("Написать тесты", "Добавить unit-тесты", Priority.MEDIUM)

    println("=== Назначение задач ===")
    employee.assignTask(task1)
    employee.assignTask(task2)  // Ошибка - уже занят

    println("\n=== Выполнение задачи ===")
    employee.completeTask()

    println("\n=== Назначение новой задачи ===")
    employee.assignTask(task2)

    println("\n=== Итоговый отчет ===")
    println(employee.generateReport())
}