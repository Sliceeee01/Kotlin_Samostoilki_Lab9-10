class Employee(
    private var _fullName: String,
    private var _position: String,
    private var _salary: Int,
    private var _yearsOfExperience: Int
) {
    val fullName: String
        get() = _fullName

    val position: String
        get() = _position

    val salary: Int
        get() = _salary

    val yearsOfExperience: Int
        get() = _yearsOfExperience

}