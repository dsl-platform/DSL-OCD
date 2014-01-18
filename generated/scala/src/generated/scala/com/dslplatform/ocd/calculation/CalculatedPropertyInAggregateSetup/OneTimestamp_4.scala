package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneTimestamp_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneTimestamp: org.joda.time.DateTime,
    private var _calculatedOneTimestamp: org.joda.time.DateTime,
    private var _persistedOneTimestamp: org.joda.time.DateTime
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneTimestamp_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneTimestamp_4("+ URI +")"

   def copy(oneTimestamp: org.joda.time.DateTime = this._oneTimestamp): OneTimestamp_4 = {

  require(oneTimestamp ne null, "Null value was provided for property \"oneTimestamp\"")
    new OneTimestamp_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneTimestamp = oneTimestamp, _calculatedOneTimestamp = _calculatedOneTimestamp, _persistedOneTimestamp = _persistedOneTimestamp)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneTimestamp_4): this.type = {
    this._URI = result._URI
    this._oneTimestamp = result._oneTimestamp
    this._calculatedOneTimestamp = result._calculatedOneTimestamp
    this._persistedOneTimestamp = result._persistedOneTimestamp
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneTimestamp_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneTimestamp")
  def oneTimestamp = {
    _oneTimestamp
  }

  def oneTimestamp_= (value: org.joda.time.DateTime) {
    _oneTimestamp = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneTimestamp")
  def calculatedOneTimestamp = {
    _calculatedOneTimestamp
  }

  def calculatedOneTimestamp_= (value: org.joda.time.DateTime) {
    _calculatedOneTimestamp = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneTimestamp")
  def persistedOneTimestamp = {
    _persistedOneTimestamp
  }

  def persistedOneTimestamp_= (value: org.joda.time.DateTime) {
    _persistedOneTimestamp = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneTimestamp") oneTimestamp: org.joda.time.DateTime
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneTimestamp") calculatedOneTimestamp: org.joda.time.DateTime
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneTimestamp") persistedOneTimestamp: org.joda.time.DateTime
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneTimestamp = if (oneTimestamp == null) org.joda.time.DateTime.now else oneTimestamp, _calculatedOneTimestamp = if (calculatedOneTimestamp == null) org.joda.time.DateTime.now else calculatedOneTimestamp, _persistedOneTimestamp = if (persistedOneTimestamp == null) org.joda.time.DateTime.now else persistedOneTimestamp)

}

object OneTimestamp_4 extends AggregateRootCompanion[OneTimestamp_4]{

  def apply(
    oneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now
  ) = {
    require(oneTimestamp ne null, "Null value was provided for property \"oneTimestamp\"")
    new OneTimestamp_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneTimestamp = oneTimestamp
    , _calculatedOneTimestamp = org.joda.time.DateTime.now
    , _persistedOneTimestamp = org.joda.time.DateTime.now)
  }

}
