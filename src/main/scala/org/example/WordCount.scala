package org.example

import org.apache.flinkx.api._
import org.apache.flinkx.api.serializers._

object WordCount {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val text = env.fromElements(
      "To be, or not to be,--that is the question:--",
      "Whether 'tis nobler in the mind to suffer",
      "The slings and arrows of outrageous fortune",
      "Or to take arms against a sea of troubles,"
    )

    text
      .flatMap(_.toLowerCase.split("\\W+"))
      .map((_, 1))
      .keyBy(_._1)
      .sum(1)
      .print()

    env.execute("wordCount")
  }

}
