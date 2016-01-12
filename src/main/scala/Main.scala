package invaliddependency

import akka.http.scaladsl.model.MediaTypes

object Main {

  val x = Map(
    "csv" -> MediaTypes.`text/csv`,
    "tsv" -> MediaTypes.`text/tab-separated-values`,
    "xml" -> MediaTypes.`application/xml`,
    "json" -> MediaTypes.`application/json`,
    "html" -> MediaTypes.`text/html`
  )
}
