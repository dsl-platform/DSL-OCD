#!/bin/bash

bash -c '[ -d ~/.ivy2/cache/com.dslplatform.ocd ] && rm -rf ~/.ivy2/cache/com.dslplatform.ocd'
bash -c '[ -d DSL-OCD ] && rm -rf DSL-OCD'
bash -c '[ -d DSL-OCD-Target ] && rm -rf DSL-OCD-Target'

git clone --depth 1 https://melezov@github.com/element-doo/DSL-OCD.git
cd DSL-OCD/test
sbt run

echo 'Tweak DSL-OCD-Target settings and press Enter to contiue'
read -n1 -r -p "Press any key to continue..." key

cd ../../DSL-OCD-Target
ant drop-db
ant all >report/linux-run.log 2>&1
ant report

cd report/site
7z a -r ../linux-run.zip *
