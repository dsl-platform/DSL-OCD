package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneBinaries_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]],
    private var _calculatedNullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]],
    private var _persistedNullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneBinaries_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneBinaries_3("+ URI +")"

   def copy(nullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]] = this._nullableListOfOneBinaries): NullableListOfOneBinaries_3 = {

  require(nullableListOfOneBinaries ne null, "Null value was provided for property \"nullableListOfOneBinaries\"")
  if(nullableListOfOneBinaries.isDefined) require(nullableListOfOneBinaries.get ne null, "Null value was provided for property \"nullableListOfOneBinaries\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneBinaries)
    new NullableListOfOneBinaries_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneBinaries = nullableListOfOneBinaries, _calculatedNullableListOfOneBinaries = _calculatedNullableListOfOneBinaries, _persistedNullableListOfOneBinaries = _persistedNullableListOfOneBinaries)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneBinaries_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneBinaries = result._nullableListOfOneBinaries
    this._calculatedNullableListOfOneBinaries = result._calculatedNullableListOfOneBinaries
    this._persistedNullableListOfOneBinaries = result._persistedNullableListOfOneBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneBinaries_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBinaries")
  def nullableListOfOneBinaries = {
    _nullableListOfOneBinaries
  }

  def nullableListOfOneBinaries_= (value: Option[IndexedSeq[Array[Byte]]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneBinaries")
  def calculatedNullableListOfOneBinaries = {
    _calculatedNullableListOfOneBinaries
  }

  def calculatedNullableListOfOneBinaries_= (value: Option[IndexedSeq[Array[Byte]]]) {
    _calculatedNullableListOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneBinaries")
  def persistedNullableListOfOneBinaries = {
    _persistedNullableListOfOneBinaries
  }

  def persistedNullableListOfOneBinaries_= (value: Option[IndexedSeq[Array[Byte]]]) {
    _persistedNullableListOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneBinaries") nullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneBinaries") calculatedNullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneBinaries") persistedNullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneBinaries = nullableListOfOneBinaries, _calculatedNullableListOfOneBinaries = calculatedNullableListOfOneBinaries, _persistedNullableListOfOneBinaries = persistedNullableListOfOneBinaries)

}

object NullableListOfOneBinaries_3 extends AggregateRootCompanion[NullableListOfOneBinaries_3]{

  def apply(
    nullableListOfOneBinaries: Option[IndexedSeq[Array[Byte]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneBinaries)
    require(nullableListOfOneBinaries ne null, "Null value was provided for property \"nullableListOfOneBinaries\"")
    if (nullableListOfOneBinaries.isDefined) require(nullableListOfOneBinaries.get ne null, "Null value was provided for property \"nullableListOfOneBinaries\"")
    new NullableListOfOneBinaries_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneBinaries = nullableListOfOneBinaries
    , _calculatedNullableListOfOneBinaries = None
    , _persistedNullableListOfOneBinaries = None)
  }

}
