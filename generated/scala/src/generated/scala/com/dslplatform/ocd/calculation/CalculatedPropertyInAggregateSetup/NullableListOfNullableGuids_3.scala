package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableGuids_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]],
    private var _calculatedNullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]],
    private var _persistedNullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableGuids_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableGuids_3("+ URI +")"

   def copy(nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]] = this._nullableListOfNullableGuids): NullableListOfNullableGuids_3 = {

  require(nullableListOfNullableGuids ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
  if(nullableListOfNullableGuids.isDefined) require(nullableListOfNullableGuids.get ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableGuids)
    new NullableListOfNullableGuids_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableGuids = nullableListOfNullableGuids, _calculatedNullableListOfNullableGuids = _calculatedNullableListOfNullableGuids, _persistedNullableListOfNullableGuids = _persistedNullableListOfNullableGuids)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableGuids_3): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableGuids = result._nullableListOfNullableGuids
    this._calculatedNullableListOfNullableGuids = result._calculatedNullableListOfNullableGuids
    this._persistedNullableListOfNullableGuids = result._persistedNullableListOfNullableGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfNullableGuids_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableGuids")
  def nullableListOfNullableGuids = {
    _nullableListOfNullableGuids
  }

  def nullableListOfNullableGuids_= (value: Option[IndexedSeq[Option[java.util.UUID]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableGuids")
  def calculatedNullableListOfNullableGuids = {
    _calculatedNullableListOfNullableGuids
  }

  def calculatedNullableListOfNullableGuids_= (value: Option[IndexedSeq[Option[java.util.UUID]]]) {
    _calculatedNullableListOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableGuids")
  def persistedNullableListOfNullableGuids = {
    _persistedNullableListOfNullableGuids
  }

  def persistedNullableListOfNullableGuids_= (value: Option[IndexedSeq[Option[java.util.UUID]]]) {
    _persistedNullableListOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableGuids") nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfNullableGuids") calculatedNullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfNullableGuids") persistedNullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableGuids = nullableListOfNullableGuids, _calculatedNullableListOfNullableGuids = calculatedNullableListOfNullableGuids, _persistedNullableListOfNullableGuids = persistedNullableListOfNullableGuids)

}

object NullableListOfNullableGuids_3 extends AggregateRootCompanion[NullableListOfNullableGuids_3]{

  def apply(
    nullableListOfNullableGuids: Option[IndexedSeq[Option[java.util.UUID]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableGuids)
    require(nullableListOfNullableGuids ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
    if (nullableListOfNullableGuids.isDefined) require(nullableListOfNullableGuids.get ne null, "Null value was provided for property \"nullableListOfNullableGuids\"")
    new NullableListOfNullableGuids_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableGuids = nullableListOfNullableGuids
    , _calculatedNullableListOfNullableGuids = None
    , _persistedNullableListOfNullableGuids = None)
  }

}
