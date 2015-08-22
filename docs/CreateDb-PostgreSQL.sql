DO
$$
BEGIN
  IF EXISTS (SELECT 1 FROM pg_database WHERE datname = 'Bero-Db')
  THEN RAISE NOTICE 'Database already exists'; 
  ELSE PERFORM dblink_exec('dbname=' || current_database(), 'CREATE DATABASE "Bero-Db"');
  END IF;
END
$$;
