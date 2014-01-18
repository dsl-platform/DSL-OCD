package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneTimestamps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfOneTimestamps: Array[org.joda.time.DateTime]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneTimestamps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneTimestamps_2("+ URI +")"

   def copy(oneArrayOfOneTimestamps: Array[org.joda.time.DateTime] = this._oneArrayOfOneTimestamps): OneArrayOfOneTimestamps_2 = {

  require(oneArrayOfOneTimestamps ne null, "Null value was provided for property \"oneArrayOfOneTimestamps\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTimestamps)
    new OneArrayOfOneTimestamps_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfOneTimestamps = oneArrayOfOneTimestamps)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneTimestamps_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneTimestamps = result._oneArrayOfOneTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneTimestamps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfOneTimestamps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneTimestamps = {
    _oneArrayOfOneTimestamps
  }

  def oneArrayOfOneTimestamps_= (value: Array[org.joda.time.DateTime]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneTimestamps") oneArrayOfOneTimestamps: Array[org.joda.time.DateTime]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfOneTimestamps = if (oneArrayOfOneTimestamps == null) Array.empty else oneArrayOfOneTimestamps)

}

object OneArrayOfOneTimestamps_2 extends AggregateRootCompanion[OneArrayOfOneTimestamps_2]{

  def apply(
    oneArrayOfOneTimestamps: Array[org.joda.time.DateTime] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneTimestamps)
    require(oneArrayOfOneTimestamps ne null, "Null value was provided for property \"oneArrayOfOneTimestamps\"")
    new OneArrayOfOneTimestamps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfOneTimestamps = oneArrayOfOneTimestamps)
  }

}
