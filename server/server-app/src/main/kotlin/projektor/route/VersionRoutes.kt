package projektor.route

import io.ktor.server.http.content.staticResources
import io.ktor.server.routing.Route

fun Route.version() {
    staticResources("/","version") {
        default("version.json")
    }
}
