package models

import java.lang.{String, Long}
import org.springframework.data.neo4j.annotation.{NodeEntity, GraphId}
import java.util.Date
import utils.SpringDataShortAnnotations.Indexed

@NodeEntity
case class Meeting(@Indexed creator: String, @Indexed title: String, @Indexed description: String,
                 @Indexed activityType: String, @Indexed schedule: Schedule) {

  @GraphId private var _id: Long = _

  private def this() {
    this("unknown", "no title", "no description", "no activity type", Schedule(new Date(), new Date()))
    //dummy values in order to satisfy Scala's constructor syntax
  }

}