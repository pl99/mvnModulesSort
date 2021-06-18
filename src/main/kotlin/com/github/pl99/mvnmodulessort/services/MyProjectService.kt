package com.github.pl99.mvnmodulessort.services

import com.github.pl99.mvnmodulessort.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
