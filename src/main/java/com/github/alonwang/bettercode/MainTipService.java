package com.github.alonwang.bettercode;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * @author alonwang
 * @date 2020/11/20 17:59
 */
public interface MainTipService {
    static MainTipService getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, MainTipService.class);
    }
}
