package aoeu

import hr.sberbank.sbercalc.DataContext
import org.slf4j.LoggerFactory
import org.specs2.mutable.Specification
import com.dslplatform.server.OracleDb
import com.dslplatform.server.OracleDb._

private object Dinamo {
  lazy val initialized = {
    import org.slf4j.bridge.SLF4JBridgeHandler
    SLF4JBridgeHandler.removeHandlersForRootLogger()
    SLF4JBridgeHandler.install()
  }
}

class Dinamo extends Specification {
  Dinamo.initialized

  protected val logger = LoggerFactory.getLogger("sber-calc-test")

  protected val config = com.typesafe.config.ConfigFactory.load("test.conf")
  protected val adminUser = config.getString("admin.user")

  protected val dataContext = new {
    val ds = {
      val ds = new oracle.jdbc.pool.OracleConnectionPoolDataSource()
      ds.setURL("jdbc:oracle:thin:@//x.x.x.x/o12c.localdomain")
      ds.setUser("sys AS sysdba")
      ds.setPassword("xxxxx")
      ds
    }
  } with DataContext(adminUser) with OracleDb

  sequential

  override def is =
    s"""
      |dinamo ${dinamo}
      |
    """.stripMargin

  def dinamo() = {
    s"""
    container ping  ${containerPing}
    spawn db        ${spawnDb}
    spawn ping      ${spawnPing}
    drop spawn      ${dropSpawn}
"""
  }

  def containerPing = dataContext.withOracleStatement("""
      SELECT 1521 FROM DUAL
""", _.executeOracleQuery { rs =>
    rs.next()
    rs.getInt(1)
  }) === 1521

  val seed = "/u02/oradata/o12c/pdbseed"
  val name = "marko_" + System.currentTimeMillis
  val newdb = "/u02/oradata/o12c/" + name
  val user = "xxxx"
  val password = "xxxx"

  def spawnDb = dataContext.withOracleConnection { conn =>
    println("--- CREATING ---")

    conn.prepareOracleStatement(s"""
      CREATE PLUGGABLE DATABASE "${name}" ADMIN USER "${user}" IDENTIFIED BY "${password}"
      FILE_NAME_CONVERT=(
        '${seed}/system01.dbf',                             '${newdb}/system01.dbf',
        '${seed}/sysaux01.dbf',                             '${newdb}/sysaux01.dbf',
        '${seed}/pdbseed_temp012014-09-10_06-38-54-PM.dbf', '${newdb}/pdbseed_temp01.dbf'
      )
      STORAGE UNLIMITED TEMPFILE REUSE
""", _.executeUpdate()
    )

    conn.prepareOracleStatement(s"""
      ALTER PLUGGABLE DATABASE ${name} OPEN
""", _.executeUpdate()
    )

    true
  }

  def spawnPing = {
    println("--- PINGING ---")
    var found = false
    while (!found) {

      println("Are we there yet?")

      try {
        val spawnContext = new {
          val ds = {
            val ds = new oracle.jdbc.pool.OracleConnectionPoolDataSource()
            ds.setURL("jdbc:oracle:thin:@//x.x.x.x/" + name + ".localdomain")
            ds.setUser(user)
            ds.setPassword(password)
            ds
          }
        } with DataContext(adminUser) with OracleDb

        spawnContext.withOracleStatement(
          """
          SELECT 27 * 37 FROM DUAL
    """, _.executeOracleQuery { rs =>
          rs.
            next()
          rs.getInt(1)
        }) === 999

        println("YEEEE-HAAAAA!")
        found = true

        }
      catch {
        case e: Exception =>
          println("Nope!")
          Thread.sleep(250)
      }
    }

    true
  }


  def dropSpawn = dataContext.withOracleConnection { conn =>
    println("--- DROPPING ---")

    conn.prepareOracleStatement(s"""
      ALTER PLUGGABLE DATABASE "${name}" CLOSE IMMEDIATE
""", _.executeUpdate()
    )

    conn.prepareOracleStatement(s"""
      DROP PLUGGABLE DATABASE "${name}" INCLUDING DATAFILES
""", _.executeUpdate()
    )

    true
  }

}
