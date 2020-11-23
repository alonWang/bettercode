package com.github.alonwang.bettercode;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * @author alonwang
 * @date 2020/11/20 17:59
 */
public interface MainTipService extends ProjectComponent {
    static MainTipService getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, MainTipService.class);
    }
}
