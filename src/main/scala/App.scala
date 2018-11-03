import wvlet.airframe._

class App(val config: AppConfig) {
  def start: Unit = println("app started")
}
case class AppConfig(appName: String)

val d = newDesign.bind[AppConfig].toInstance(AppConfig("appname"))

d.build[App] { app =>
  println(app.config)
  app.start
}
