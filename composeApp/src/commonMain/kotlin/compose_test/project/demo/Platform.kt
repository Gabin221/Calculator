package compose_test.project.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform