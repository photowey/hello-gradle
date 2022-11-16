package com.photowey.plugin.hello

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * SayHello
 *
 * @author photowey
 * @date 2022/11/16
 * @since 1.0.0
 */
class SayHello implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("customPlugin") {
            println("com.photowey.plugin.hello.SayHello")
        }
    }
}
