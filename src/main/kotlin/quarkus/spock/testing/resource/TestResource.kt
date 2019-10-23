package quarkus.spock.testing.resource

import quarkus.spock.testing.service.TestService
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/api/hello")
class TestResource {
    @Inject var testService: TestService? = null

    @Produces(MediaType.TEXT_PLAIN)
    @GET
    fun sayHello(): String = if (testService!!.sayHello()) "Hello" else "No"
}
