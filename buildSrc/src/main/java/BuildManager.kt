
import org.gradle.api.Plugin
import org.gradle.api.Project

open class SubInfo{
    var workingDirectory: String = ""
    var submoduleList: List<String> = emptyList()
}

class BuildManager : Plugin<Project> {

    override fun apply(project: Project) {

        val extension = project.extensions.create("submodules",SubInfo::class.java)

        project.exec{
            workingDir(extension.workingDirectory)
            extension.submoduleList.forEach { urlPath ->
                commandLine("git","submodule","add", urlPath )
            }
        }

        project.task("printSomething") {
            doLast {
                println("Welcome from gradle world!")
            }
        }
    }
}