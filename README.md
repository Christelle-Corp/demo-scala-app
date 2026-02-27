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

**⚠️ Important:** GitHub Dependabot does not natively support SBT dependency detection. This repository demonstrates the **workaround** using the Dependency Submission API.

### How It Works

1. **GitHub Action** runs on push and weekly schedule
2. **Parses `build.sbt`** and extracts all dependencies
3. **Submits to GitHub** via Dependency Submission API
4. **Populates dependency graph** for Dependabot scanning
5. **Creates security alerts** for vulnerable dependencies

### Workflow File

See `.github/workflows/dependency-submission.yml` - uses the official Scala Center action:
- `scalacenter/sbt-dependency-submission@v2`
- Runs automatically on push and weekly schedule
- Can be triggered manually via Actions tab

### Testing Notes

- SBT does not generate lock files by default
- Native Dependabot support for SBT is limited/non-existent
- **This demonstrates the manual workaround process** required for non-standard build systems
- After the workflow runs, check **Insights > Dependency graph** to verify dependencies appear
- Dependabot alerts should appear within minutes after dependency submission

## DO NOT USE IN PRODUCTION

This code is for demonstration purposes only and should never be deployed to production environments.
