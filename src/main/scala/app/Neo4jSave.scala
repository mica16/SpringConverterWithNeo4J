package app

import java.util.Date
import models.{Schedule, Meeting}
import org.springframework.context.support.ClassPathXmlApplicationContext
import repositories.MeetingRepository

object Main extends App {

  var meetingRepository: MeetingRepository = new ClassPathXmlApplicationContext("application-context.xml").getBean(classOf[MeetingRepository])

  val meeting = Meeting("michael", "MyMeeting", "for business", "business", Schedule(new Date(), new Date()))

  meetingRepository.save(meeting)
  Console.println("Michael's meeting has just been saved :" + meeting)

  val loadedMeeting = meetingRepository.findByPropertyValue("creator", "michael")
  Console.println("Michael's meeting has just been loaded :" + loadedMeeting)

  Console.println("We well notice that Schedule is null :( :" + loadedMeeting.schedule)


}