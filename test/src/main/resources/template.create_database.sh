#!/bin/sh

DATABASE_NAME=${dbName}
DATABASE_USER=${dbUser}
DATABASE_PASSWORD=${dbPassword}

echo
echo "Creating the database..."
createdb -U postgres $DATABASE_NAME -O $DATABASE_USER
