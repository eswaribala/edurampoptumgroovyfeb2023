package com.optum.insurance.utilities

import com.optum.insurance.helpers.DBHelper

def conn= DBHelper.getConnection()

assert conn:"No connection"