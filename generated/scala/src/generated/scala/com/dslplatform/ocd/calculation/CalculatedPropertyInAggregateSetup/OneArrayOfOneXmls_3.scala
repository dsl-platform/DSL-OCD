package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneXmls_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfOneXmls: Array[scala.xml.Elem],
    private var _calculatedOneArrayOfOneXmls: Array[scala.xml.Elem],
    private var _persistedOneArrayOfOneXmls: Array[scala.xml.Elem]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneXmls_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneXmls_3("+ URI +")"

   def copy(oneArrayOfOneXmls: Array[scala.xml.Elem] = this._oneArrayOfOneXmls): OneArrayOfOneXmls_3 = {

  require(oneArrayOfOneXmls ne null, "Null value was provided for property \"oneArrayOfOneXmls\"")
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneXmls)
    new OneArrayOfOneXmls_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfOneXmls = oneArrayOfOneXmls, _calculatedOneArrayOfOneXmls = _calculatedOneArrayOfOneXmls, _persistedOneArrayOfOneXmls = _persistedOneArrayOfOneXmls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneXmls_3): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneXmls = result._oneArrayOfOneXmls
    this._calculatedOneArrayOfOneXmls = result._calculatedOneArrayOfOneXmls
    this._persistedOneArrayOfOneXmls = result._persistedOneArrayOfOneXmls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfOneXmls_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneXmls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneXmls = {
    _oneArrayOfOneXmls
  }

  def oneArrayOfOneXmls_= (value: Array[scala.xml.Elem]) {
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneXmls")
  def calculatedOneArrayOfOneXmls = {
    _calculatedOneArrayOfOneXmls
  }

  def calculatedOneArrayOfOneXmls_= (value: Array[scala.xml.Elem]) {
    _calculatedOneArrayOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneXmls")
  def persistedOneArrayOfOneXmls = {
    _persistedOneArrayOfOneXmls
  }

  def persistedOneArrayOfOneXmls_= (value: Array[scala.xml.Elem]) {
    _persistedOneArrayOfOneXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneXmls") oneArrayOfOneXmls: Array[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfOneXmls") calculatedOneArrayOfOneXmls: Array[scala.xml.Elem]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfOneXmls") persistedOneArrayOfOneXmls: Array[scala.xml.Elem]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfOneXmls = if (oneArrayOfOneXmls == null) Array.empty else oneArrayOfOneXmls, _calculatedOneArrayOfOneXmls = calculatedOneArrayOfOneXmls, _persistedOneArrayOfOneXmls = persistedOneArrayOfOneXmls)

}

object OneArrayOfOneXmls_3 extends AggregateRootCompanion[OneArrayOfOneXmls_3]{

  def apply(
    oneArrayOfOneXmls: Array[scala.xml.Elem] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneXmls)
    require(oneArrayOfOneXmls ne null, "Null value was provided for property \"oneArrayOfOneXmls\"")
    new OneArrayOfOneXmls_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfOneXmls = oneArrayOfOneXmls
    , _calculatedOneArrayOfOneXmls = Array.empty
    , _persistedOneArrayOfOneXmls = Array.empty)
  }

}
