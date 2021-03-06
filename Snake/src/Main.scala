package re._1r
package snake
package desktop

import core._

import sgl.{InputHelpersComponent, GameLoopStatisticsComponent}
import sgl.awt._
import sgl.awt.util._


/** Wire backend to the App here */
object Main extends AWTApp with AbstractApp
  with InputHelpersComponent with VerboseStdErrLoggingProvider {

  override val TargetFps = Some(60)

  override val frameDimension = (TotalWidth, TotalHeight)

}
