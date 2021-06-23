package com.github.bozhnyukalex.intelijplug.services

import com.github.bozhnyukalex.intelijplug.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
