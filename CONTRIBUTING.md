
# Contributing Guidelines

Thank you for your interest in contributing to the Mario Progress Bar ! Please read, understand, and agree to the following before making your contribution. Please also ensure you have read and agreed to the [Code of Conduct](CODE_OF_CONDUCT.md).

If you have any issues or questions, please, do not hesitate to contact [the maintainer](https://github.com/KikiManjaro) of this plugin.

## Workflow

The workflow for this project is pretty standard:

```none
open issue and have it assigned to you
            │
            v
    fork repository
            │
            v
create feature/{issueNumber} or 
{fix/issueNumber} branch based off
   of the master branch
            |
            v
    commit to fix issue
            │
            v
open pull request to master branch
            │
            v
       code review<────────┐
            │   │          │
            │   └─> address feedback
            v
approved, merged, issue closed
            |
            v
approved, merged to master,
            │
            v
         deployed (Marketplace)
```

## Bug Reports

Please make sure all bug reports have not already been reported or fixed, and come with a clear description of the situation, effect, expected experience, and, if at all possible, steps to reproduce the bug.

## Feature Requests

Please make sure all feature requests are clear, concise, feasible, useful, and not already implemented or requested.

## Pull Requests

Pull requests for bugs or features are encouraged, but please open an issue first and ensure it has been discussed & approved. Your code will be reviewed as soon as possible; please be willing to accept feedback & and change your pull request as needed.

Also ensure that the plugin still runs properly after your changes — run `./gradlew runIde` to launch a sandboxed IDE with the plugin installed.

Ideally, we'd like to work with a branch-per-issue policy, as well as a one-commit-per-issue policy. Feel free to make a separate commit when addressing code review comments, or to amend your existing commit. If new commits are made, they may be squashed into the original before merging.

Preferably you should be using [signed commits](https://help.github.com/en/articles/signing-commits), although this is not required.

### Additional PR Information

* This plugin is written using Java 17 and the IntelliJ Platform SDK (since 1.9 / 2023.3). See `build.gradle` for the exact platform version. 
* Please also do your best to follow the existing code style. You may be asked to refactor your code if it does not match the existing style, in the interest of consistency.