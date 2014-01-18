package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneGuids_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneGuids: Option[Set[java.util.UUID]],
    private var _calculatedNullableSetOfOneGuids: Option[Set[java.util.UUID]],
    private var _persistedNullableSetOfOneGuids: Option[Set[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneGuids_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneGuids_3("+ URI +")"

   def copy(nullableSetOfOneGuids: Option[Set[java.util.UUID]] = this._nullableSetOfOneGuids): NullableSetOfOneGuids_3 = {

  require(nullableSetOfOneGuids ne null, "Null value was provided for property \"nullableSetOfOneGuids\"")
  if(nullableSetOfOneGuids.isDefined) require(nullableSetOfOneGuids.get ne null, "Null value was provided for property \"nullableSetOfOneGuids\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneGuids)
    new NullableSetOfOneGuids_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneGuids = nullableSetOfOneGuids, _calculatedNullableSetOfOneGuids = _calculatedNullableSetOfOneGuids, _persistedNullableSetOfOneGuids = _persistedNullableSetOfOneGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneGuids_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneGuids = result._nullableSetOfOneGuids
    this._calculatedNullableSetOfOneGuids = result._calculatedNullableSetOfOneGuids
    this._persistedNullableSetOfOneGuids = result._persistedNullableSetOfOneGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfOneGuids_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneGuids")
  def nullableSetOfOneGuids = {
    _nullableSetOfOneGuids
  }

  def nullableSetOfOneGuids_= (value: Option[Set[java.util.UUID]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneGuids")
  def calculatedNullableSetOfOneGuids = {
    _calculatedNullableSetOfOneGuids
  }

  def calculatedNullableSetOfOneGuids_= (value: Option[Set[java.util.UUID]]) {
    _calculatedNullableSetOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneGuids")
  def persistedNullableSetOfOneGuids = {
    _persistedNullableSetOfOneGuids
  }

  def persistedNullableSetOfOneGuids_= (value: Option[Set[java.util.UUID]]) {
    _persistedNullableSetOfOneGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneGuids") nullableSetOfOneGuids: Option[Set[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfOneGuids") calculatedNullableSetOfOneGuids: Option[Set[java.util.UUID]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfOneGuids") persistedNullableSetOfOneGuids: Option[Set[java.util.UUID]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneGuids = nullableSetOfOneGuids, _calculatedNullableSetOfOneGuids = calculatedNullableSetOfOneGuids, _persistedNullableSetOfOneGuids = persistedNullableSetOfOneGuids)

}

object NullableSetOfOneGuids_3 extends AggregateRootCompanion[NullableSetOfOneGuids_3]{

  def apply(
    nullableSetOfOneGuids: Option[Set[java.util.UUID]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneGuids)
    require(nullableSetOfOneGuids ne null, "Null value was provided for property \"nullableSetOfOneGuids\"")
    if (nullableSetOfOneGuids.isDefined) require(nullableSetOfOneGuids.get ne null, "Null value was provided for property \"nullableSetOfOneGuids\"")
    new NullableSetOfOneGuids_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneGuids = nullableSetOfOneGuids
    , _calculatedNullableSetOfOneGuids = None
    , _persistedNullableSetOfOneGuids = None)
  }

}
