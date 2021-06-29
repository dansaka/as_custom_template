package com.github.dansaka.ascustomtemplate.services

import com.github.dansaka.ascustomtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
