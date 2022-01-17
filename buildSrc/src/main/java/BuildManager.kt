
import org.gradle.api.Plugin
import org.gradle.api.Project

open class SubInfo{
    var submoduleNames: String? = null
}

class BuildManager : Plugin<Project> {

    override fun apply(project: Project) {

        val extension = project.extensions.create("submodules",SubInfo::class.java)

        project.task("printSomething") {
            doLast {
                println("Extension submodules are ${extension.submoduleNames}")
                println("Welcome from gradle world!")
            }
        }
    }
}