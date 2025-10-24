# JSON API Caller

Java console utilities that demonstrate fetching, modelling, and composing JSON weather data with the Gson library. The project shows four common scenarios: calling a remote REST API, serialising domain objects to disk, deserialising JSON back into Java models, and building JSON programmatically.

## Table of Contents
- [Overview](#overview)
- [Key Features](#key-features)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [How to Run](#how-to-run)
- [Sample Data](#sample-data)
- [Extending the Project](#extending-the-project)

## Overview
- `Main1` invokes the Weatherstack REST API, parses the JSON payload with Gson, and maps it into strongly-typed domain classes (`Weather`, `Location`, `Current`).
- `Main2` creates an in-memory collection of weather readings and serialises it to a pretty-printed JSON file (`weathers.json`).
- `Main3` reads the generated JSON file into a `List<Weather>` to illustrate deserialisation with generic `TypeToken`.
- `Main4` assembles a JSON document manually via `JsonObject` and writes it to `rucni_upis.json`.

These examples are a handy reference when wiring JSON data into larger projects or when teaching API consumption with Java.

## Key Features
- Minimal Maven build targeting pure Java (no frameworks required).
- Gson 2.9 for both object mapping and low-level JSON tree construction.
- Reusable domain models for weather data (`Location`, `Current`, `Weather`) with meaningful `toString()` methods.
- Demonstrates working with HTTP (`HttpURLConnection`), file I/O, and collection generic types in the context of JSON processing.

## Project Structure
```
json-api-caller/
├── pom.xml                       # Maven build definition with Gson dependency
├── rucni_upis.json               # JSON produced by Main4 (manual construction)
├── weathers.json                 # JSON produced by Main2 (object serialisation)
└── src/main/java/
    ├── domain/
    │   ├── Current.java          # Weather conditions (temperature, wind, etc.)
    │   ├── Location.java         # City/country metadata
    │   └── Weather.java          # Wrapper combining location + current
    └── main/
        ├── Main1.java            # REST API call + mapping
        ├── Main2.java            # Serialise sample readings to JSON
        ├── Main3.java            # Read JSON back into Java objects
        └── Main4.java            # Build JSON via JsonObject
```

## Prerequisites
- Java Development Kit (JDK) 11 or newer.
- Maven 3.6+ (for building/running from the command line).
- Weatherstack API key (only required for `Main1`). Sign up for a free key at [weatherstack.com](https://weatherstack.com/) or swap in any JSON endpoint you prefer.

## Setup
1. Clone the repository and move into the project directory:
   ```bash
   git clone <your-fork-url>
   cd json-api-caller/json-api-caller
   ```
2. Build the project and download dependencies:
   ```bash
   mvn compile
   ```
3. For `Main1`, open `src/main/java/main/Main1.java` and set the `ACCESS_KEY` constant to your Weatherstack API key.

## How to Run
Compile once with Maven (`mvn package`), then run the desired entry point:

```bash
# Compile
mvn package

# Execute one of the examples
java -cp target/json-api-caller-1.0.0.jar main.Main1   # Remote API call
java -cp target/json-api-caller-1.0.0.jar main.Main2   # Write weathers.json
java -cp target/json-api-caller-1.0.0.jar main.Main3   # Read weathers.json
java -cp target/json-api-caller-1.0.0.jar main.Main4   # Write rucni_upis.json
```

> Tip: Run `Main2` before `Main3` so the `weathers.json` file exists. Each program logs its output to the console, making it easy to verify behaviour.

## Sample Data
- `weathers.json`: produced by `Main2`, contains an array of weather snapshots for New York and Los Angeles. Used as input for `Main3`.
- `rucni_upis.json`: produced by `Main4`, demonstrates manual JSON composition for a single location.
- You can safely delete and regenerate these files; they will be overwritten on the next run.

## Extending the Project
- Add additional domain fields (e.g., UV index, precipitation) and update the serialisation/deserialisation logic accordingly.
- Introduce tests with JUnit + AssertJ to verify the mapping behaviour.
- Swap `HttpURLConnection` for `HttpClient` (Java 11) or a third-party client like OkHttp for more ergonomic API interactions.
- Parameterise API location queries (e.g., read from command-line arguments) to turn `Main1` into a reusable CLI utility.
