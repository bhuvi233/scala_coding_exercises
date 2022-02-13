package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime, Month, LocalTime}


class Exercise004(var dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  def this(localDate: LocalDate) = {
    this(LocalDateTime.of(localDate, LocalTime.MIDNIGHT))
  }

  def getDateTimeWithGigaSecond: LocalDateTime = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40)
}
