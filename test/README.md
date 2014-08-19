# Test

## Overview

Generates a JUnit project for each DSL type. The test projects are
written into ${test-projects} directory loaded from the settings,
along with their respective Revenj instances and configuration.

The settings are loaded from /home/${user}/.config/DSL-OCD/ocd.config

Example ocd.config:

## An example

Checkout https://github.com/hperadin/DSL-OCD-Example, and set your /home/${user}/.config/DSL-OCD/ocd.config to something like this:

  model=/home/username/code/ocd/DSL-OCD/model
  test-projects=/home/username/code/ocd/DSL-OCD-Example/projects

After running the test generator in:

	/src/main/scala/com/dslplatform/ocd/EntryPoint.scala

You will have the tests in the ${test-projects} directory.

After generating the tests enter e.g. the directory aggregates, you should have the directory structure something like:

    -rwxrwxr-x  1 hperadin hperadin  327 Aug 13 11:44 compile_all.sh*
    -rwxrwxr-x  1 hperadin hperadin  420 Jul 14 10:04 deploy_all.sh*
    drwxrwxr-x  6 hperadin hperadin 4096 Aug 19 16:37 primary-single-Binary/
    drwxrwxr-x  6 hperadin hperadin 4096 Aug 13 14:34 primary-single-Boolean/
	...

For running the compilation script you need to have a postgres server
running at localhost:5432 (the username is 'ocduser', and the password
'ocdpassword').

The compile_all.sh script enters every single test project, tries to
create the database, and to compile and download the DSLs, libs, etc.

The deploy_all.sh script deploys the revenj instances.
