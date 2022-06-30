package com.github.1163895390wjh.ideanotification.services

import com.intellij.openapi.project.Project
import com.github.1163895390wjh.ideanotification.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
