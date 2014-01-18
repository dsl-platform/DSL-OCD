package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableGuid_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableGuid: Option[java.util.UUID],
    private var _calculatedNullableGuid: Option[java.util.UUID],
    private var _persistedNullableGuid: Option[java.util.UUID]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableGuid_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableGuid_3("+ URI +")"

   def copy(nullableGuid: Option[java.util.UUID] = this._nullableGuid): NullableGuid_3 = {

  require(nullableGuid ne null, "Null value was provided for property \"nullableGuid\"")
  if(nullableGuid.isDefined) require(nullableGuid.get ne null, "Null value was provided for property \"nullableGuid\"")
    new NullableGuid_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableGuid = nullableGuid, _calculatedNullableGuid = _calculatedNullableGuid, _persistedNullableGuid = _persistedNullableGuid)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableGuid_3): this.type = {
    this._URI = result._URI
    this._nullableGuid = result._nullableGuid
    this._calculatedNullableGuid = result._calculatedNullableGuid
    this._persistedNullableGuid = result._persistedNullableGuid
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableGuid_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableGuid")
  def nullableGuid = {
    _nullableGuid
  }

  def nullableGuid_= (value: Option[java.util.UUID]) {
    _nullableGuid = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableGuid")
  def calculatedNullableGuid = {
    _calculatedNullableGuid
  }

  def calculatedNullableGuid_= (value: Option[java.util.UUID]) {
    _calculatedNullableGuid = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableGuid")
  def persistedNullableGuid = {
    _persistedNullableGuid
  }

  def persistedNullableGuid_= (value: Option[java.util.UUID]) {
    _persistedNullableGuid = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableGuid") nullableGuid: Option[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableGuid") calculatedNullableGuid: Option[java.util.UUID]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableGuid") persistedNullableGuid: Option[java.util.UUID]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableGuid = nullableGuid, _calculatedNullableGuid = calculatedNullableGuid, _persistedNullableGuid = persistedNullableGuid)

}

object NullableGuid_3 extends AggregateRootCompanion[NullableGuid_3]{

  def apply(
    nullableGuid: Option[java.util.UUID] = None
  ) = {
    require(nullableGuid ne null, "Null value was provided for property \"nullableGuid\"")
    if (nullableGuid.isDefined) require(nullableGuid.get ne null, "Null value was provided for property \"nullableGuid\"")
    new NullableGuid_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableGuid = nullableGuid
    , _calculatedNullableGuid = None
    , _persistedNullableGuid = None)
  }

}
