package com.github.alonwang.bettercode.services

import com.intellij.openapi.project.Project
import com.github.alonwang.bettercode.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
