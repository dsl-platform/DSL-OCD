<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
  xmlns:lxslt="http://xml.apache.org/xslt" xmlns:redirect="http://xml.apache.org/xalan/redirect"
  xmlns:stringutils="xalan://org.apache.tools.ant.util.StringUtils"
  extension-element-prefixes="redirect">
  <xsl:output method="html" indent="yes" encoding="US-ASCII" />
  <xsl:decimal-format decimal-separator="." grouping-separator="," />
  <xsl:param name="output.dir" select="'.'" />

  <!-- Bootstrap error row css class -->
  <xsl:variable name="errorRowClass">danger</xsl:variable>

  <xsl:template match="testsuites">
    <redirect:write file="{$output.dir}/index.html">
      <html>
        <head>
          <title>Testsuites summary</title>
          <link rel="stylesheet" href="../css/bootstrap.min.css" />
          <script src="../js/jquery.min.js"></script>
          <script src="../js/bootstrap.min.js"></script>
        </head>
        <body>
          <div id="TestsuitesSummary" class="container">
            <h1>Test suites summary</h1>
            <table class="table table-striped">
              <xsl:call-template name="testsuite.header" />
              <xsl:apply-templates select="testsuite" mode="table_entry"/>
            </table>
          </div>
        </body>
      </html>
    </redirect:write>
    <xsl:apply-templates select="testsuite" mode="full_page"/>
  </xsl:template>

  <xsl:template name="testsuite.header">
    <tr>
      <th>Name</th>
      <th>Tests</th>
      <th>Failures</th>
      <th>Errors</th>
      <th>Time</th>
      <th>Timestamp</th>
    </tr>
  </xsl:template>

  <xsl:template match="testsuite" mode="table_entry">
  <!-- Template for a testsuite row entry on the index page -->
    <xsl:variable name="package.dir">
      <xsl:if test="not(@package = '')"><xsl:value-of select="translate(@package,'.','/')" /></xsl:if>
      <xsl:if test="@package = ''">.</xsl:if>
    </xsl:variable>
    <tr>
      <xsl:if test="sum(@errors) &gt; 0 or sum(@failures) &gt; 0">
        <xsl:attribute name="class"><xsl:value-of select="$errorRowClass" /></xsl:attribute>
      </xsl:if>
      <td>
        <a>
          <xsl:attribute name="href"><xsl:value-of select="$output.dir" />/<xsl:value-of select="$package.dir" />/<xsl:value-of select="@name" />.html</xsl:attribute>
          <xsl:value-of select="@name" />
        </a>
      </td>
      <td><xsl:value-of select="@tests" /></td>
      <td><xsl:value-of select="@failures" /></td>
      <td><xsl:value-of select="@errors" /></td>
      <td><xsl:value-of select="@time" /></td>
      <td><xsl:value-of select="@timestamp" /></td>
    </tr>
  </xsl:template>

  <xsl:template match="testsuite" mode="full_page">
    <!-- Template for individual test suites pages -->
    <xsl:variable name="package.dir">
      <xsl:if test="not(@package = '')"><xsl:value-of select="translate(@package,'.','/')" /></xsl:if>
      <xsl:if test="@package = ''">.</xsl:if>
    </xsl:variable>
    <redirect:write file="{$output.dir}/{$package.dir}/{@name}.html">
      <html>
        <head>
          <title>Testsuite summary</title>
          <xsl:call-template name="css-links">
            <xsl:with-param name="package.path" select="$package.dir" />
          </xsl:call-template>
        </head>
        <body>
          <div id="TestSuiteDetails" class="container">
            <h1>Test summary for: <xsl:value-of select="@name" /></h1>
            <table class="table table-striped">
              <xsl:call-template name="testsuite.header"/>
              <tr>
               <td><xsl:value-of select="@name" /></td>
               <td><xsl:value-of select="@tests" /></td>
               <td><xsl:value-of select="@failures" /></td>
               <td><xsl:value-of select="@errors" /></td>
               <td><xsl:value-of select="@time" /></td>
               <td><xsl:value-of select="@timestamp" /></td>
              </tr>
            </table>
          </div>
          <div id="testFails" class="container">
            <h2>Failed tests</h2>
            <table class="table table-striped">
              <xsl:call-template name="testcase.header"/>
              <xsl:apply-templates select="testcase[./error or ./failure]" mode="table_entry_fails"/>
            </table>
          </div>
          <div id="testWins" class="container">
            <h2>Successful tests</h2>
            <table class="table table-striped">
              <xsl:call-template name="testcase.header"/>
              <xsl:apply-templates select="testcase[not(./error) and not(./failure)]" mode="table_entry_wins"/>
            </table>
          </div>
        </body>
      </html>
    </redirect:write>
    <!-- <xsl:apply-templates select="testcase" mode="full_page"/> -->
  </xsl:template>

  <xsl:template name="testcase.header">
    <tr>
      <th>Name</th>
      <th>Status</th>
      <th>Time</th>
    </tr>
  </xsl:template>

  <xsl:template match="testcase" mode="table_entry_fails">
      <xsl:variable name="parent.package.dir">
        <xsl:if test="not(../@package = '')"><xsl:value-of select="translate(../@package,'.','/')" /></xsl:if>
        <xsl:if test="../@package = ''">.</xsl:if>
      </xsl:variable>
      <xsl:variable name="parent.name">
        <xsl:value-of select="../@name" />
      </xsl:variable>

      <tr>
        <xsl:attribute name="class"><xsl:value-of select="$errorRowClass" /></xsl:attribute>
        <td>
          <a>
            <xsl:attribute name="href"><xsl:value-of select="$parent.package.dir" />/<xsl:value-of select="$parent.name" />.<xsl:value-of select="@name" />.html</xsl:attribute>
            <xsl:value-of select="@name" />
          </a>
        </td>
        <td>Failed</td>
        <td><xsl:value-of select="@time" /></td>
      </tr>
  </xsl:template>

  <xsl:template match="testcase" mode="table_entry_wins">
      <tr>
        <td><xsl:value-of select="@name" /></td>
        <td>Success</td>
        <td><xsl:value-of select="@time" /></td>
      </tr>
  </xsl:template>

  <xsl:template match="testcase" mode="full_page">
   <xsl:variable name="parent.package.dir">
        <xsl:if test="not(../@package = '')"><xsl:value-of select="translate(../@package,'.','/')" /></xsl:if>
        <xsl:if test="../@package = ''">.</xsl:if>
    </xsl:variable>
    <xsl:variable name="parent.name">
        <xsl:value-of select="../@name" />
    </xsl:variable>
    <redirect:write file="{$output.dir}/{$parent.package.dir}/{$parent.name}.{@name}.html">
      <html>
        <head>
          <title>Testsuite summary</title>
          <xsl:call-template name="css-links">
            <xsl:with-param name="package.path" select="$parent.package.dir" />
          </xsl:call-template>
        </head>
        <body>
          <div id="testDetails" class="container">
            <h1>Test summary for the test: <xsl:value-of select="@name" /></h1>
            <table class="table table-striped">
              <xsl:call-template name="testcase.header"/>
              <tr>
               <td><xsl:value-of select="@name" /></td>
               <td><xsl:value-of select="@time" /></td>
              </tr>
            </table>
          </div>
        </body>
      </html>
    </redirect:write>
  </xsl:template>

  <!-- transform string like a.b.c to ../../../ @param path the path to transform into a descending
    directory path -->
  <xsl:template name="path">
    <xsl:param name="path" />
    <xsl:if test="contains($path,'.')">
      <xsl:text>../</xsl:text>
      <xsl:call-template name="path">
        <xsl:with-param name="path">
          <xsl:value-of select="substring-after($path,'.')" />
        </xsl:with-param>
      </xsl:call-template>
    </xsl:if>
    <xsl:if test="not(contains($path,'.')) and not($path = '')">
      <xsl:text>../</xsl:text>
    </xsl:if>
  </xsl:template>

  <xsl:template name="css-links">
    <xsl:param name="package.path"/>
    <xsl:variable name="dir.up">../</xsl:variable>
    <xsl:variable name="slash">/</xsl:variable>
    <xsl:variable name="path.to.root">
      <xsl:call-template name="repeat">
        <xsl:with-param name="string" select="$dir.up" />
        <xsl:with-param name="times">
          <xsl:call-template name="number-of-occurences">
            <xsl:with-param name="string" select="$package.path" />
            <xsl:with-param name="char" select="$slash" />
          </xsl:call-template>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:variable>
    <link rel="stylesheet">
      <xsl:attribute name="href"><xsl:value-of select="$path.to.root"/>../../css/bootstrap.min.css</xsl:attribute>
    </link>
    <script>
      <xsl:attribute name="src"><xsl:value-of select="$path.to.root"/>../../js/jquery.min.js</xsl:attribute>
    </script>
    <script>
      <xsl:attribute name="src"><xsl:value-of select="$path.to.root"/>../../js/bootstrap.min.js</xsl:attribute>
    </script>
  </xsl:template>

  <xsl:template name="number-of-occurences">
    <xsl:param name="string" />
    <xsl:param name="char" />
    <xsl:value-of select="string-length($string) - string-length(translate($string, $char, ''))" />
  </xsl:template>

  <xsl:template name="repeat">
    <xsl:param name="string" />
    <xsl:param name="times" />
    <xsl:if test="$times &gt; 0">
      <xsl:call-template name="repeat">
        <xsl:with-param name="string" select="$string" />
        <xsl:with-param name="times" select="$times - 1" />
      </xsl:call-template>
      <xsl:value-of select="$string" />
    </xsl:if>
  </xsl:template>

  <xsl:template name="JS-escape">
    <xsl:param name="string" />
    <xsl:param name="tmp1" select="stringutils:replace(string($string),'\','\\')" />
    <xsl:param name="tmp2"
      select="stringutils:replace(string($tmp1),&quot;'&quot;,&quot;\&apos;&quot;)" />
    <xsl:value-of select="$tmp2" />
  </xsl:template>

  <!-- template that will convert a carriage return into a br tag @param word the text from
    which to convert CR to BR tag -->
  <xsl:template name="br-replace">
    <xsl:param name="word" />
    <xsl:choose>
      <xsl:when test="contains($word,'&#xA;')">
        <xsl:value-of select="substring-before($word,'&#xA;')" />
        <br />
        <xsl:call-template name="br-replace">
          <xsl:with-param name="word" select="substring-after($word,'&#xA;')" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$word" />
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template name="display-time">
    <xsl:param name="value" />
    <xsl:value-of select="format-number($value,'0.000')" />
  </xsl:template>

  <xsl:template name="display-percent">
    <xsl:param name="value" />
    <xsl:value-of select="format-number($value,'0.00%')" />
  </xsl:template>
</xsl:stylesheet>

