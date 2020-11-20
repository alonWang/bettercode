package com.github.alonwang.bettercode;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * @author alonwang
 * @date 2020/11/20 17:59
 */
public class MyDialog extends DialogWrapper {
    protected MyDialog() {
        super(true);
        setTitle("better code");
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {

        JPanel centerPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("毒鸡汤的内容");
        label.setPreferredSize(new Dimension(100,100));
        label.setText("简单接口,复杂实现");
        centerPanel.add(label,BorderLayout.CENTER);
        return centerPanel;

    }
    public static void cccc(){
        new MyDialog().show();
        System.out.println("cccc");
    }
}
