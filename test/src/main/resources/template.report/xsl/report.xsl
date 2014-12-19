<?xml version="1.0" encoding="utf-8" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"
  xmlns:lxslt="http://xml.apache.org/xslt"
  xmlns:stringutils="xalan://org.apache.tools.ant.util.StringUtils"
  >

  <xsl:output method="xhtml" indent="yes" encoding="US-ASCII" />

  <xsl:decimal-format decimal-separator="." grouping-separator="," />

  <xsl:param name="output.dir" select="'.'" />

  <xsl:variable name="targetDirectory"><xsl:value-of select="$output.dir"/></xsl:variable>

  <!-- Error row CSS class -->
  <xsl:variable name="errorRowClass">danger</xsl:variable>
  <xsl:variable name="successRowClass"></xsl:variable>

  <xsl:template match="testsuites">
    <xsl:result-document href="{$targetDirectory}/index.html">
      <html>
        <head>
          <title>OCD summary</title>
          <link rel="stylesheet" href="../css/bootstrap.min.css" />
          <script src="../js/jquery.min.js"></script>
          <script src="../js/bootstrap.min.js"></script>
        </head>
        <body>
          <div class="container">
            <h1>Test suites summary</h1>
            <xsl:call-template name="testsuites.summary" />
            <table class="table table-striped">
              <xsl:call-template name="testsuite.header" />
              <xsl:apply-templates select="testsuite" mode="table_entry"/>
            </table>
          </div>
        </body>
      </html>
    </xsl:result-document>
    <xsl:apply-templates select="testsuite" mode="full_page"/>
    <xsl:apply-templates select="testsuite" mode="stack_trace"/>
  </xsl:template>

  <xsl:template name="testsuites.summary">
    <xsl:variable name="testCount" select="sum(testsuite/@tests)"/>
    <xsl:variable name="errorCount" select="sum(testsuite/@errors)"/>
    <xsl:variable name="failureCount" select="sum(testsuite/@failures)"/>
    <xsl:variable name="timeCount" select="sum(testsuite/@time)"/>
    <xsl:variable name="successRate" select="($testCount - $failureCount - $errorCount) div $testCount"/>
    <table class="table table-striped">
      <thead>
        <tr>
          <th>Success rate</th>
          <th>Test suites</th>
          <th>Tests</th>
          <th>Failures</th>
          <th>Errors</th>
          <th>Time</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <xsl:call-template name="display-percent">
              <xsl:with-param name="value" select="$successRate" />
            </xsl:call-template>
          </td>
          <td><xsl:value-of select="count(testsuite)"/></td>
          <td><xsl:value-of select="$testCount"/></td>
          <td><xsl:value-of select="$failureCount"/></td>
          <td><xsl:value-of select="$errorCount"/></td>
          <td><xsl:value-of select="$timeCount"/></td>
        </tr>
      </tbody>
    </table>
  </xsl:template>

  <xsl:template name="testsuite.header">
    <tr>
      <th>Name</th>
      <th>Succ. rate</th>
      <th>Tests</th>
      <th>Failures</th>
      <th>Errors</th>
      <th>Time</th>
    </tr>
  </xsl:template>

  <xsl:template match="testsuite" mode="table_entry">
    <xsl:variable name="successRate">
      <xsl:call-template name="display-percent">
        <xsl:with-param name="value">
          <xsl:value-of select="(@tests - @failures - @errors) div @tests" />
        </xsl:with-param>
      </xsl:call-template>
    </xsl:variable>
    <xsl:variable name="package.dir">
      <xsl:if test="not(@package = '')"><xsl:value-of select="translate(@package,'.','/')" /></xsl:if>
      <xsl:if test="@package = ''">.</xsl:if>
    </xsl:variable>
    <tr>
      <xsl:if test="@errors &gt; 0 or @failures &gt; 0">
        <xsl:attribute name="class"><xsl:value-of select="$errorRowClass"/></xsl:attribute>
      </xsl:if>
      <td>
        <a href="{$targetDirectory}/{$package.dir}/{@name}.html">
          <xsl:value-of select="@name" />
        </a>
      </td>
      <td><xsl:value-of select="$successRate" /></td>
      <td><xsl:value-of select="@tests" /></td>
      <td><xsl:value-of select="@failures" /></td>
      <td><xsl:value-of select="@errors" /></td>
      <td><xsl:value-of select="@time" /></td>
    </tr>
  </xsl:template>

  <xsl:template match="testsuite" mode="full_page">
    <!-- Template for individual test suites pages -->
    <xsl:variable name="package.dir">
      <xsl:if test="not(@package = '')"><xsl:value-of select="translate(@package,'.','/')" /></xsl:if>
      <xsl:if test="@package = ''">.</xsl:if>
    </xsl:variable>
    <xsl:result-document href="{$targetDirectory}/{$package.dir}/{@name}.html">
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
            <h2>
              <a target="_blank" href="{@name}_stacktrace.html"></a>
            </h2>
            <table class="table table-striped">
              <xsl:call-template name="testsuite.header"/>
              <tr>
               <td><xsl:value-of select="@name" /></td>
               <td><xsl:value-of select="@tests" /></td>
               <td><xsl:value-of select="@failures" /></td>
               <td><xsl:value-of select="@errors" /></td>
               <td><xsl:value-of select="@time" /></td>
              </tr>
            </table>
          </div>
          <div id="testFails" class="container">
            <h2>Failed tests</h2>
            <table class="table table-striped">
              <xsl:call-template name="testcase.header"/>
              <xsl:apply-templates select="testcase[./error or ./failure]" mode="table_entry" />
            </table>
          </div>
          <div id="testWins" class="container">
            <h2>Successful tests</h2>
            <table class="table table-striped">
              <xsl:call-template name="testcase.header"/>
              <xsl:apply-templates select="testcase[not(./error) and not(./failure)]" mode="table_entry" />
            </table>
          </div>
        </body>
      </html>
    </xsl:result-document>
    <xsl:apply-templates select="testcase" mode="full_page"/>
  </xsl:template>

  <xsl:template match="testsuite" mode="stack_trace">
    <xsl:variable name="package.dir">
      <xsl:if test="not(@package = '')">
        <xsl:value-of select="translate(@package,'.','/')" />
      </xsl:if>
      <xsl:if test="@package = ''">
        .
      </xsl:if>
    </xsl:variable>
    <xsl:result-document href="{$targetDirectory}/{$package.dir}/{@name}_stacktrace.html">
      <html>
        <head>
        </head>
        <body>
          <xsl:call-template name="br-replace">
            <xsl:with-param name="word">
              <xsl:call-template name="ocd-anchors-format">
                <xsl:with-param name="word" select="./system-out/text()" />
              </xsl:call-template>
            </xsl:with-param>
          </xsl:call-template>
          <xsl:call-template name="br-replace">
            <xsl:with-param name="word">
              <xsl:call-template name="ocd-anchors-format">
                <xsl:with-param name="word" select="./system-err/text()" />
              </xsl:call-template>
            </xsl:with-param>
          </xsl:call-template>
        </body>
      </html>
    </xsl:result-document>
  </xsl:template>

  <xsl:template name="testcase.header">
    <tr>
      <th>Name</th>
      <th>Status</th>
      <th>Message</th>
      <th>Time</th>
    </tr>
  </xsl:template>

  <xsl:template match="testcase" mode="table_entry">
    <xsl:variable name="rowClass">
      <xsl:if test="./error or ./failure"><xsl:value-of select="$errorRowClass" /></xsl:if>
    </xsl:variable>
    <xsl:variable name="status">
      <xsl:choose>
        <xsl:when test="./error or ./failure">Failed</xsl:when>
        <xsl:otherwise>Success</xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="testcaseHtmlPath">
        <xsl:call-template name="path"><xsl:with-param name="path" select="../@package"/></xsl:call-template><xsl:value-of select="replace(@classname, '\.','/')"/>/<xsl:value-of select="@name"/>.html
    </xsl:variable>
    <tr>
      <xsl:attribute name="class"><xsl:value-of select="$rowClass" /></xsl:attribute>
      <td>
        <a href="{$testcaseHtmlPath}">
          <xsl:value-of select="@name" />
        </a>
        <br/>
        <a target="_blank" href="{../@name}_stacktrace.html#{@name}">(view stacktrace)</a>
      </td>
      <td><xsl:value-of select="$status" /></td>
      <td><code><xsl:value-of select="./error/@message" /></code></td>
      <td><xsl:value-of select="@time" /></td>
    </tr>
  </xsl:template>

  <xsl:template match="testcase" mode="full_page">
    <xsl:variable name="rowClass">
      <xsl:if test="./error or ./failure"><xsl:value-of select="$errorRowClass" /></xsl:if>
    </xsl:variable>
    <xsl:variable name="status">
      <xsl:choose>
        <xsl:when test="./error or ./failure">Failed</xsl:when>
        <xsl:otherwise>Success</xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="package.dir">
      <xsl:if test="not(@classname = '')"><xsl:value-of select="translate(@classname,'.','/')" /></xsl:if>
      <xsl:if test="@classname = ''">.</xsl:if>
    </xsl:variable>
    <xsl:variable name="path.to.root">
      <xsl:call-template name="path">
        <xsl:with-param name="path"><xsl:value-of select="../@package"/></xsl:with-param>
      </xsl:call-template>
    </xsl:variable>
    <xsl:result-document href="{$targetDirectory}/{replace(@classname, '\.','/')}/{@name}.html">
      <html>
        <head>
          <title>Test case summary</title>
          <xsl:call-template name="css-links">
            <xsl:with-param name="package.path" select="$package.dir" />
          </xsl:call-template>
        </head>
        <body>

          <div id="testDetails" class="container">
            <h1><xsl:value-of select="@name" /></h1>
            <h2>
              <a target="_blank" href="{$path.to.root}../{translate(../@package,'.', '/')}/{../@name}_stacktrace.html#{@name}">
              (view stacktrace)
              </a>
            </h2>
            <table class="table table-striped" style="width: 1500px">
            <tr>
            <td>Name:</td>
            <td>Status:</td>
            <td>Time:</td>
            </tr>
              <tr>
               <td><xsl:value-of select="@name" /></td>
               <td><xsl:value-of select="$status" /></td>
               <td><xsl:value-of select="@time" /></td>
              </tr>
            </table>
          <xsl:if test="./error">
              <h2>Errors:</h2>
              <xsl:apply-templates select="error"/>
          </xsl:if>
          <xsl:if test="./failure">
              <h2>Failures:</h2>
              <xsl:apply-templates select="failure"/>
          </xsl:if>
          </div>
        </body>
      </html>
    </xsl:result-document>
  </xsl:template>

  <xsl:template match="error|failure">
  <table class="table" style="width: 1500px">
    <tr>
      <td>Type:</td>
      <td><xsl:value-of select="@type" /></td>
    </tr>
    <tr>
      <td>Message:</td>
      <td><code><xsl:value-of select="@message" /></code></td>
    </tr>
    <tr>
      <td>Text:</td>
      <td>
        <code>
        <xsl:call-template name="br-replace">
          <xsl:with-param name="word" select="./text()"/>
        </xsl:call-template>
        </code>
      </td>
    </tr>
  </table>
  </xsl:template>

  <!-- Utility templates -->

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
    <xsl:param name="tmp1" select="replace(string($string),'\','\\')" />
    <xsl:param name="tmp2"
      select="replace(string($tmp1),&quot;'&quot;,&quot;\&apos;&quot;)" />
    <xsl:value-of select="$tmp2" />
  </xsl:template>

  <!-- template that will convert a carriage return into a br tag @param word the text from
    which to convert CR to BR tag -->
  <xsl:template name="br-replace">
    <xsl:param name="word" />
    <xsl:choose>
      <xsl:when test="contains($word,'&#xA;')">
        <xsl:value-of select="substring-before($word,'&#xA;')" disable-output-escaping="yes"/>
        <br/>
        <xsl:call-template name="br-replace">
          <xsl:with-param name="word" select="substring-after($word,'&#xA;')" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$word" disable-output-escaping="yes"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>

  <xsl:template name="ocd-anchors-format">
    <xsl:param name="word" />
    <xsl:choose>
      <xsl:when test="contains($word,'OCD-OPEN-ANCHOR-END')">
        <xsl:value-of select="replace(substring-before($word,'OCD-OPEN-ANCHOR-END'), 'OCD-OPEN-ANCHOR-BEGIN (.*) ', '&lt;a id=&quot;$1&quot;&gt;&lt;h2&gt;$1&lt;/h2&gt;&lt;/a&gt;')" disable-output-escaping="yes"/>
        <xsl:call-template name="ocd-anchors-format">
          <xsl:with-param name="word" select="substring-after($word,'OCD-OPEN-ANCHOR-END')" />
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$word" disable-output-escaping="yes"/>
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

