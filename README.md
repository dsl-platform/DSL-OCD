DSL-OCD: Obsessive-Compulsive Testing for DSL Platform
=====================================================

Introducation
-------------
**DSL-OCD** is a code generator for tests for [DSL Platform](https://dsl-platform.com/).

Tests are generated into _DSL-OCD-Target_.

**TODO**: todo

Prerequisites
-------------
### SBT ###
[SBT](http://www.scala-sbt.org/) needs to be on path for creating _DSL-OCD-Target_.

**TODO**: Instructions for installing.

### ANT ###
[Ant](http://ant.apache.org/) needs to be on the path for running tests.

**TODO**: Instructions for installing.

### Postgres ###
Assuming access to a [PostreSQL](http://www.postgresql.org/) cluster, create `OCDSUPERUSER` and `ocduser` roles:

    $ createuser -DIPRSUpostgres OCDSUPERUSER
    $ createuser -DIPRSUpostgres ocduser

Grant `SUPERUSER` to `OCDSUPERUSER`:

    $ psql
    postgres=# ALTER ROLE "OCDSUPERUSER" WITH SUPERUSER;

**This is a temporary hack**

Grant `SUPERUSER` to `ocduser`:

    $ psql
    postgres=# ALTER ROLE "ocduser" WITH SUPERUSER;

### Firewall ###
If testing on Windows run `docs\firewall.bat`, `docs\firewall-rule.bat`


CONFIGURATION
-------------
_DSL-OCD_ uses the following configuration files:

* `nexus.config` - repository settings (for downloading binary artifacts)
* `ocd.config` - code generator settings
* `test.config` - testing settings

They have to be located in `~/.config/DSL-OCD/`, where `~` is your HOME folder.

#### Nexus ####
`~/.config/DSL-OCD/nexus.config`:

    realm=Sonatype Nexus Repository Manager
    host=ngs.hr
    user=$$USERNAME$$
    password=$$PASSWORD$$

Where `$$USERNAME$$` and `$$PASSWORD$$` are your sonatype credentials.

#### OCD ####
`~/.config/DSL-OCD/ocd.config`:

    model=$$CODEDIR$$/DSL-OCD/model
    test-projects=$$CODEDIR$$/DSL-OCD-Target

Where `$$CODEDIR$$` is folder in which DSL-OCD is checked-out.

#### Test ####
`~/.config/DSL-OCD/test.config`:

    db-host=
    db-port=
    username=
    password=
    su-username=
    su-password=

These values configure the connection string test use to connect to the database.


RUNNING
-------
