package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneGuid_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneGuid: java.util.UUID,
    private var _calculatedOneGuid: java.util.UUID,
    private var _persistedOneGuid: java.util.UUID
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneGuid_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneGuid_4("+ URI +")"

   def copy(oneGuid: java.util.UUID = this._oneGuid): OneGuid_4 = {

  require(oneGuid ne null, "Null value was provided for property \"oneGuid\"")
    new OneGuid_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneGuid = oneGuid, _calculatedOneGuid = _calculatedOneGuid, _persistedOneGuid = _persistedOneGuid)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneGuid_4): this.type = {
    this._URI = result._URI
    this._oneGuid = result._oneGuid
    this._calculatedOneGuid = result._calculatedOneGuid
    this._persistedOneGuid = result._persistedOneGuid
    this._ID = result._ID
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneGuid_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneGuid")
  def oneGuid = {
    _oneGuid
  }

  def oneGuid_= (value: java.util.UUID) {
    _oneGuid = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneGuid")
  def calculatedOneGuid = {
    _calculatedOneGuid
  }

  def calculatedOneGuid_= (value: java.util.UUID) {
    _calculatedOneGuid = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneGuid")
  def persistedOneGuid = {
    _persistedOneGuid
  }

  def persistedOneGuid_= (value: java.util.UUID) {
    _persistedOneGuid = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneGuid") oneGuid: java.util.UUID
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneGuid") calculatedOneGuid: java.util.UUID
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneGuid") persistedOneGuid: java.util.UUID
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneGuid = if (oneGuid == null) java.util.UUID.randomUUID else oneGuid, _calculatedOneGuid = if (calculatedOneGuid == null) java.util.UUID.randomUUID else calculatedOneGuid, _persistedOneGuid = if (persistedOneGuid == null) java.util.UUID.randomUUID else persistedOneGuid)

}

object OneGuid_4 extends AggregateRootCompanion[OneGuid_4]{

  def apply(
    oneGuid: java.util.UUID = java.util.UUID.randomUUID
  ) = {
    require(oneGuid ne null, "Null value was provided for property \"oneGuid\"")
    new OneGuid_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneGuid = oneGuid
    , _calculatedOneGuid = java.util.UUID.randomUUID
    , _persistedOneGuid = java.util.UUID.randomUUID)
  }

}
