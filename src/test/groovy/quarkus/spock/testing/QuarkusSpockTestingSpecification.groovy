package quarkus.spock.testing

import io.quarkus.test.junit.QuarkusTest
import quarkus.spock.testing.service.TestService
import spock.lang.Shared
import spock.lang.Specification

import javax.inject.Inject

@QuarkusTest
class QuarkusSpockTestingSpecification extends Specification {
    @Shared @Inject TestService testService

    def "Hello"() {
        expect:
        testService.sayHello()
    }
}
