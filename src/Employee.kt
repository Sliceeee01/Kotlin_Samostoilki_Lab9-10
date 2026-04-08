class Employee(
    val fullName: String,
    val position: String,
    salary: Int,
    yearsOfExperience: Int
) : ReportGenerator {

    var salary = salary
        set(value) {
            if (value < 0) {
                println("Ошибка: зарплата не может быть отрицательной")
            } else {
                field = value
            }
        }

    var yearsOfExperience = yearsOfExperience
        set(value) {
            field = if (value > 50) 50 else if (value < 0) 0 else value
        }

    private var currentTask: Task? = null

    fun assignTask(task: Task) {
        if (currentTask != null && currentTask?.isCompleted == false) {
            println("Ошибка: $fullName уже занят задачей '${currentTask?.title}'")
        } else {
            currentTask = task
            println("$fullName получил задачу: ${task.title}")
        }
    }

    fun completeTask() {
        if (currentTask != null && currentTask?.isCompleted == false) {
            currentTask = currentTask?.copy(isCompleted = true)
            println("$fullName завершил задачу!")
        } else {
            println("У $fullName нет активной задачи")
        }
    }

    override fun generateReport(): String {
        val taskStatus = if (currentTask != null) {
            " | Задача: ${currentTask?.title} (${if (currentTask?.isCompleted == true) "выполнена" else "в работе"})"
        } else {
            " | Задач нет"
        }
        return "Отчет: $fullName | $position | $salary руб | опыт $yearsOfExperience лет$taskStatus"
    }
}
//class Employee(
//    val fullName: String,
//    val position: String,
//    salary: Int,
//    yearsOfExperience: Int
//) : ReportGenerator {
//
//    var salary = salary
//        set(value) {
//            if (value < 0) {
//                println("Ошибка: зарплата не может быть отрицательной")
//            } else {
//                field = value
//            }
//        }
//
//    var yearsOfExperience = yearsOfExperience
//        set(value) {
//            field = if (value > 50) 50 else if (value < 0) 0 else value
//        }
//
//    override fun generateReport(): String {
//        return "Отчет: $fullName | $position | $salary руб | опыт $yearsOfExperience лет"
//    }
//}
//


//class Employee(
//    private var _fullName: String,
//    private var _position: String,
//    private var _salary: Int,
//    private var _yearsOfExperience: Int
//) {
//    val fullName: String
//        get() = _fullName
//
//    val position: String
//        get() = _position
//
//    val salary: Int
//        get() = _salary
//
//    val yearsOfExperience: Int
//        get() = _yearsOfExperience
//
//    fun setSalary(newSalary: Int) {
//        if (newSalary < 0) {
//            println("Предупреждение: Зарплата не может быть отрицательной! Значение не изменено.")
//        } else {
//            _salary = newSalary
//            println("Зарплата обновлена: $_salary")
//        }
//    }
//    fun setYearsOfExperience(newYears: Int) {
//        _yearsOfExperience = when {
//            newYears < 0 -> {
//                println("Предупреждение: Опыт не может быть отрицательным! Установлено значение 0.")
//                0
//            }
//            newYears > 50 -> {
//                println("Предупреждение: Максимальный опыт - 50 лет! Установлено значение 50.")
//                50
//            }
//            else -> {
//                println("Опыт обновлен: $newYears лет")
//                newYears
//            }
//        }
//    }
//    fun getInfo(): String {
//        return """
//            |Сотрудник: $_fullName
//            |Должность: $_position
//            |Зарплата: $_salary
//            |Опыт: $_yearsOfExperience лет
//        """.trimMargin()
//    }
//}