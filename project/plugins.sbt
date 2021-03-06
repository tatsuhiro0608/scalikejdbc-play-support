resolvers ++= Seq(
  "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("org.scalariform"   % "sbt-scalariform" % "1.8.3")
addSbtPlugin("com.typesafe.play" % "sbt-plugin"      % "2.8.7")
addSbtPlugin("com.timushev.sbt"  % "sbt-updates"     % "0.5.1")
addSbtPlugin("com.github.sbt"    % "sbt-pgp"         % "2.1.2")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")
