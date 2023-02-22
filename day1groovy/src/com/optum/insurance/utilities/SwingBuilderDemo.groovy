package com.optum.insurance.utilities

import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import java.awt.Button
import java.awt.FlowLayout
import java.awt.GridLayout
import java.awt.Panel
count = 0
def builder=new SwingBuilder()
new SwingBuilder().edt {
    frame(title: 'Login', size: [400, 200], show: true) {
        panel(layout: new FlowLayout()){
            panel(layout: new GridLayout()){
                textlabel = label(text: '', constraints: BL.NORTH)
                textUserName = textField(text: 'User Name', constraints: BL.SOUTH)
                textPassworde = textField(text: 'Password', constraints: BL.SOUTH)
                button(text:'Login',
                        actionPerformed: {textlabel.text = textUserName.text; println "clicked"}, constraints:BL.SOUTH)

            }
        }

    }
}
