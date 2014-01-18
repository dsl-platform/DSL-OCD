package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneStringsWithMaxLengthOf9_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneStringsWithMaxLengthOf9: Array[String],
    private var _calculatedOneArrayOfOneStringsWithMaxLengthOf9: Array[String],
    private var _persistedOneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneStringsWithMaxLengthOf9_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneStringsWithMaxLengthOf9_4("+ URI +")"

   def copy(oneArrayOfOneStringsWithMaxLengthOf9: Array[String] = this._oneArrayOfOneStringsWithMaxLengthOf9): OneArrayOfOneStringsWithMaxLengthOf9_4 = {

  require(oneArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfOneStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkArrayLength(oneArrayOfOneStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStringsWithMaxLengthOf9)
    new OneArrayOfOneStringsWithMaxLengthOf9_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneStringsWithMaxLengthOf9 = oneArrayOfOneStringsWithMaxLengthOf9, _calculatedOneArrayOfOneStringsWithMaxLengthOf9 = _calculatedOneArrayOfOneStringsWithMaxLengthOf9, _persistedOneArrayOfOneStringsWithMaxLengthOf9 = _persistedOneArrayOfOneStringsWithMaxLengthOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneStringsWithMaxLengthOf9_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneStringsWithMaxLengthOf9 = result._oneArrayOfOneStringsWithMaxLengthOf9
    this._calculatedOneArrayOfOneStringsWithMaxLengthOf9 = result._calculatedOneArrayOfOneStringsWithMaxLengthOf9
    this._persistedOneArrayOfOneStringsWithMaxLengthOf9 = result._persistedOneArrayOfOneStringsWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneStringsWithMaxLengthOf9_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneStringsWithMaxLengthOf9 = {
    _oneArrayOfOneStringsWithMaxLengthOf9
  }

  def oneArrayOfOneStringsWithMaxLengthOf9_= (value: Array[String]) {
    com.dslplatform.api.Guards.checkArrayLength(value, 9)
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneStringsWithMaxLengthOf9")
  def calculatedOneArrayOfOneStringsWithMaxLengthOf9 = {
    _calculatedOneArrayOfOneStringsWithMaxLengthOf9
  }

  def calculatedOneArrayOfOneStringsWithMaxLengthOf9_= (value: Array[String]) {
    _calculatedOneArrayOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneStringsWithMaxLengthOf9")
  def persistedOneArrayOfOneStringsWithMaxLengthOf9 = {
    _persistedOneArrayOfOneStringsWithMaxLengthOf9
  }

  def persistedOneArrayOfOneStringsWithMaxLengthOf9_= (value: Array[String]) {
    _persistedOneArrayOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9") oneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneStringsWithMaxLengthOf9") calculatedOneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneStringsWithMaxLengthOf9") persistedOneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneStringsWithMaxLengthOf9 = if (oneArrayOfOneStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfOneStringsWithMaxLengthOf9, _calculatedOneArrayOfOneStringsWithMaxLengthOf9 = calculatedOneArrayOfOneStringsWithMaxLengthOf9, _persistedOneArrayOfOneStringsWithMaxLengthOf9 = persistedOneArrayOfOneStringsWithMaxLengthOf9)

}

object OneArrayOfOneStringsWithMaxLengthOf9_4 extends AggregateRootCompanion[OneArrayOfOneStringsWithMaxLengthOf9_4]{

  def apply(
    oneArrayOfOneStringsWithMaxLengthOf9: Array[String] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayLength(oneArrayOfOneStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStringsWithMaxLengthOf9)
    require(oneArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfOneStringsWithMaxLengthOf9\"")
    new OneArrayOfOneStringsWithMaxLengthOf9_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneStringsWithMaxLengthOf9 = oneArrayOfOneStringsWithMaxLengthOf9
    , _calculatedOneArrayOfOneStringsWithMaxLengthOf9 = Array.empty
    , _persistedOneArrayOfOneStringsWithMaxLengthOf9 = Array.empty)
  }

}
