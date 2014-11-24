TODO: Update, there've been changes since the last doc updata

## Overview

Generates a JUnit project for each DSL type. The test projects are
written into ${test-projects} directory loaded from the settings,
along with their respective Revenj instances and configuration.

The settings are loaded from

    /home/${user}/.config/DSL-OCD/ocd.config

## An example

Checkout https://github.com/hperadin/DSL-OCD-Example, and set your

    /home/${user}/.config/DSL-OCD/ocd.config

to something like this:

    model=/home/username/code/ocd/DSL-OCD/model
    test-projects=/home/username/code/ocd/DSL-OCD-Target

After running the test generator in:

	/src/main/scala/com/dslplatform/ocd/EntryPoint.scala

The tests will be generated per category in

    ${test-projects}

and the tooling required will be in:

    ${test-projects}/tools

After generating the tests enter a directory, e.g.:

    cd aggregates

you should have the directory structure something like:

    primary-single-Binary/
    primary-single-Boolean/
	...

For running the compilation script you need to have a postgres server
running at localhost:5432 (the username is 'ocduser', and the password
'ocdpassword').

Now You can compile and deploy individual test projects using the
scripts inside the project directories, for instance:

    cd primary-single-Boolean/
	bash create_database.sh
	bash compile_dsls.sh
	bash runRevenj.sh

