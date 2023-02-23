package hc


import spock.lang.Shared
import spock.lang.Specification
import hc.helpers.DBHelper
class DatabaseDrivenSpec extends Specification {
  @Shared sql =DBHelper.getConnection()
  
  // insert data (usually the database would already contain the data)
  //def setupSpec() {
    //sql.execute("create table maxdata (id int primary key, a int, b int, c int)")
    //sql.execute("insert into maxdata values (1, 3, 7, 7), (2, 5, 4, 5), (3, 9, 9, 9)")
  //}

  def "Mobile No Test"() {
    expect:
    assert mobileNo

    where:
    [mobileNo] << sql.rows("select MobileNo from Doctor")
  }
}