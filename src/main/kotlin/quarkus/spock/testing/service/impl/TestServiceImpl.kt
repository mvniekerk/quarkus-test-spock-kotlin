package quarkus.spock.testing.service.impl

import quarkus.spock.testing.service.TestService
import javax.enterprise.context.RequestScoped

@RequestScoped
class TestServiceImpl: TestService {
    override fun sayHello(): Boolean {
        println("Hello")
        return true
    }
}
