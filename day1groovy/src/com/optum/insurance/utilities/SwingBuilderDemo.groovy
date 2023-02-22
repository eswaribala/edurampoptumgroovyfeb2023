package com.optum.insurance.utilities

import groovy.swing.SwingBuilder

import java.awt.Button
import java.awt.FlowLayout
import java.awt.Panel
count = 0
new SwingBuilder().edt {
    frame(title: 'Frame', size: [250, 75], show: true) {
        borderLayout()
        textlabel = label(text: 'Click the button!')

    }
}
