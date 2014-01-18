package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneStringsWithMaxLengthOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]],
    private var _calculatedNullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]],
    private var _persistedNullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneStringsWithMaxLengthOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneStringsWithMaxLengthOf9_3("+ URI +")"

   def copy(nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]] = this._nullableListOfOneStringsWithMaxLengthOf9): NullableListOfOneStringsWithMaxLengthOf9_3 = {

  require(nullableListOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableListOfOneStringsWithMaxLengthOf9\"")
  if(nullableListOfOneStringsWithMaxLengthOf9.isDefined) require(nullableListOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableListOfOneStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkCollectionLength(nullableListOfOneStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneStringsWithMaxLengthOf9)
    new NullableListOfOneStringsWithMaxLengthOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneStringsWithMaxLengthOf9 = nullableListOfOneStringsWithMaxLengthOf9, _calculatedNullableListOfOneStringsWithMaxLengthOf9 = _calculatedNullableListOfOneStringsWithMaxLengthOf9, _persistedNullableListOfOneStringsWithMaxLengthOf9 = _persistedNullableListOfOneStringsWithMaxLengthOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneStringsWithMaxLengthOf9_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneStringsWithMaxLengthOf9 = result._nullableListOfOneStringsWithMaxLengthOf9
    this._calculatedNullableListOfOneStringsWithMaxLengthOf9 = result._calculatedNullableListOfOneStringsWithMaxLengthOf9
    this._persistedNullableListOfOneStringsWithMaxLengthOf9 = result._persistedNullableListOfOneStringsWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneStringsWithMaxLengthOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStringsWithMaxLengthOf9")
  def nullableListOfOneStringsWithMaxLengthOf9 = {
    _nullableListOfOneStringsWithMaxLengthOf9
  }

  def nullableListOfOneStringsWithMaxLengthOf9_= (value: Option[IndexedSeq[String]]) {
    com.dslplatform.api.Guards.checkCollectionLength(value, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneStringsWithMaxLengthOf9")
  def calculatedNullableListOfOneStringsWithMaxLengthOf9 = {
    _calculatedNullableListOfOneStringsWithMaxLengthOf9
  }

  def calculatedNullableListOfOneStringsWithMaxLengthOf9_= (value: Option[IndexedSeq[String]]) {
    _calculatedNullableListOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneStringsWithMaxLengthOf9")
  def persistedNullableListOfOneStringsWithMaxLengthOf9 = {
    _persistedNullableListOfOneStringsWithMaxLengthOf9
  }

  def persistedNullableListOfOneStringsWithMaxLengthOf9_= (value: Option[IndexedSeq[String]]) {
    _persistedNullableListOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneStringsWithMaxLengthOf9") nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneStringsWithMaxLengthOf9") calculatedNullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneStringsWithMaxLengthOf9") persistedNullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneStringsWithMaxLengthOf9 = nullableListOfOneStringsWithMaxLengthOf9, _calculatedNullableListOfOneStringsWithMaxLengthOf9 = calculatedNullableListOfOneStringsWithMaxLengthOf9, _persistedNullableListOfOneStringsWithMaxLengthOf9 = persistedNullableListOfOneStringsWithMaxLengthOf9)

}

object NullableListOfOneStringsWithMaxLengthOf9_3 extends AggregateRootCompanion[NullableListOfOneStringsWithMaxLengthOf9_3]{

  def apply(
    nullableListOfOneStringsWithMaxLengthOf9: Option[IndexedSeq[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionLength(nullableListOfOneStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneStringsWithMaxLengthOf9)
    require(nullableListOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableListOfOneStringsWithMaxLengthOf9\"")
    if (nullableListOfOneStringsWithMaxLengthOf9.isDefined) require(nullableListOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableListOfOneStringsWithMaxLengthOf9\"")
    new NullableListOfOneStringsWithMaxLengthOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneStringsWithMaxLengthOf9 = nullableListOfOneStringsWithMaxLengthOf9
    , _calculatedNullableListOfOneStringsWithMaxLengthOf9 = None
    , _persistedNullableListOfOneStringsWithMaxLengthOf9 = None)
  }

}
