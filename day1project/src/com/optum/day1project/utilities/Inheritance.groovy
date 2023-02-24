package com.optum.day1project.utilities

class News {
  public void alerts() {
    println("News Alerts");
  }
}

class Sports extends News {
  public void alerts() {
    println("subscribe Sports News");
  }
}

class Entertainment extends News {
  public void alerts() {
    println("Subscribe for Entertainment News");
  }
}

class Politics extends News {
  public void alerts() {
    println("Subscribe for politics alerts");
  }
}


News myNews = new News(); 
Sports mySports = new Sports();
Entertainment myEntertainment = new Entertainment();
Politics myPolitics = new Politics();
myNews.alerts();
mySports.alerts();
myEntertainment.alerts();
myPolitics.alerts();
