package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableGuids_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]],
    private var _calculatedNullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]],
    private var _persistedNullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableGuids_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableGuids_3("+ URI +")"

   def copy(nullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]] = this._nullableSetOfNullableGuids): NullableSetOfNullableGuids_3 = {

  require(nullableSetOfNullableGuids ne null, "Null value was provided for property \"nullableSetOfNullableGuids\"")
  if(nullableSetOfNullableGuids.isDefined) require(nullableSetOfNullableGuids.get ne null, "Null value was provided for property \"nullableSetOfNullableGuids\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableGuids)
    new NullableSetOfNullableGuids_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableGuids = nullableSetOfNullableGuids, _calculatedNullableSetOfNullableGuids = _calculatedNullableSetOfNullableGuids, _persistedNullableSetOfNullableGuids = _persistedNullableSetOfNullableGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableGuids_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableGuids = result._nullableSetOfNullableGuids
    this._calculatedNullableSetOfNullableGuids = result._calculatedNullableSetOfNullableGuids
    this._persistedNullableSetOfNullableGuids = result._persistedNullableSetOfNullableGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableGuids_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableGuids")
  def nullableSetOfNullableGuids = {
    _nullableSetOfNullableGuids
  }

  def nullableSetOfNullableGuids_= (value: Option[Set[Option[java.util.UUID]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableGuids")
  def calculatedNullableSetOfNullableGuids = {
    _calculatedNullableSetOfNullableGuids
  }

  def calculatedNullableSetOfNullableGuids_= (value: Option[Set[Option[java.util.UUID]]]) {
    _calculatedNullableSetOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableGuids")
  def persistedNullableSetOfNullableGuids = {
    _persistedNullableSetOfNullableGuids
  }

  def persistedNullableSetOfNullableGuids_= (value: Option[Set[Option[java.util.UUID]]]) {
    _persistedNullableSetOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableGuids") nullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableGuids") calculatedNullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableGuids") persistedNullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableGuids = nullableSetOfNullableGuids, _calculatedNullableSetOfNullableGuids = calculatedNullableSetOfNullableGuids, _persistedNullableSetOfNullableGuids = persistedNullableSetOfNullableGuids)

}

object NullableSetOfNullableGuids_3 extends AggregateRootCompanion[NullableSetOfNullableGuids_3]{

  def apply(
    nullableSetOfNullableGuids: Option[Set[Option[java.util.UUID]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableGuids)
    require(nullableSetOfNullableGuids ne null, "Null value was provided for property \"nullableSetOfNullableGuids\"")
    if (nullableSetOfNullableGuids.isDefined) require(nullableSetOfNullableGuids.get ne null, "Null value was provided for property \"nullableSetOfNullableGuids\"")
    new NullableSetOfNullableGuids_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableGuids = nullableSetOfNullableGuids
    , _calculatedNullableSetOfNullableGuids = None
    , _persistedNullableSetOfNullableGuids = None)
  }

}
