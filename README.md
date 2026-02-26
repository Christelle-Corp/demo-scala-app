# Demo Scala App - GHAS Testing

**⚠️ WARNING: This repository contains intentionally vulnerable dependencies for security scanning demonstration purposes.**

## Purpose

This repository demonstrates GitHub Advanced Security (GHAS) Dependabot capabilities for Scala/SBT projects.

## Vulnerable Dependencies

This project includes the following known vulnerabilities:

- **log4j-core 2.14.1** - Log4Shell (CVE-2021-44228)
- **jackson-databind 2.9.8** - Deserialization vulnerabilities
- **snakeyaml 1.17** - CVE-2017-18640
- **commons-beanutils 1.9.2** - CVE-2014-0114

## Expected GHAS Behavior

When Dependabot is enabled, it should:
- Detect vulnerable dependencies listed in `build.sbt`
- Create security alerts
- Optionally create automated PRs to update dependencies

## Testing Notes

- SBT does not generate lock files by default
- Dependabot parses `build.sbt` directly for dependency detection
- This tests GHAS support for non-standard build systems

## DO NOT USE IN PRODUCTION

This code is for demonstration purposes only and should never be deployed to production environments.
