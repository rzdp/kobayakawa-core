CREATE USER kobayakawa WITH PASSWORD 'p@ssw0rd' CREATEDB;
CREATE DATABASE kobayakawa_db WITH OWNER kobayakawa;
GRANT ALL PRIVILEGES ON DATABASE kobayakawa TO kobayakawa_db;
