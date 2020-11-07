package ro.rosmof.deploy

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class ReleaseVersionTask extends DefaultTask {
    @Input
    Boolean release

    @Input
    Integer minor

    @OutputFile
    File destFile

    ReleaseVersionTask() {
        group = 'versioning'
        description = 'Make project a release version'
    }

    @TaskAction
    void start() {
        project.version.release = true;
        ant.propertyfile(file: destFile) {
            entry(key: 'release', type: 'string', operation: '=', value: 'true')
            entry(key: 'date', type: 'date', operation: '=', value: 'now')

            //exemplu de modificare a versiunii
            //entry(key: 'minor', type: 'int', operation: '+', value: '1')
            entry(key: 'nume', type: 'string', operation: '=', value: 'ghiran')
        }
    }
}
