package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneLong_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneLong: Long
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneLong_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneLong_2("+ URI +")"

   def copy(oneLong: Long = this._oneLong): OneLong_2 = {

    new OneLong_2(_URI = this.URI, __locator = this.__locator, _oneLong = oneLong)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneLong_2): this.type = {
    this._URI = result._URI
    this._oneLong = result._oneLong
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneLong_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneLong")
  def oneLong = {
    _oneLong
  }

  def oneLong_= (value: Long) {
    _oneLong = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneLong") oneLong: Long
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneLong = oneLong)

}

object OneLong_2 extends AggregateRootCompanion[OneLong_2]{

  def apply(
    oneLong: Long = 0
  ) = {
    new OneLong_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneLong = oneLong)
  }

}
