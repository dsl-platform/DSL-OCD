## Overview

Generates a JUnit project for each DSL type. The test projects are
written into ${test-projects} directory loaded from the settings,
along with their respective Revenj instances and configuration.

The settings are loaded from

    /home/${user}/.config/DSL-OCD/ocd.config

For running and compiling the tests you need to checkout https://github.com/hperadin/DSL-OCD-Example,
and set the ${test-projects} path to:

    DSL-OCD-Example/projects/

## An example

Checkout https://github.com/hperadin/DSL-OCD-Example, and set your

    /home/${user}/.config/DSL-OCD/ocd.config

to something like this:

    model=/home/username/code/ocd/DSL-OCD/model
    test-projects=/home/username/code/ocd/DSL-OCD-Example/projects

After running the test generator in:

	/src/main/scala/com/dslplatform/ocd/EntryPoint.scala

You will have the tests in the ${test-projects} directory.

After generating the tests enter e.g. the directory aggregates, you should have the directory structure something like:

    compile_all.sh
    deploy_all.sh
    primary-single-Binary/
    primary-single-Boolean/
	...

For running the compilation script you need to have a postgres server
running at localhost:5432 (the username is 'ocduser', and the password
'ocdpassword').

The compile_all.sh script enters every single test project, tries to
create the database, and to compile and download the DSLs, libs, etc.

The deploy_all.sh script deploys the revenj instances.

You can compile and deploy individual test projects using the scripts inside the project directories, for instance:

    cd primary-single-Boolean/
	bash create_database.sh
	bash compile_dsls.sh
	bash runRevenj.sh

