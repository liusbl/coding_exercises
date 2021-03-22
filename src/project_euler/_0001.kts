package project_euler

(1 until 1000).sumBy { value ->
    if (value % 3 == 0 || value % 5 == 0) {
        value
    } else {
        0
    }
}