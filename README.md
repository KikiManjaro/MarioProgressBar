# MarioProgressBar

The Mario progress bar for IntelliJ IDEA and other JetBrains IDEs.

[![Version](https://img.shields.io/jetbrains/plugin/v/14708-mario-progress-bar)](https://plugins.jetbrains.com/plugin/14708-mario-progress-bar/versions)
[![Rating](https://img.shields.io/jetbrains/plugin/r/rating/14708-mario-progress-bar)](https://plugins.jetbrains.com/plugin/14708-mario-progress-bar/reviews)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/14708-mario-progress-bar)](https://plugins.jetbrains.com/plugin/14708-mario-progress-bar)
[![Build](https://img.shields.io/github/actions/workflow/status/KikiManjaro/MarioProgressBar/gradle-wrapper-validation.yml?label=wrapper%20validation)](https://github.com/KikiManjaro/MarioProgressBar/actions)
[![License](https://img.shields.io/github/license/KikiManjaro/MarioProgressBar)](LICENSE)
[![JetBrains Marketplace](https://img.shields.io/badge/JetBrains%20Marketplace-Mario%20Progress%20Bar-orange)](https://plugins.jetbrains.com/plugin/14708-mario-progress-bar)

A playful replacement for the default progress bar — Mario (or Luigi) runs across a brick wall for determinate tasks and a Koopa Shell bounces for indeterminate ones.

| Determinate (Mario) | Determinate (Luigi) | Indeterminate (Shell) |
|---|---|---|
| ![MarioDeterminateBar](https://i.imgur.com/3ry0GOy.gif) | ![LuigiDeterminateBar](https://i.imgur.com/CQPjfTb.gif) | ![MarioIndeterminateBar](https://i.imgur.com/fdUDmZI.gif) |

> Based on the [Nyan Progress Bar](https://github.com/batya239/NyanProgressBar) by Dmitry Batkovitch.

## Requirements

- IntelliJ IDEA 2023.3+ (or any JetBrains IDE with the same platform version) — see [CHANGELOG](CHANGELOG.md) for history.
- JDK 17 to build from source.

## Installation

### From JetBrains Marketplace (recommended)

1. Open **Settings / Preferences → Plugins → Marketplace**.
2. Search for **Mario Progress Bar**.
3. Click **Install** and restart the IDE.

Or install directly from the [Marketplace page](https://plugins.jetbrains.com/plugin/14708-mario-progress-bar).

### From disk (manual)

1. Download the latest release ZIP from [Releases](https://github.com/KikiManjaro/MarioProgressBar/releases) or build it (see below).
2. Go to **Settings → Plugins → ⚙ → Install Plugin from Disk…** and select the ZIP.
3. Restart the IDE.

### Build from source

```bash
git clone https://github.com/KikiManjaro/MarioProgressBar.git
cd MarioProgressBar
./gradlew buildPlugin   # output in build/distributions/
# or run a sandboxed IDE with the plugin:
./gradlew runIde
```

## Configuration

**Settings → Tools → Mario Progress Bar**

Pick your character — Mario or Luigi:

![PluginConfigurationPage](https://i.imgur.com/0o2t116.png)

## Compatibility

| Plugin version | Since build | Platform |
|---|---|---|
| 1.9 | 233 (2023.3) | 2023.3+ |
| 1.8 | 193 (2019.3) | 2019.3–2023.2 |
| earlier | — | see CHANGELOG |

## Changelog

See [CHANGELOG.md](CHANGELOG.md).

## Contributing

Contributions are very welcome! Please see our [contributing guidelines](CONTRIBUTING.md) and [code of conduct](CODE_OF_CONDUCT.md) to get started.

Quick start:
```bash
git checkout -b fix/123   # or feature/123
# make your change
./gradlew runIde          # smoke-test in a sandbox IDE
```

## Acknowledgements

### Sprites
* All sprites belong to Nintendo — sourced from [Spriters-Resource](https://www.spriters-resource.com/)

### Code
* Progress bar logic adapted from [Nyan Progress Bar](https://github.com/batya239/NyanProgressBar)
* Built on the [IntelliJ Platform SDK](https://plugins.jetbrains.com/docs/intellij/welcome.html)

### Misc
* GIF editing with [GIMP](https://www.gimp.org/)
* README inspired by [kagof/intellij-pokemon-progress](https://github.com/kagof/intellij-pokemon-progress)

---

[![Buy Me a Coffee](https://img.buymeacoffee.com/api/?url=aHR0cHM6Ly9pbWcuYnV5bWVhY29mZmVlLmNvbS9hcGkvP3VybD1hSFIwY0hNNkx5OWpaRzR1WW5WNWJXVmhZMjltWm1WbExtTnZiUzkxY0d4dllXUnpMM0J5YjJacGJHVmZjR2xqZEhWeVpYTXZNakF5TVM4d015ODBZekkwT0RnNE1XWmxOVE5pWmprM1lUa3pOV1EyTWk1d2JtYz0mc2l6ZT0zMDAmbmFtZT1raWtpbWFuamFybw==&creator=kikimanjaro&is_creating=creating%20mobile%20apps%20and%20plugins&design_code=1&design_color=%23ff813f&slug=kikimanjaro)](https://www.buymeacoffee.com/kikimanjaro)
