#!/bin/bash
cd ~
rm -rf DSL-OCD
git clone file:///var/www/DSL-OCD
cd DSL-OCD
cd ~/DSL-OCD/util/generator
sbt publish
cd ~/DSL-OCD/util/testing
sbt publish
cd ~/DSL-OCD/model/generator
sbt run
cd ~/DSL-OCD/model/kinds
sbt publish
cd ~/DSL-OCD/model/boxes
sbt publish
cd ~/DSL-OCD/model/types
sbt publish
cd ~/DSL-OCD/model/dsls
sbt publish
cd ~/DSL-OCD/model/javas
sbt publish
cd ~/DSL-OCD/model/java-asserts
sbt publish
cd ~/DSL-OCD/model/scalas
sbt publish
