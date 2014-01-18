package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableStringsWithMaxLengthOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]],
    private var _calculatedNullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]],
    private var _persistedNullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableStringsWithMaxLengthOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableStringsWithMaxLengthOf9_3("+ URI +")"

   def copy(nullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]] = this._nullableArrayOfNullableStringsWithMaxLengthOf9): NullableArrayOfNullableStringsWithMaxLengthOf9_3 = {

  require(nullableArrayOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableArrayOfNullableStringsWithMaxLengthOf9\"")
  if(nullableArrayOfNullableStringsWithMaxLengthOf9.isDefined) require(nullableArrayOfNullableStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableArrayOfNullableStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkArrayOptionLength(nullableArrayOfNullableStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableStringsWithMaxLengthOf9)
    new NullableArrayOfNullableStringsWithMaxLengthOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableStringsWithMaxLengthOf9 = nullableArrayOfNullableStringsWithMaxLengthOf9, _calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = _calculatedNullableArrayOfNullableStringsWithMaxLengthOf9, _persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = _persistedNullableArrayOfNullableStringsWithMaxLengthOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableStringsWithMaxLengthOf9_3): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableStringsWithMaxLengthOf9 = result._nullableArrayOfNullableStringsWithMaxLengthOf9
    this._calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = result._calculatedNullableArrayOfNullableStringsWithMaxLengthOf9
    this._persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = result._persistedNullableArrayOfNullableStringsWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableStringsWithMaxLengthOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableStringsWithMaxLengthOf9")
  def nullableArrayOfNullableStringsWithMaxLengthOf9 = {
    _nullableArrayOfNullableStringsWithMaxLengthOf9
  }

  def nullableArrayOfNullableStringsWithMaxLengthOf9_= (value: Option[Array[Option[String]]]) {
    com.dslplatform.api.Guards.checkArrayOptionLength(value, 9)
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _nullableArrayOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableStringsWithMaxLengthOf9")
  def calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = {
    _calculatedNullableArrayOfNullableStringsWithMaxLengthOf9
  }

  def calculatedNullableArrayOfNullableStringsWithMaxLengthOf9_= (value: Option[Array[Option[String]]]) {
    _calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableStringsWithMaxLengthOf9")
  def persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = {
    _persistedNullableArrayOfNullableStringsWithMaxLengthOf9
  }

  def persistedNullableArrayOfNullableStringsWithMaxLengthOf9_= (value: Option[Array[Option[String]]]) {
    _persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableStringsWithMaxLengthOf9") nullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableArrayOfNullableStringsWithMaxLengthOf9") calculatedNullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableArrayOfNullableStringsWithMaxLengthOf9") persistedNullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableStringsWithMaxLengthOf9 = nullableArrayOfNullableStringsWithMaxLengthOf9, _calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = calculatedNullableArrayOfNullableStringsWithMaxLengthOf9, _persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = persistedNullableArrayOfNullableStringsWithMaxLengthOf9)

}

object NullableArrayOfNullableStringsWithMaxLengthOf9_3 extends AggregateRootCompanion[NullableArrayOfNullableStringsWithMaxLengthOf9_3]{

  def apply(
    nullableArrayOfNullableStringsWithMaxLengthOf9: Option[Array[Option[String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionLength(nullableArrayOfNullableStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(nullableArrayOfNullableStringsWithMaxLengthOf9)
    require(nullableArrayOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableArrayOfNullableStringsWithMaxLengthOf9\"")
    if (nullableArrayOfNullableStringsWithMaxLengthOf9.isDefined) require(nullableArrayOfNullableStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableArrayOfNullableStringsWithMaxLengthOf9\"")
    new NullableArrayOfNullableStringsWithMaxLengthOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableStringsWithMaxLengthOf9 = nullableArrayOfNullableStringsWithMaxLengthOf9
    , _calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 = None
    , _persistedNullableArrayOfNullableStringsWithMaxLengthOf9 = None)
  }

}
