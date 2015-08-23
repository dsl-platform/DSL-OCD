DSL-OCD: Opsesive-Compulsive Testing for DSL Platform
=====================================================

Prerequisites:

* `~/.config/DSL-OCD/nexus.config` - for downloading binary artifacts
* `~/.config/DSL-OCD/ocd.config` - for defining working directory (`DSL-OCD-Target`)
* SBT on path (for creating `DSL-OCD-Target`)
* Ant on path (for running tests)
* `OCDSUPERUSER` and `ocduser` accounts in the PostgreSQL cluster
* If testing against `::1` without Socket option on Windows, run `docs\firewall.bat`, `docs\firewall-rule.bat`

