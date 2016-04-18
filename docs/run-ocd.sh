#!/bin/bash

bash -c '[ -d ~/.ivy2/cache/com.dslplatform.ocd ] && rm -rf ~/.ivy2/cache/com.dslplatform.ocd'
bash -c '[ -d DSL-OCD ] && rm -rf DSL-OCD'
bash -c '[ -d DSL-OCD-Target ] && rm -rf DSL-OCD-Target'

#git clone --depth 1 https://melezov@github.com/mentat-labs/DSL-OCD.git

DSL_SSH_OLD_HOME=$HOME
HOME=`pwd`/DSL-OCD-SSH
chown $USER. $HOME/.ssh -R
chmod 500 $HOME/.ssh
chmod 400 $HOME/.ssh/* -R
ssh -o StrictHostKeychecking=no github.com
eval `/usr/bin/ssh-agent`
ssh-add $HOME/.ssh/id_rsa
git clone --depth 1 ssh://git@github.com/mentat-labs/DSL-OCD.git
HOME=$DSL_SSH_OLD_HOME

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
