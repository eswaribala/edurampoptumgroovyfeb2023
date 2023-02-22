package com.optum.insurance.utilities

import groovy.swing.SwingBuilder

import java.awt.Button
import java.awt.FlowLayout
import java.awt.Panel
count = 0
def builder=new SwingBuilder()
new SwingBuilder().edt {
    frame(title: 'Login', size: [400, 200], show: true) {
        panel(layout: new FlowLayout()){
            panel(layout: new FlowLayout()){
                txtUserName= textField(size: [100,50])
                button(text: 'login',actionPerformed: {
                    builder.optionPane(message: 'Login Button Clicked').createDialog('${txtUserName.text}').show()
                })
            }
        }

    }
}
