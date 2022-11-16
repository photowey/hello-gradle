package com.photowey.plugin.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * GreetingPlugin
 *
 * @author photowey
 * @date 2022/11/16
 * @since 1.0.0
 */
class GreetingPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("greetingPlugin") {
            println("com.photowey.plugin.greeting.GreetingPlugin")
        }
    }
}
