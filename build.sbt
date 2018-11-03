name := "airframe-sandbox"

version := "0.1"

scalaVersion := "2.12.7"

val AIRFRAME_VERSION = "0.68"

libraryDependencies ++= Seq(
  "org.wvlet.airframe" %% "airframe"              % AIRFRAME_VERSION, // Dependency injection
  "org.wvlet.airframe" %% "airframe-codec"        % AIRFRAME_VERSION, // MessagePack-based schema-on-read transcoder
  "org.wvlet.airframe" %% "airframe-config"       % AIRFRAME_VERSION, // YAML-based configuration
  "org.wvlet.airframe" %% "airframe-control"      % AIRFRAME_VERSION, // Library for retryable execution
  "org.wvlet.airframe" %% "airframe-http"         % AIRFRAME_VERSION, // HTTP REST API router
  "org.wvlet.airframe" %% "airframe-http-finagle" % AIRFRAME_VERSION, // HTTP server (Finagle backend)
  "org.wvlet.airframe" %% "airframe-jmx"          % AIRFRAME_VERSION, // JMX monitoring
  "org.wvlet.airframe" %% "airframe-jdbc"         % AIRFRAME_VERSION, // JDBC connection pool
  "org.wvlet.airframe" %% "airframe-json"         % AIRFRAME_VERSION, // Pure Scala JSON parser
  "org.wvlet.airframe" %% "airframe-log"          % AIRFRAME_VERSION, // Logging
  "org.wvlet.airframe" %% "airframe-metrics"      % AIRFRAME_VERSION, // Metrics units
  "org.wvlet.airframe" %% "airframe-msgpack"      % AIRFRAME_VERSION, // Pure-Scala MessagePack
  "org.wvlet.airframe" %% "airframe-opts"         % AIRFRAME_VERSION, // Command-line option parser
  "org.wvlet.airframe" %% "airframe-stream"       % AIRFRAME_VERSION, // Stream processing library
  "org.wvlet.airframe" %% "airframe-surface"      % AIRFRAME_VERSION, // Object surface inspector
  "org.wvlet.airframe" %% "airframe-tablet"       % AIRFRAME_VERSION  // Table data reader/writer
)
