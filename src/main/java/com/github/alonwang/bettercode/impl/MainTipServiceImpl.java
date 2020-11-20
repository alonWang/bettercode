package com.github.alonwang.bettercode.impl;

import com.github.alonwang.bettercode.MainTipService;
import com.github.alonwang.bettercode.MyDialog;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.project.Project;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author alonwang
 * @date 2020/11/20 17:59
 */
public class MainTipServiceImpl implements MainTipService, PersistentStateComponent<Element> {
    public MainTipServiceImpl(Project project) {
    }

    @Override
    public @Nullable Element getState() {
        Element result = new Element("state");
        return result;
    }

    @Override
    public void loadState(@NotNull Element state) {

    }

    @Override
    public void initializeComponent() {
        MyDialog.cccc();
    }
}
