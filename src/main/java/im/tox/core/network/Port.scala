package im.tox.core.network

import im.tox.core.typesafe.BoundedIntCompanion

/**
 * IP_Port stores an IP datastructure with a port.
 */
final case class Port private[network] (value: Int) extends AnyVal

object Port extends BoundedIntCompanion[Port](0, 0xffff) { // scalastyle:ignore magic.number

  def unsafeFromInt(value: Int): Port = new Port(value)
  def toInt(self: Port): Int = self.value

}
