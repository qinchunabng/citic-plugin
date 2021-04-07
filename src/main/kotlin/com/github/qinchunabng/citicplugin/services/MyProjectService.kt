package com.github.qinchunabng.citicplugin.services

import com.github.qinchunabng.citicplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
