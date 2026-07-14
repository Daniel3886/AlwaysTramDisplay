# AlwaysTramDisplay

## Local database

Start PostgreSQL:

```shell
docker compose up -d postgres
```

Run the application:

```shell
./gradlew bootRun
```

The default local connection is:

- Database: `gtfs_app`
- User: `gtfs_user`
- Password: `gtfs_password`
- Port: `5433`

Override the application defaults with `DB_URL`, `DB_USERNAME`, and
`DB_PASSWORD`. Override the Compose host port with `POSTGRES_PORT`; if you do,
also update `DB_URL`.

Liquibase applies `src/main/resources/db/changelog/db.changelog-master.yaml`
when the application starts. Hibernate is configured with `ddl-auto: validate`,
so schema changes must be added as new Liquibase changesets rather than generated
by Hibernate.

Run tests:

```shell
./gradlew test
```
