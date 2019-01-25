(defproject metabase/sqlserver-driver "1.0.0-SNAPSHOT"
  :min-lein-version "2.5.0"

  :dependencies
  [[com.microsoft.sqlserver/mssql-jdbc "7.0.0.jre8"]]

  :profiles
  {:provided
   {:dependencies [[metabase-core "1.0.0-SNAPSHOT"]]}

   :uberjar
   {:auto-clean    true
    :aot           :all
    :javac-options ["-target" "1.8", "-source" "1.8"]
    :target-path   "target/%s"
    :uberjar-name  "sqlserver.metabase-driver.jar"}})
