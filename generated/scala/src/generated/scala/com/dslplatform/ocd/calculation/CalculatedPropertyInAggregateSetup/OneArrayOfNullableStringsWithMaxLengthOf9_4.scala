package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableStringsWithMaxLengthOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]],
    private var _calculatedOneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]],
    private var _persistedOneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableStringsWithMaxLengthOf9_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableStringsWithMaxLengthOf9_4("+ URI +")"

   def copy(oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]] = this._oneArrayOfNullableStringsWithMaxLengthOf9): OneArrayOfNullableStringsWithMaxLengthOf9_4 = {

  require(oneArrayOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfNullableStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkArrayOptionLength(oneArrayOfNullableStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStringsWithMaxLengthOf9)
    new OneArrayOfNullableStringsWithMaxLengthOf9_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableStringsWithMaxLengthOf9 = oneArrayOfNullableStringsWithMaxLengthOf9, _calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = _calculatedOneArrayOfNullableStringsWithMaxLengthOf9, _persistedOneArrayOfNullableStringsWithMaxLengthOf9 = _persistedOneArrayOfNullableStringsWithMaxLengthOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableStringsWithMaxLengthOf9_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableStringsWithMaxLengthOf9 = result._oneArrayOfNullableStringsWithMaxLengthOf9
    this._calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = result._calculatedOneArrayOfNullableStringsWithMaxLengthOf9
    this._persistedOneArrayOfNullableStringsWithMaxLengthOf9 = result._persistedOneArrayOfNullableStringsWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableStringsWithMaxLengthOf9_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStringsWithMaxLengthOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableStringsWithMaxLengthOf9 = {
    _oneArrayOfNullableStringsWithMaxLengthOf9
  }

  def oneArrayOfNullableStringsWithMaxLengthOf9_= (value: Array[Option[String]]) {
    com.dslplatform.api.Guards.checkArrayOptionLength(value, 9)
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableStringsWithMaxLengthOf9")
  def calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = {
    _calculatedOneArrayOfNullableStringsWithMaxLengthOf9
  }

  def calculatedOneArrayOfNullableStringsWithMaxLengthOf9_= (value: Array[Option[String]]) {
    _calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableStringsWithMaxLengthOf9")
  def persistedOneArrayOfNullableStringsWithMaxLengthOf9 = {
    _persistedOneArrayOfNullableStringsWithMaxLengthOf9
  }

  def persistedOneArrayOfNullableStringsWithMaxLengthOf9_= (value: Array[Option[String]]) {
    _persistedOneArrayOfNullableStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableStringsWithMaxLengthOf9") oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableStringsWithMaxLengthOf9") calculatedOneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableStringsWithMaxLengthOf9") persistedOneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableStringsWithMaxLengthOf9 = if (oneArrayOfNullableStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfNullableStringsWithMaxLengthOf9, _calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = calculatedOneArrayOfNullableStringsWithMaxLengthOf9, _persistedOneArrayOfNullableStringsWithMaxLengthOf9 = persistedOneArrayOfNullableStringsWithMaxLengthOf9)

}

object OneArrayOfNullableStringsWithMaxLengthOf9_4 extends AggregateRootCompanion[OneArrayOfNullableStringsWithMaxLengthOf9_4]{

  def apply(
    oneArrayOfNullableStringsWithMaxLengthOf9: Array[Option[String]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionLength(oneArrayOfNullableStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableStringsWithMaxLengthOf9)
    require(oneArrayOfNullableStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfNullableStringsWithMaxLengthOf9\"")
    new OneArrayOfNullableStringsWithMaxLengthOf9_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableStringsWithMaxLengthOf9 = oneArrayOfNullableStringsWithMaxLengthOf9
    , _calculatedOneArrayOfNullableStringsWithMaxLengthOf9 = Array.empty
    , _persistedOneArrayOfNullableStringsWithMaxLengthOf9 = Array.empty)
  }

}
