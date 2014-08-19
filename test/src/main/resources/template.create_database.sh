#!/bin/sh

DATABASE_NAME=${projectDatabaseName}
DATABASE_USER=ocduser
DATABASE_PASSWORD=ocdpassword

echo
echo "Creating the database..."
createdb -U postgres $DATABASE_NAME -O $DATABASE_USER
