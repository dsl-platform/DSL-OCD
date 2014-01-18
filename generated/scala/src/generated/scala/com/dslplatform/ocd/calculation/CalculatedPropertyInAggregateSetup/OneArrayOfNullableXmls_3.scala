package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableXmls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableXmls: Array[Option[scala.xml.Elem]],
    private var _calculatedOneArrayOfNullableXmls: Array[Option[scala.xml.Elem]],
    private var _persistedOneArrayOfNullableXmls: Array[Option[scala.xml.Elem]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableXmls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableXmls_3("+ URI +")"

   def copy(oneArrayOfNullableXmls: Array[Option[scala.xml.Elem]] = this._oneArrayOfNullableXmls): OneArrayOfNullableXmls_3 = {

  require(oneArrayOfNullableXmls ne null, "Null value was provided for property \"oneArrayOfNullableXmls\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableXmls)
    new OneArrayOfNullableXmls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableXmls = oneArrayOfNullableXmls, _calculatedOneArrayOfNullableXmls = _calculatedOneArrayOfNullableXmls, _persistedOneArrayOfNullableXmls = _persistedOneArrayOfNullableXmls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableXmls_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableXmls = result._oneArrayOfNullableXmls
    this._calculatedOneArrayOfNullableXmls = result._calculatedOneArrayOfNullableXmls
    this._persistedOneArrayOfNullableXmls = result._persistedOneArrayOfNullableXmls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableXmls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableXmls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableXmls = {
    _oneArrayOfNullableXmls
  }

  def oneArrayOfNullableXmls_= (value: Array[Option[scala.xml.Elem]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableXmls")
  def calculatedOneArrayOfNullableXmls = {
    _calculatedOneArrayOfNullableXmls
  }

  def calculatedOneArrayOfNullableXmls_= (value: Array[Option[scala.xml.Elem]]) {
    _calculatedOneArrayOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableXmls")
  def persistedOneArrayOfNullableXmls = {
    _persistedOneArrayOfNullableXmls
  }

  def persistedOneArrayOfNullableXmls_= (value: Array[Option[scala.xml.Elem]]) {
    _persistedOneArrayOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableXmls") oneArrayOfNullableXmls: Array[Option[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableXmls") calculatedOneArrayOfNullableXmls: Array[Option[scala.xml.Elem]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableXmls") persistedOneArrayOfNullableXmls: Array[Option[scala.xml.Elem]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableXmls = if (oneArrayOfNullableXmls == null) Array.empty else oneArrayOfNullableXmls, _calculatedOneArrayOfNullableXmls = calculatedOneArrayOfNullableXmls, _persistedOneArrayOfNullableXmls = persistedOneArrayOfNullableXmls)

}

object OneArrayOfNullableXmls_3 extends AggregateRootCompanion[OneArrayOfNullableXmls_3]{

  def apply(
    oneArrayOfNullableXmls: Array[Option[scala.xml.Elem]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableXmls)
    require(oneArrayOfNullableXmls ne null, "Null value was provided for property \"oneArrayOfNullableXmls\"")
    new OneArrayOfNullableXmls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableXmls = oneArrayOfNullableXmls
    , _calculatedOneArrayOfNullableXmls = Array.empty
    , _persistedOneArrayOfNullableXmls = Array.empty)
  }

}
