# Week 10 - Fixture exception recovery

## Aim

Handle one fixed malformed fixture record with a custom exception.

## Procedure

1. Treat three known records as accepted.
2. Check one malformed fixed record without the delimiter.
3. Catch the custom format exception and continue.
4. Compile, run, and compare output.

## Scope boundary

The malformed record is a test fixture, never user information.
