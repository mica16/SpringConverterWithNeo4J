package models

import org.springframework.core.convert.converter.Converter

class ScheduleConverter extends Converter[Schedule, String]{

  def convert(schedule: Schedule): String = {
    schedule.startSchedule + "=>" + schedule.endSchedule
  }

}
