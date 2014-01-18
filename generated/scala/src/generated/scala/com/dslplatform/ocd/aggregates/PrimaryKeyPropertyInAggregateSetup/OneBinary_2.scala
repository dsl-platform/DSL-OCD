package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneBinary_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneBinary: Array[Byte]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneBinary_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneBinary_2("+ URI +")"

   def copy(oneBinary: Array[Byte] = this._oneBinary): OneBinary_2 = {

  require(oneBinary ne null, "Null value was provided for property \"oneBinary\"")
    new OneBinary_2(_URI = this.URI, __locator = this.__locator, _oneBinary = oneBinary)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneBinary_2): this.type = {
    this._URI = result._URI
    this._oneBinary = result._oneBinary
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneBinary_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneBinary")
  def oneBinary = {
    _oneBinary
  }

  def oneBinary_= (value: Array[Byte]) {
    _oneBinary = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneBinary") oneBinary: Array[Byte]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneBinary = if (oneBinary == null) Array[Byte]() else oneBinary)

}

object OneBinary_2 extends AggregateRootCompanion[OneBinary_2]{

  def apply(
    oneBinary: Array[Byte] = Array[Byte]()
  ) = {
    require(oneBinary ne null, "Null value was provided for property \"oneBinary\"")
    new OneBinary_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneBinary = oneBinary)
  }

}
