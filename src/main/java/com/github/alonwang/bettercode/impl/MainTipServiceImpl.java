package com.github.alonwang.bettercode.impl;

import com.github.alonwang.bettercode.MainTipService;
import com.github.alonwang.bettercode.MyDialog;
import com.intellij.codeInsight.hint.HintManager;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.ui.popup.util.PopupUtil;
import com.intellij.openapi.util.IconLoader;
import com.intellij.ui.awt.RelativePoint;
import com.intellij.util.messages.impl.Message;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * @author alonwang
 * @date 2020/11/20 17:59
 */
public class MainTipServiceImpl implements MainTipService {
    public MainTipServiceImpl(Project project) {
    }

    @Override
    public void initComponent() {
        ApplicationManager.getApplication().invokeLater(() -> MyDialog.cccc());
        ApplicationManager.getApplication().invokeLater(() -> {
            JPanel centerPanel = new JPanel(new BorderLayout());
            JLabel label = new JLabel("毒鸡汤的内容");
            label.setPreferredSize(new Dimension(100, 100));
            label.setText("简单接口,复杂实现");
            centerPanel.add(label, BorderLayout.CENTER);
           JBPopup popup= JBPopupFactory.getInstance().createComponentPopupBuilder(centerPanel, null).createPopup();
           popup.showInFocusCenter();

        });
    }

}
