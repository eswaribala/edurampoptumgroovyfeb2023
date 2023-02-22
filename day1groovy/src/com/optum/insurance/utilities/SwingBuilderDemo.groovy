package com.optum.insurance.utilities

import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import java.awt.Button
import java.awt.FlowLayout
import java.awt.Panel
count = 0
def builder=new SwingBuilder()
new SwingBuilder().edt {
    frame(title: 'Login', size: [400, 200], show: true) {
        panel(layout: new FlowLayout()){
            panel(layout: new FlowLayout()){
                textlabel = label(text: 'Click the button!', constraints: BL.NORTH)
                button(text:'Login',
                        actionPerformed: {count++; textlabel.text = "Clicked ${count} time(s)."; println "clicked"}, constraints:BL.SOUTH)

            }
        }

    }
}
